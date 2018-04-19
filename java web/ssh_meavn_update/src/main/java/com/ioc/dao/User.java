package com.ioc.dao;

/**
 * @Create by ostreamBaba on 18-4-3
 * @描述
 */
public class User {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(){
        super();
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [username="+username+",password="+password+"]";
    }
}
