package group.check.controller;


import group.check.model.Employee;
import group.check.service.ChecksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ChecksController {

    @Autowired
    private ChecksService checksService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allEmployees(){
        List<Employee> employees = checksService.allEmployees();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("employees");
        modelAndView.addObject("employeeList", employees);
        return modelAndView;
    }


}
