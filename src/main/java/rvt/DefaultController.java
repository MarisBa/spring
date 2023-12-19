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

        return new ModelAndView();

    }
   

}
