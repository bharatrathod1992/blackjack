package com.allstate.services;

import com.allstate.entities.Game;
import com.allstate.repositories.IGameRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private IGameRespository gameRepository;

    @Autowired
    public void setGameRepository(IGameRespository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game create(Game game) {
        return this.gameRepository.save(game);
    }
}
