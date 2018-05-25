package com.antra.kungfu.controller.user;

import com.antra.kungfu.dto.UserRegisterDTO;
import com.antra.kungfu.model.UserFactory;
import com.antra.kungfu.model.pojo.User;
import com.antra.kungfu.exception.pojo.InputNotValidExceptionResponse;
import com.antra.kungfu.repository.UserRepository;
import com.antra.kungfu.secure.util.JwtTokenUtil;
import com.antra.kungfu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserRestController {

    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private UserService userService;

    @Autowired
    @Qualifier("jwtUserDetailsService")
    private UserDetailsService userDetailsService;


    //register new user
    @PostMapping(value = "/user")
    public ResponseEntity<User> createUser(@RequestBody @Valid UserRegisterDTO userRegisterDTO) {
        userService.save(userRegisterDTO);
        return new ResponseEntity<User>(HttpStatus.CREATED);
    }

    /*
      update activity of users
     */
    @PutMapping(value = "/user")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<User> updateUsersAcitivity() {
        return null;
    }

    /*
     get all users information
     */
    @GetMapping(value = "/user")
    public ResponseEntity<User> retrieveAllUsers() {
        return null;
    }

    /*
    update user information according to user id
     */
    @PutMapping(value = "/user/{id}")
    public ResponseEntity<User> updateUserInformationById() {
        return null;
    }
}