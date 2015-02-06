package helloweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
    
    private String startmessage="start";
   
    @RequestMapping("form")
    public String viewLoginPage(Model model){  
          model.addAttribute("message", startmessage);
        return "form";
    }
    
    @RequestMapping(value = "form", method = RequestMethod.POST)
    public String login(
            @RequestParam(value = "input1", required = true) String input1,
            @RequestParam(value = "input2", required = true) String input2,
            Model model) {

// if the input1 and input2 required values don't match what was sent from form.jsp redirect back to 
//form.jsp

        if(!(input1.equals("good") && input2.equals("stuff"))) {
            startmessage="give new input";
            return "redirect:form";        
        }

//otherwise we return jsp page hello

            model.addAttribute("message", "input match");
            return "hello";
        
    }

}