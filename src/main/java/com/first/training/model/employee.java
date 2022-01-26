package com.first.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {
    @Id
    private String id;
    private String name;
    private int age;
    public employee(){

    }
    public employee(String id, String name, int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public String getId(){
        return  id;
    }
    public void setId(){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
