package com.c.pro;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
public class OrderController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getOrder(@PathVariable Long id) {
        return "producter id is : " + id;
    }
}
