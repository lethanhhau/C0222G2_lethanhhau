package com.hau.controller.customer;

import com.hau.dto.customer.CustomerDto;
import com.hau.model.customer.Customer;
import com.hau.model.customer.CustomerType;
import com.hau.service.customer.ICustomerService;
import com.hau.service.customer_type.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private ICustomerTypeService iCustomerTypeService;


    // hứng dữ liệu (cụ thể ở đây là 1 cía list customerTypes) để bên view lấy và sử dụng
    @ModelAttribute("customerTypes")
    public List<CustomerType> customerTypes(){
        return this.iCustomerTypeService.findAllCustomerType();
    }



   /*
   @PageableDefault(value = 5) số lượng phần tử của 1 trang
   pageable chứa số trang điều kiện sắp xếp nhận từ view
   @RequestParam Dữ liệu dưới dang Key- Value(lấy searchParam(name bên ô input) bên view gửi sang)
   model khai báo để sử dụng model.addAttribute
    */
   @GetMapping("/list-customer")
    public String goHomeCustomer(@PageableDefault(value = 1) Pageable pageable, Model model,
                                 @RequestParam Optional<String> searchParam){
        /*
        gán giá trị searchValue = "" tránh trường hợp searchParam không có giá trị(khi mới vào chương
        trình mình chưa tìm kiếm) chương trình sẽ bị lỗi.
         */
        String searchValue = searchParam.orElse("");
        Iterable<Customer> customers = this.iCustomerService.findAll(pageable, searchValue);
        model.addAttribute("searchValue", searchValue);

       // model.addAttribute truyền dữ liệu sang view để hiển thị
        model.addAttribute("customers", customers);
        return "customer/list";
    }

    @GetMapping("/customer/delete/{id}")
    // @PathVariable lấy dữ liệu dưới dạng đường dẫn URL (ở đây là lấy id trên URL)
    public String delete(@PathVariable int id) {
        this.iCustomerService.remove(id);
        return "redirect:/list-customer";
    }

    @GetMapping("/customer/create")
    public String showCreate(Model model) {
        model.addAttribute("customerDto", new CustomerDto());
        return "customer/create";
    }


    /*
    @Valid Dùng để kiểm tra Validate
    @ModeAttribute dùng để hứng dữ liệu bên view gửi sang
    bindingResult Dùng để bắt lỗi.nếu có lỗi thì nó sẽ chạy vào bindingResult.
    redirectAttributes khai báo để sử dụng redirectAttributes.addFlashAttribute
     */
    @PostMapping("/customer/create")
    public String create(@Valid @ModelAttribute("customerDto")  CustomerDto customerDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes) {

        // dùng để custom validate nếu ko custom thì ko cần khai báo.
        new CustomerDto().validate(customerDto, bindingResult);
        if (bindingResult.hasErrors()){

            return "customer/create";
        }else {
            Customer customer = new Customer();
            // chuyển đối tượng customerDto về đối tượng customer để lưu
            BeanUtils.copyProperties(customerDto, customer);
            // add vào list customer
            this.iCustomerService.save(customer);
            // redirectAttributes.addFlashAttribute hiển thị tin nhắn (thông báo)
            redirectAttributes.addFlashAttribute("success", "Register success!");
            return "redirect:/list-customer";
        }
    }

    @GetMapping("/customer/edit/{id}")
    public String showEdit(@PathVariable int id, Model model) {
        Optional<Customer> customer = this.iCustomerService.findById(id);
        model.addAttribute("customer", customer);
        return "customer/edit";
    }

    @PostMapping("/customer/edit")
    public String edit(@ModelAttribute Customer customer) {
        this.iCustomerService.save(customer);
        return "redirect:/list-customer";
    }


}
