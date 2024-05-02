package com.example.loginauthapi;

import com.example.loginauthapi.controllers.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LoginAuthApiApplicationTests {

    private final UserController userController;

    LoginAuthApiApplicationTests(UserController userController) {
        this.userController = userController;
    }

    @Test
    void contextLoads() {
        assertThat(userController).isNotNull();
    }

}
