package group.check.controller;

import group.check.model.ObjectsOfControl;
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
public class ObjectsOfControlController {

    @Autowired
    private ChecksService checksService;

    @GetMapping(value = "/objectsofcontrol")
    public ModelAndView allObjectsOfControl() {
        List<ObjectsOfControl> objectsOfControls = checksService.allObjectsOfControl();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("objectsOfControl");
        modelAndView.addObject("objectsOfControlList", objectsOfControls);
        return modelAndView;
    }

    @GetMapping(value = "/objectsofcontrol/edit")
    public ModelAndView editObjectsOfControlPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("objectsOfControlEdit");
        return modelAndView;
    }

    @GetMapping(value = "/objectsofcontrol/edit/{id}")
    public ModelAndView editObjectsOfControlPage(@PathVariable("id") int id) {
        ObjectsOfControl objectsOfControl = checksService.getByObjectOfControlId(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("objectsOfControlEdit");
        modelAndView.addObject("objectsOfControl", objectsOfControl);
        return modelAndView;
    }

    @PostMapping(value = "/objectsofcontrol/edit")
    public ModelAndView editObjectsOfControl(@ModelAttribute("objectsOfControl") ObjectsOfControl objectsOfControl) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/objectsofcontrol");
        checksService.edit(objectsOfControl);
        return modelAndView;
    }

    @GetMapping(value = "/objectsofcontrol/add")
    public ModelAndView addObjectsOfControlPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("objectsOfControlEdit");
        return modelAndView;
    }

    @PostMapping(value = "/objectsofcontrol/add")
    public ModelAndView addObjectsOfControl(@ModelAttribute("objectsOfControl") ObjectsOfControl objectsOfControl){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/objectsofcontrol");
        checksService.add(objectsOfControl);
        return modelAndView;
    }

    @GetMapping(value = "/objectsofcontrol/delete/{id}")
    public ModelAndView deleteObjectsOfControl(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/objectsofcontrol");
        ObjectsOfControl objectsOfControl = checksService.getByObjectOfControlId(id);
        checksService.delete(objectsOfControl);
        return modelAndView;
    }
}
