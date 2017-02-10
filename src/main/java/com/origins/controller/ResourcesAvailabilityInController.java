package com.origins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Amila-Kumara on 02/02/2017.
 */
@Controller
public class ResourcesAvailabilityInController {

    @RequestMapping("/resourcesAvailabilityIn")
    @CrossOrigin(origins = "*")
    public String welcome(final ModelMap model) {
        return "resourcesAvailabilityIn";
    }

}