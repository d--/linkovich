package com.dashminus.linkovich.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class HelloWorldController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String sayHello(ModelMap model) {
        model.addAllAttributes([
                name: 'doofus',
                profession: 'dingus'
        ])
        'hello'
    }
}