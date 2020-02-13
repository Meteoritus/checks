package group.check.controller;


import group.check.model.*;
import group.check.service.ChecksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class ChecksController {

    @Autowired
    private ChecksService checksService;

    @GetMapping(value = "/")
    public ModelAndView allChecks() {
        List<Checks> allChecks = checksService.allChecks();
            List<Checks> checks = new ArrayList<Checks>();
            List<Plant> plants = new ArrayList<Plant>();
            List<DetailsObjectOfControl> details = new ArrayList<DetailsObjectOfControl>();
            List<Employee> inspectors = new ArrayList<Employee>();
            List<Employee> executors = new ArrayList<Employee>();
            List<ObjectsOfControl> objectsOfControls = new ArrayList<ObjectsOfControl>();
            Iterator it = allChecks.iterator();
            while (it.hasNext()) {
                Object rows[] = (Object[]) it.next();
                Checks check = (Checks) rows[0];
                Plant plant = (Plant) rows[1];
                DetailsObjectOfControl detail = (DetailsObjectOfControl) rows[2];
                Employee inspector = (Employee) rows[3];
                Employee executor = (Employee) rows[4];
                ObjectsOfControl objectsOfControl = (ObjectsOfControl) rows[5];
                checks.add(check);
                plants.add(plant);
                details.add(detail);
                inspectors.add(inspector);
                executors.add(executor);
                objectsOfControls.add(objectsOfControl);
            }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("checks");
        modelAndView.addObject("plantList", plants);
        modelAndView.addObject("checkList", checks);
        modelAndView.addObject("inspectorList", inspectors);
        modelAndView.addObject("executorList", executors);
        modelAndView.addObject("objectOfControlList", objectsOfControls);
        modelAndView.addObject("detailList", details);
        return modelAndView;
    }



}
