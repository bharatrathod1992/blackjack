package com.allstate.services;

import com.allstate.entities.Game;
import com.allstate.entities.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GameServiceTest {

    private GameService gameService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateGame() {
        Game game = new Game();
        User usr = new User();
        usr.setId(1);
        game.setuId(usr);
        Game result = gameService.create(game);

    }
}