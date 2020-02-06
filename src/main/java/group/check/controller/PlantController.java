package group.check.controller;

import group.check.model.Plant;
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
public class PlantController {

    @Autowired
    private ChecksService checksService;

    @GetMapping(value = "/plants")
    public ModelAndView allPlants() {
        List<Plant> plants = checksService.allPlants();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("plants");
        modelAndView.addObject("plantsList", plants);
        return modelAndView;
    }

    @GetMapping(value = "/plants/edit")
    public ModelAndView editPlantPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("plantsEdit");
        return modelAndView;
    }

    @GetMapping(value = "/plants/edit/{id}")
    public ModelAndView editPlantPage(@PathVariable("id") int id) {
        Plant plant = checksService.getByPlantId(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("plantsEdit");
        modelAndView.addObject("plant", plant);
        return modelAndView;
    }

    @PostMapping(value = "/plants/edit")
    public ModelAndView editPlant(@ModelAttribute("plant") Plant plant) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/plants");
        checksService.edit(plant);
        return modelAndView;
    }

    @GetMapping(value = "/plants/add")
    public ModelAndView addPlantPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("plantsEdit");
        return modelAndView;
    }

    @PostMapping(value = "/plants/add")
    public ModelAndView addPlant(@ModelAttribute("plant") Plant plant){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/plants");
        checksService.add(plant);
        return modelAndView;
    }

    @GetMapping(value = "/plants/delete/{id}")
    public ModelAndView deletePlant(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/plants");
        Plant plant = checksService.getByPlantId(id);
        checksService.delete(plant);
        return modelAndView;
    }
}
