package com.georgidinov.command;

import java.util.Objects;

public class UserCommand {

    private String email;
    private String password;

    public UserCommand() {
    }

    public UserCommand(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserCommand)) return false;

        UserCommand that = (UserCommand) o;

        if (!Objects.equals(email, that.email)) return false;
        return Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserCommand{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
