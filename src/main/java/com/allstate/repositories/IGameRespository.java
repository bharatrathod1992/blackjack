package com.allstate.repositories;

import com.allstate.entities.Game;
import org.springframework.data.repository.CrudRepository;

public interface IGameRespository extends CrudRepository<Game, Integer>{
}
