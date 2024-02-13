package rvt;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import rvt.temp.A;
import rvt.temp.B;
import rvt.temp.C;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class DefaultRestController {

    @RequestMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
    String getAllStudents() {
        // Student student = 
        // new Student("Jānis",
        // "Smith",
        // "j@s.lv",
        // "DP2-1");


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString("");
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    
}
