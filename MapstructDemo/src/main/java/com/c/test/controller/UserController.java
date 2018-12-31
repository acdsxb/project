package com.c.test.controller;

import com.c.test.entity.User;
import com.c.test.service.UserService;
import com.c.test.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user控制器入口
 * @author chensubao
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/findOne")
    public ResponseEntity findOne() {
        return ResponseEntity.ok(userMapper.toDTO(userService.findOne(1L)));
    }

    @GetMapping
    public ResponseEntity findAll(@PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC) Pageable pageable){
        Page<User> page = userService.findAll(pageable);
        return ResponseEntity.ok(page.map(userMapper::toDTO));
    }
}
