package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller


public class SkillsController {

    @RequestMapping(value = "text", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String html(@RequestParam String language,String languageTwo,String languageThree){
        return "<h1>"+
                "Skills Tracker"+
                "</h1>"+
                "<h2>"+"We have few skills we would like to learn.Here is the List!"+"</h2>"+
               "<ol>\n" +
                       "  <li>"+language+"</li>\n" +
                       "  <li>"+languageTwo+"</li>\n" +
                       "  <li>"+languageThree+"</li>\n"+
                       "</ol>";
    }

    @GetMapping("form")
    @ResponseBody
    public String form(){
        return "<html>" +

                "<body>" +

                "<form method='POST' action ='/text' >" +

                " <label for='name'>Name</label><br>"+
                "<div>"+
                "<input type='text' name='name' >" +
                "</div>"+

                "<br>"+
                "<label for='html'>First favorite language</label><br>"+
                "<div>"+
                "<select name='language'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JAVASCRIPT'>javascript</option>" +
                "<option value='PYTHON'>python</option>" +
                "<select>" +
                "</div>"+
                "<br>"+
                "<label for='html'>Second favorite language</label><br>"+

                "<div>"+
                "<select name='languageTwo'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JAVASCRIPT'>javascript</option>" +
                "<option value='PYTHON'>python</option>" +"\n"+
                "<select>" +
                "</div>"+

                "<br>"+
                "<label >third favorite language</label><br>"+
                "<div>"+
                "<select name='languageThree'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JAVASCRIPT'>javascript</option>" +
                "<option value='PYTHON'>python</option>" +
                "<select>" +
                "<div>"+
                "<br>"+
                "<input type= 'submit' value ='Submit'>" +
                "</div>"+
                "</form>"+

                "<body>" +

                "<html>";

    }


}
