package com.hw;

public class Person {
    private Integer id;
    private String pwd;
    private String name;
    private String hi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHi() {
        return hi;
    }

    public void setHi(String hi) {
        this.hi = hi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", hi='" + hi + '\'' +
                '}';
    }
}
