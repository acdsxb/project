package com.c.c;

import com.c.c.feign.ProducterFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private ProducterFeign producterFeign;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String getOrder(@PathVariable Long id) {
        return producterFeign.getOrder(id);
    }
}
