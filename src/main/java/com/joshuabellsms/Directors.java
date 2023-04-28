package com.joshuabellsms;

import jakarta.persistence.*;

import java.awt.image.ImagingOpException;
import java.util.Objects;

@Entity
@Table(name = "directors")
public class Directors{
    private Integer movie_id;
    private Integer persons_id;

    public Directors(Integer movie_id,Integer persons_id){
        this.movie_id= movie_id;
        this.persons_id=persons_id;
    }

    public Directors(){

    }

    @Column(name = "movie_id", nullable = false)
    public Integer getMovieId(){
        return movie_id;
    }

    public void setMovieId(Integer movie_id){
        this.movie_id=movie_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id", nullable = false)
    public Integer  getPersons_id(){
        return persons_id;
    }
    public void setPersons_id(Integer persons_id){
        this.persons_id=persons_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directors directors = (Directors) o;
        return Objects.equals(movie_id, directors.movie_id) && Objects.equals(persons_id, directors.persons_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie_id, persons_id);
    }

    @Override
    public String toString() {
        return "Directors{" +
                "movie_id=" + movie_id +
                ", persons_id=" + persons_id +
                '}';
    }
}
