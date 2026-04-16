package com.filipe.resource.server.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceServerController {

    // Se não informar um token de acesso vai receber um 401
    @GetMapping( "/hello" )
    public String hello(@AuthenticationPrincipal Jwt jwt){
        return "Hello world! " + jwt.getTokenValue();
    }
}
