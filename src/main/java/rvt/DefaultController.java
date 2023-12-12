package rvt;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        CsvManager manager = new CsvManager(CsvManager.HOBBIES_FILE_PATH);
        ArrayList<String> hobbies = manager.getAllHobbies();

        String myName = "Peter";
        model.addAttribute("name", myName);
        ArrayList<String> hikingitems = new ArrayList<String>();
        hikingitems.add("water");
        hikingitems.add("piens");
        hikingitems.add("nazis");
        
        model.addAttribute("hikingitem", hikingitems);
        model.addAttribute("hobbies", hobbies);

        return "index";
    }


}
