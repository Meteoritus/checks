package group.check.controller;


import group.check.model.*;
import group.check.service.ChecksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class ChecksController {

    @Autowired
    private ChecksService checksService;

    @GetMapping(value = "/")
    public ModelAndView allChecks() {
        List<Checks> allChecks = checksService.allChecks();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("checks");
        modelAndView.addObject("checkList", allChecks);
        return modelAndView;
    }

    @GetMapping(value = "/check/edit")
    public ModelAndView editCheckPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("checkEdit");
        return modelAndView;
    }

    @GetMapping(value = "/check/edit/{id}")
    public ModelAndView editCheckPage(@PathVariable("id") int id) {
        Checks check = checksService.getByCheckId(id);
        List<Plant> plants = checksService.allPlants();
        List<Employee> inspectors = checksService.allInspectors();
        List<Employee> executors = checksService.allExecutors();
        List<ObjectsOfControl> objectsOfControls = checksService.allObjectsOfControl();
        List<DetailsObjectOfControl> details = checksService.allDetails();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("checkEdit");
        modelAndView.addObject("check", check);
        modelAndView.addObject("plants", plants);
        modelAndView.addObject("inspectors", inspectors);
        modelAndView.addObject("executors", executors);
        modelAndView.addObject("objectsOfControl", objectsOfControls);
        modelAndView.addObject("details", details);
        return modelAndView;
    }

    @PostMapping(value = "/check/edit")
    public ModelAndView editCheck(@ModelAttribute("check") Checks check) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        checksService.edit(check);
        return modelAndView;
    }

    @GetMapping(value = "/check/add")
    public ModelAndView addCheckPage(){
        List<Plant> plants = checksService.allPlants();
        List<Employee> inspectors = checksService.allInspectors();
        List<Employee> executors = checksService.allExecutors();
        List<ObjectsOfControl> objectsOfControls = checksService.allObjectsOfControl();
        List<DetailsObjectOfControl> details = checksService.allDetails();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("checkEdit");
        modelAndView.addObject("plants", plants);
        modelAndView.addObject("inspectors", inspectors);
        modelAndView.addObject("executors", executors);
        modelAndView.addObject("objectsOfControl", objectsOfControls);
        modelAndView.addObject("details", details);
        return modelAndView;
    }

    @PostMapping(value = "/check/add")
    public ModelAndView addCheck(@ModelAttribute("check") Checks check){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        checksService.add(check);
        return modelAndView;
    }

    @GetMapping(value = "/check/delete/{id}")
    public ModelAndView deleteCheck(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        Checks check = checksService.getByCheckId(id);
        checksService.delete(check);
        return modelAndView;
    }

}
