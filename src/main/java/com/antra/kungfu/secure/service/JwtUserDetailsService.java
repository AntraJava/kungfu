package com.antra.kungfu.secure.service;

import com.antra.kungfu.exception.secure.UserNotActivatedException;
import com.antra.kungfu.model.pojo.User;
import com.antra.kungfu.repository.UserRepository;
import com.antra.kungfu.secure.factory.JwtUserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else if(!user.isActive()) {
            throw new UserNotActivatedException(String.format("user with username '%s' has not been activated.", username));
        } else {
            return JwtUserFactory.create(user);
        }
    }
}
