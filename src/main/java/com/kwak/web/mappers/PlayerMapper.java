package com.kwak.web.mappers;

import com.kwak.web.domains.PlayerDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerMapper {
    public List<PlayerDTO> selectAll();

    public PlayerDTO login(PlayerDTO params);

    public PlayerDTO selectOne(String searchWord);
}
