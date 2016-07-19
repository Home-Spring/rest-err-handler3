package ua.com.itproekt.server.api;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class OauthAPI {

    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    protected HashMap<String, String> login() {
        HashMap<String, String> model = new HashMap<>();
        String name = "Login";
        model.put("oauth", name);

        return model;
    }

    @CrossOrigin
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
	protected HashMap<String, String> logout() {
        HashMap<String, String> model = new HashMap<>();
        String name = "Logout";
        model.put("oauth", name);

        return model;
	}

}