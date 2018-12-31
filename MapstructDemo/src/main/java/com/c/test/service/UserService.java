package com.c.test.service;

import com.c.test.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    User findOne(Long l);

    Page<User> findAll(Pageable pageable);
}
