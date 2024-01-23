package rvt;

import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        CsvManager manager = new CsvManager(CsvManager.HOBBIES_FILE_PATH);
        ArrayList<HashMap> hobbies = manager.getAllHobbies();

        model.addAttribute("hobbies", hobbies);

        return "index";
    }

    @GetMapping(value = "/about")
    ModelAndView about(@RequestParam HashMap<String,String> allParams) {

        ModelAndView modelAndView = new ModelAndView("about");

        System.out.println(allParams.get("name"));
        System.err.println(allParams.get("surname"));;
        System.out.println(allParams.get("age"));
        System.out.println(allParams.get("hobbies"));
        allParams.get("name");

        return new ModelAndView();

    }
    @GetMapping("/test")
    public ModelAndView testAction() {
        // Assuming SomeData is a class you've define

        Money mon1 = new Money(5);
        Money mon2 = new Money(5);

        boolean equals = mon1.equals(mon2);

        ModelAndView modelAndView = new ModelAndView("test");
        modelAndView.addObject("isEquals", equals);

        return modelAndView;
    }
}
