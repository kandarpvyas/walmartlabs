package com.walmartlabs.demo.Controller;

import com.walmartlabs.demo.Service.LoginUserService;
import com.walmartlabs.demo.Service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginUserController {

    @Autowired
    LoginUserService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {

        if (name.equals("") && password.equals("")) {
            model.put("errorMessage", "Username and Password is required");
            return "login";
        } else if (name.equals("")) {
            model.put("errorMessage", "Username is required");
            return "login";
        } else if (password.equals("")) {
            model.put("errorMessage", "Password is required");
            return "login";
        } else {
            boolean isValidUser = service.validateUser(name, password);
            if (!isValidUser) {
                model.put("errorMessage", "Invalid Credentials");
                return "login";
            } else {
                model.put("name", name);
                model.put("password", password);

                 return "tasks";
                //return this.tasksController.showTasksListPage(model);
                //return "redirect:/tasksList";

            }

        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String showLogoutPage(ModelMap model) {
        return "login";
    }
}
