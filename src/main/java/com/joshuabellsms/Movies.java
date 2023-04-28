package com.joshuabellsms;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "movies")
public class Movies {
    private Integer id;
    private String title;
    private  Integer year;

    public Movies(Integer id, String title, Integer year){
        this.id=id;
        this.title=title;
        this.year=year;
    }
//    public Movies(){
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }

    @Column(name = "year")
    public Integer getYear(){
        return year;
    }
    public void setYear(Integer year){
        this.year=year;
    }

    @Column(name = "title", nullable = false)
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
