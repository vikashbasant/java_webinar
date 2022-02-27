package com.gfg.java_webinar.service;

import com.gfg.java_webinar.dto.UserDTO;
import com.gfg.java_webinar.model.User;
import com.gfg.java_webinar.repository.UserRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepositroy userRepositroy;

    @Override
    public void saveUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setContactNO(userDTO.getContactNO());
        userRepositroy.save(user);
    }
}
