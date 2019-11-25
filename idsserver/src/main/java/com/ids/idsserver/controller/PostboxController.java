package com.ids.idsserver.controller;

import com.ids.idsserver.model.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostboxController {

    @RequestMapping(value = "/checkServerPost")
    public Postbox checkPostbox(){

        Postbox postbox = new Postbox();
        postbox.setAvailable(Boolean.TRUE);
        postbox.setMessage("You have christmas gift and new year surprise in your postbox");

        return postbox;

    }

}
