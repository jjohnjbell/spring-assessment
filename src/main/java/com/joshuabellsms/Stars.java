package com.joshuabellsms;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "stars")
public class Stars {

    @Id
    @SequenceGenerator(
            name = "stars_id_sequence",
            sequenceName = "stars_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "stars_id_sequence"
    )
    private Integer movie_id;
    private Integer person_id;

    public Stars(Integer movie_id, Integer person_id) {
        this.movie_id = movie_id;
        this.person_id = person_id;
    }

    public Stars(){
    }

   
    @Column(name = "movie_id", nullable = false)
    public Integer getMovie_id() {
        return movie_id;
    }
    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }

    @Column(name = "person_id", nullable = false)
    public Integer getPerson_id() {
        return person_id;
    }
    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stars stars = (Stars) o;
        return Objects.equals(movie_id, stars.movie_id) && Objects.equals(person_id, stars.person_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie_id, person_id);
    }

    @Override
    public String toString() {
        return "Stars{" +
                "movie_id=" + movie_id +
                ", person_id=" + person_id +
                '}';
    }
}
