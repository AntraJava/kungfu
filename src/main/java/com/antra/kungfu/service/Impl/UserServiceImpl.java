package com.antra.kungfu.service.Impl;

import com.antra.kungfu.dto.UserRegisterDTO;
import com.antra.kungfu.model.UserFactory;
import com.antra.kungfu.model.pojo.User;
import com.antra.kungfu.repository.UserRepository;
import com.antra.kungfu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public User save(UserRegisterDTO userRegisterDTO) {
        return userRepository.save(UserFactory.getUserFromDTO(userRegisterDTO));
    }
}
