package group.check.controller;

import group.check.model.DetailsObjectOfControl;
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
public class DetailController {

    @Autowired
    private ChecksService checksService;

    @GetMapping(value = "/details")
    public ModelAndView allDetails() {
        List<DetailsObjectOfControl> details = checksService.allDetails();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("details");
        modelAndView.addObject("detailList", details);
        return modelAndView;
    }

    @GetMapping(value = "/details/edit")
    public ModelAndView editDetailsPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("detailsEdit");
        return modelAndView;
    }

    @GetMapping(value = "/details/edit/{id}")
    public ModelAndView editDetailsPage(@PathVariable("id") int id) {
        DetailsObjectOfControl details = checksService.getByDetailId(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("detailsEdit");
        modelAndView.addObject("details", details);
        return modelAndView;
    }

    @PostMapping(value = "/details/edit")
    public ModelAndView editDetails(@ModelAttribute("details") DetailsObjectOfControl details) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/details");
        checksService.edit(details);
        return modelAndView;
    }

    @GetMapping(value = "/details/add")
    public ModelAndView addDetailsPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("detailsEdit");
        return modelAndView;
    }

    @PostMapping(value = "/details/add")
    public ModelAndView addDetails(@ModelAttribute("details") DetailsObjectOfControl details){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/details");
        checksService.add(details);
        return modelAndView;
    }

    @GetMapping(value = "/details/delete/{id}")
    public ModelAndView deleteDetails(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/details");
        DetailsObjectOfControl details = checksService.getByDetailId(id);
        checksService.delete(details);
        return modelAndView;
    }
}
