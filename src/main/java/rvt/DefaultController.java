package rvt;

import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

import rvt.temp.A;
import rvt.temp.B;
import rvt.temp.C;

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

    @GetMapping(value = "/test")
    @ResponseBody
    public String testAction() {
    

            Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
            Book book2 = new Book("Robert Martin", "Clean Code", 1);
            Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
        
            CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
            CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
            CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);
        
            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);
            System.out.println(cd1);
            System.out.println(cd2);
            System.out.println(cd3);
            StringBuilder strBuil = new StringBuilder();
            strBuil.append(book1).append("<br>").append(book2).append("<hr>").append(book3).append("<hr>").append(cd1).append("<hr>").append(cd2).append("<hr>").append(cd3);


            Box box = new Box(10);

            box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
            box.add(new Book("Robert Martin", "Clean Code", 1));
            box.add(new Book("Kent Beck", "Test Driven Development", 0.7));
        
            box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
            box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
            box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        
            System.out.println(box);

            return box.toString();



        }
    }






//    public String testAction() {
        // ArrayList<Person> persons = new ArrayList<>();
        // persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        // persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        // printPersons(persons);
        // return "Test Action Completed";
    // }

    // private void printPersons(ArrayList<Person> persons) {
        // for (Person person : persons) {
            // System.out.println(person);
        // }
    // }
// }