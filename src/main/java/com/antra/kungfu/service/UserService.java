package com.antra.kungfu.service;

import com.antra.kungfu.dto.UserRegisterDTO;
import com.antra.kungfu.model.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User save(UserRegisterDTO userRegisterDTO);
}
