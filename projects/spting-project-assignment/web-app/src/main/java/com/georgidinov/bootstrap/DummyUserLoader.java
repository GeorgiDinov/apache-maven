package com.georgidinov.bootstrap;

import com.georgidinov.model.UserCredentials;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DummyUserLoader implements CommandLineRunner {

    private List<UserCredentials> users = new ArrayList<>();

    public List<UserCredentials> getUsers() {
        return this.users;
    }

    @Override
    public void run(String... args) throws Exception {
        UserCredentials credentials = new UserCredentials("email", "password");
        users.add(credentials);
        credentials = new UserCredentials("email_2", "password_2");
        users.add(credentials);
    }


}
