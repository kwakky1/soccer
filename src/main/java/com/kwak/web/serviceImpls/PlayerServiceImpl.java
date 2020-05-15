package com.kwak.web.serviceImpls;

import com.kwak.web.domains.PlayerDTO;
import com.kwak.web.mappers.PlayerMapper;
import com.kwak.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired PlayerMapper playerMapper;
    @Override
    public List<PlayerDTO> retriveAll() {
        return playerMapper.selectAll();
    }
}
