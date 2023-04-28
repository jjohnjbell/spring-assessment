package com.joshuabellsms;

import java.util.Objects;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    private Integer id;
    private String name;
    private Integer birth;

    public Users(Integer id, String name, Integer birth){
        this.id=id;
        this.name=name;
        this.birth=birth;
    }

    public Users(){
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }


    @Column(name = "name", nullable = false)
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    @Column(name = "birth", nullable = false)
    public Integer getBirth(){
        return birth;
    }
    public void setBirth(Integer birth){
        this.birth=birth;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id) && Objects.equals(name, users.name) && Objects.equals(birth, users.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birth);
    }


    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
