package ua.com.itproekt.gup.server.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import java.util.HashMap;

@Controller
public class GupController {

//    @RequestMapping(path={"/index", "/"}, method = RequestMethod.GET)
    @RequestMapping(value={"/index", "/"}, method = RequestMethod.GET)
    @ResponseBody
	protected HashMap<String, String> displayIndexMessage() {
        HashMap<String, String> model = new HashMap<>();
        String                   name = "Index";
        model.put("oauth", name);

        return model;
	}

//    @RequestMapping(path={"/hello"}, method = RequestMethod.GET)
    @RequestMapping(value={"/hello"}, method = RequestMethod.GET)
    @ResponseBody
    protected HashMap<String, String> displayHelloWorldMessage() {
        HashMap<String, String> model = new HashMap<>();
        String                   name = "Hello!!";
        model.put("oauth", name);

        return model;
    }

}