package com.allstate.services;

import com.allstate.entities.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateUser(){
        User user = new User();
        user.setBalance(1000);

        User result = this.userService.create(user);
        assertEquals(1000,result.getBalance(),0.1);
    }

    @Test
    public void shouldReturnAllUsers(){

        List<User> users;
        users = this.userService.findAll();
        assertEquals(1,users.size());
    }

    @Test
    public void shouldReturnSpecificUserById(){
        User user = this.userService.findById(1);
        assertEquals(1,user.getId());
        assertEquals(1000,user.getBalance(),0.1);
    }
}