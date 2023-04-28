package com.joshuabellsms;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "people")
public class Persons {
    private Integer id;
    private String name;
    private Integer birth;

    public Persons(Integer id, String name, Integer birth){
        this.id=id;
        this.name=name;
        this.birth=birth;
    }

    public Persons(){
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

    @Column(name = "birth")
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
        Persons persons = (Persons) o;
        return Objects.equals(id, persons.id) && Objects.equals(name, persons.name) && Objects.equals(birth, persons.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birth);
    }


    @Override
    public String toString() {
        return "Users{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", birth=" + this.birth +
                '}';
    }
}
