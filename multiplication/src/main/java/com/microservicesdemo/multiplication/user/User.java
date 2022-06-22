package com.microservicesdemo.multiplication.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String alias;

    public User() {}

    public User(Long id, String alias) {
        this.id = id;
        this.alias = alias;
    }

    public User(final String userAlias) {
        this(null, userAlias);
    }

    public Long getId() {
        return id;
    }

    public String getAlias() {
        return alias;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", alias='" + alias + '\'' +
                '}';
    }
}
