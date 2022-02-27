package com.gfg.java_webinar.service;

import com.gfg.java_webinar.dto.UserDTO;
import com.gfg.java_webinar.model.User;
import org.springframework.stereotype.Service;


public interface UserService {
    public void saveUser(UserDTO userDTO);


    User getById(UserDTO userDTO);
}
