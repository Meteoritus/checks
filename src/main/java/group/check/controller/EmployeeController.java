package group.check.controller;

import group.check.model.Employee;
import group.check.service.ChecksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private ChecksService checksService;

    @GetMapping(value = "/employees")
    public ModelAndView allEmployees() {
        List<Employee> employees = checksService.allEmployees();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("employees");
        modelAndView.addObject("employeeList", employees);
        return modelAndView;
    }

    @GetMapping(value = "/employees/edit")
    public ModelAndView editEmployeePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("employeesEdit");
        return modelAndView;
    }

    @GetMapping(value = "/employees/edit/{id}")
    public ModelAndView editEmployeePage(@PathVariable("id") int id) {
        Employee employee = checksService.getByEmployeeId(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("employeeEdit");
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }

    @PostMapping(value = "/employees/edit")
    public ModelAndView editEmployee(@ModelAttribute("employee") Employee employee) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/employees");
        checksService.edit(employee);
        return modelAndView;
    }

    @GetMapping(value = "/employees/add")
    public ModelAndView addEmployeePage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("employeeEdit");
        return modelAndView;
    }

    @PostMapping(value = "/employees/add")
    public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/employees");
        checksService.add(employee);
        return modelAndView;
    }

    @GetMapping(value = "/employees/delete/{id}")
    public ModelAndView deleteEmployee(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/employees");
        Employee employee = checksService.getByEmployeeId(id);
        checksService.delete(employee);
        return modelAndView;
    }
}
