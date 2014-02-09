package com.dashminus.linkovich.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("/hi")
class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET)
    String printHiThere(ModelMap model) {
        model.addAttribute('model', [
                words: ['hello', 'world']
        ])
        'soy:linkovich.demo.hello'
    }
}
