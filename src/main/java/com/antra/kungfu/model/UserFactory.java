package com.antra.kungfu.model;

import com.antra.kungfu.dto.UserRegisterDTO;
import com.antra.kungfu.model.pojo.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

public class UserFactory {

    public static User getUserFromDTO(UserRegisterDTO userRegisterDTO) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(userRegisterDTO.getPassword());
        User user = new User(userRegisterDTO.getUsername(), hashedPassword, userRegisterDTO.getName(), userRegisterDTO.getEmail());
        List<String> authorities = new ArrayList<>();
        authorities.add("ROLE_USER");
        user.setAuthorities(authorities);
        return user;
    }
}
