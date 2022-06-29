package com.hau.controller.employee;

import com.hau.dto.emplooyee.EmployeeDto;;
import com.hau.model.customer.CustomerType;
import com.hau.model.employee.Division;
import com.hau.model.employee.EducationDegree;
import com.hau.model.employee.Employee;
import com.hau.model.employee.Position;
import com.hau.service.division.IDivisionService;
import com.hau.service.education_degree.IEducationDegreeService;
import com.hau.service.employee.IEmployeeService;
import com.hau.service.position.IPositionService;
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
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @Autowired
    private IDivisionService iDivisionService;

    @Autowired
    private IEducationDegreeService iEducationDegreeService;

    @Autowired
    private IPositionService iPositionService;

    @ModelAttribute("divisions")
    public List<Division> divisions() {
        return this.iDivisionService.findAllDivision();
    }

    @ModelAttribute("educationDegrees")
    public List<EducationDegree> educationDegrees() {
        return this.iEducationDegreeService.findAllEducationDegree();
    }

    @ModelAttribute("positions")
    public List<Position> positions() {
        return this.iPositionService.findAllPosition();
    }

    @GetMapping("/home")
    public String goHomeEmployee(@PageableDefault(value = 5) Pageable pageable, Model model,
                                 @RequestParam Optional<String> searchParam) {
        String searchValue = searchParam.orElse("");
        Iterable<Employee> employees = this.iEmployeeService.findAll(pageable, searchValue);
        model.addAttribute("searchValue", searchValue);
        model.addAttribute("employees", employees);
        return "employee/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        this.iEmployeeService.remove(id);
        return "redirect:/employee/home";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("employeeDto", new EmployeeDto());
        return "employee/create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("EmployeeDto") EmployeeDto employeeDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes,
                         Model model) {
        new EmployeeDto().validate(employeeDto, bindingResult);
        if (bindingResult.hasErrors()) {
                this.iPositionService.findAllPosition();
                this.iEducationDegreeService.findAllEducationDegree();
                this.iDivisionService.findAllDivision();
            return "employee/create";
        } else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDto, employee);
            this.iEmployeeService.save(employee);
            redirectAttributes.addFlashAttribute("success", "Register success!");
            return "redirect:/employee/home";
        }
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable int id, Model model) {
        Optional<Employee> employee = this.iEmployeeService.findById(id);
        model.addAttribute("employee", employee);
            model.addAttribute("positions",this.iPositionService.findAllPosition());
            model.addAttribute("educationDegrees",this.iEducationDegreeService.findAllEducationDegree());
            model.addAttribute("divisions",this.iDivisionService.findAllDivision());
        return "employee/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Employee employee) {
        this.iEmployeeService.save(employee);
        return "redirect:/employee/home";
    }

}
