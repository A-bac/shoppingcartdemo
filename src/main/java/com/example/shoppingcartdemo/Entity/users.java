package com.example.shoppingcartdemo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_cartusers")
public class users {

    @Id
    @SequenceGenerator(name = "userID", sequenceName = "userID")
    @GeneratedValue(generator = "userID", strategy = GenerationType.SEQUENCE)
    private int userid;

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public users(String username, String password) {
 //       this.userid = userid;
        this.username = username;
        this.password = password;
    }

    public users() {

    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "users{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
