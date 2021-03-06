package com.microservices_app.userservice.modules.user.mapper;

import com.microservices_app.userservice.modules.user.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserMapper {

    User getUserByUsername(String username);

    User getUserInfoById(String id);
}