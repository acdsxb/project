package com.c.c.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "producter")
public interface ProducterFeign {

    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    String getOrder(@PathVariable Long id);
}
