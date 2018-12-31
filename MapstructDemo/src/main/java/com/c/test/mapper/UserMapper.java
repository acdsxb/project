package com.c.test.mapper;

import com.c.test.DTO.UserDTO;
import com.c.test.entity.User;
import org.mapstruct.Mapper;

/**
 * userMapper接口类
 * 继承EntityMapper
 * @author -c
 */
@Mapper
public interface UserMapper extends EntityMapper<UserDTO, User>{
}
