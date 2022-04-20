package com.pvt.test.user;

import java.util.List;

public class User {
    private static final String ZERO_VALUE_STRING = "Not entered";
    private static final Long ZERO_VALUE_LONG = 0L;
    private Long id;
    private String name;
    private String surname;
    private List<User> friends;

    public User() {
        this.id = ZERO_VALUE_LONG;
        this.name = ZERO_VALUE_STRING;
        this.surname = ZERO_VALUE_STRING;
        this.friends = friends;
    }

    public User(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public User(String name) {
        this.name = name;
    }

    public User(Long id, String name, String surname, List<User> friends) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.friends = friends;
    }

    public User(String name, List<User> frends) {
        this.name = name;
        this.friends = frends;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<User> getFrends() {
        return friends;
    }

    public void setFrends(List<User> frends) {
        this.friends = frends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (surname != null ? !surname.equals(user.surname) : user.surname != null) return false;
        return friends != null ? friends.equals(user.friends) : user.friends == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (friends != null ? friends.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return name;
    }
}

