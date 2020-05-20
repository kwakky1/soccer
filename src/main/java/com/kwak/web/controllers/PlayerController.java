package com.kwak.web.controllers;

import com.kwak.web.domains.PlayerDTO;

import com.kwak.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins="http://localhost:8080",allowedHeaders = "*")
@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired PlayerService playerService;
    @Autowired PlayerDTO player;
    @GetMapping("")
    public List<PlayerDTO> list(){
        return playerService.retriveAll();
    }
    @PostMapping("/{playerId}/access")
    public PlayerDTO login(
            @PathVariable String playerId,
            @RequestBody PlayerDTO params){
        System.out.println("뷰와 연결이 성공!! "+ playerId );
        System.out.println("뷰와 연결이 성공!! "+ params.getBackNo());
        return player;
    }
}
