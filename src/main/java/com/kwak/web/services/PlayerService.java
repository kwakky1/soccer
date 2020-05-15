package com.kwak.web.services;


import com.kwak.web.domains.PlayerDTO;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface PlayerService {
    List<PlayerDTO> retriveAll();
}
