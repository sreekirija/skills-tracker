package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping()
    public String hello(){
        return "<html>" +
            "<body>" +
            "<h1>Skills Tracker</h1>" +
            "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
            "<ol>" +
            "<li>Java</li>" +
            "<li>JavaScript</li>" +
            "<li>Python</li>" +
            "</ol>" +
            "</body>" +
            "</html>";
    }



   @GetMapping("form")
    public String form(){
        return "<html>" +
                "<body>" +
                "<form method='post' action = '/hello'>" +
                "<p>Name:<br><input type='text' name='name'/></p>" +
                "<p>My favourite language:<br><select name = 'favorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select></p>" +
                "<p>My second favourite language:<br><select name = 'secondFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select></p>" +
                "<p>My third favourite language:<br><select name = 'thirdFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select></p>" +
                "<input type='submit' value = 'Submit'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("hello")
    public String hello(@RequestParam String name, String favorite, String secondFavorite, String thirdFavorite){
        return "<html>" +
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<ol>" +
                "<li>"+favorite+"</li>" +
                "<li>"+secondFavorite+"</li>" +
                "<li>"+thirdFavorite+"</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}




