package templates;

import com.hau.model.employee.Employee;
import com.hau.service.division.IDivisionService;
import com.hau.service.education_degree.IEducationDegreeService;
import com.hau.service.employee.IEmployeeService;
import com.hau.service.position.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
public class EmployeeRestController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @Autowired
    private IDivisionService iDivisionService;

    @Autowired
    private IEducationDegreeService iEducationDegreeService;

    @Autowired
    private IPositionService iPositionService;

    @GetMapping( "/employeeRest-list")
    public ResponseEntity<Iterable<Employee>> getPageEmployee(@PageableDefault(value = 3) Pageable pageable, Model model,
                                                              @RequestParam Optional<String> searchValue) {
        String searchParam = searchValue.orElse("");
        Iterable<Employee> employees = this.iEmployeeService.findAll(pageable, searchParam);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }


    @PostMapping("/employee-create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/employee-delete/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable Integer id) {
        System.out.println(id);
        Optional<Employee> employeeOptional = this.iEmployeeService.findById(id);
        if (!employeeOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        this.iEmployeeService.remove(id);
        return new ResponseEntity<>(employeeOptional.get(), HttpStatus.NO_CONTENT);
    }

}
