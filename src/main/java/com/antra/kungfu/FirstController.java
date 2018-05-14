package com.antra.kungfu;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/")
    public ResponseEntity<Object> getFirst() {
        return new ResponseEntity<Object>("Freedom 1234", HttpStatus.OK);
    }
}
