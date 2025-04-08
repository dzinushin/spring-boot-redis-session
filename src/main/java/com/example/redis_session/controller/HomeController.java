package com.example.redis_session.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello(Principal principal, HttpSession httpSession) {
        return String.format("principal: %s sessionId: %s", principal.getName(), httpSession.getId());
    }

}
