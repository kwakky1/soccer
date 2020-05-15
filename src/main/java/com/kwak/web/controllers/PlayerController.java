package com.kwak.web.controllers;

import com.kwak.web.domains.PlayerDTO;
import com.kwak.web.serviceImpls.PlayerServiceImpl;
import com.kwak.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    PlayerServiceImpl playerService;
    @GetMapping("")
    public List<PlayerDTO> getList(){
        return playerService.retriveAll();
    }
}
