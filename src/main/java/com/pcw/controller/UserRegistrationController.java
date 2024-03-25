package com.pcw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

@Controller
@SessionAttributes({"emailAddress", "password", "firstName", "lastName"})
public class UserRegistrationController {

    @RequestMapping("/registerUser1.htm")
    public String registerUser1(WebRequest request, ModelMap modelMap) {

        request.getParameterMap().forEach(modelMap::addAttribute);
        return "register-user2";
    }

    @RequestMapping("/registerUser2.htm")
    public String registerUser2(WebRequest request,
                                @SessionAttribute("emailAddress") String emailAddress, //#access from session
                                @SessionAttribute("password") String password,
                                @SessionAttribute("firstName") String firstName,
                                @SessionAttribute("lastName") String lastName,
                                SessionStatus sessionStatus,
                                ModelMap modelMap) {
        String identificationType = request.getParameter("identificationType");
        String identificationNo = request.getParameter("identificationNo");

        // insert httpSession data along with request data into database
        modelMap.addAttribute("identificationType", identificationType);
        modelMap.addAttribute("identificationNo", identificationNo);

        sessionStatus.setComplete();

        return "user-details";
    }
}

