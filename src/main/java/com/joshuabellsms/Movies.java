package com.joshuabellsms;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Controller;
import java.util.Objects;
@Entity
public class Movies {

//    @Id

    @Id
    @SequenceGenerator(
            name = "movies_id_sequence",
            sequenceName = "movies_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movies_id_sequence"
    )
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "year")
    private  Integer year;

    public Movies(Integer id, String title, Integer year){
        this.id= id;
        this.title= title;
        this.year= year;
    }
    public Movies(){

    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }


    public Integer getYear(){
        return year;
    }
    public void setYear(Integer year){
        this.year=year;
    }


    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movies movies = (Movies) o;
        return Objects.equals(id, movies.id) && Objects.equals(title, movies.title) && Objects.equals(year, movies.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, year);
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
