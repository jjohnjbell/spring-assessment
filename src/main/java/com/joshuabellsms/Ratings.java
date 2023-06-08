package com.joshuabellsms;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "ratings")
public class Ratings {

    @Id
    @SequenceGenerator(
            name = "ratings_id_sequence",
            sequenceName = "ratings_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ratings_id_sequence"
    )
    private Integer movieid;
    private Double rating;
    private  Integer votes;

    public Ratings(Integer movieid,Double rating, Integer votes){
        this.movieid= movieid;
        this.rating=rating;
        this.votes=votes;
    }

    public Ratings(){
    }

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getMovieId(){
        return movieid;
    }

    public void setMovieId(Integer movie_id){
        this.movieid=movie_id;
    }


    @Column(name = "rating", nullable = false)
    public Double getRating(){
        return rating;
    }
    public void setRating(Double rating){
        this.rating=rating;
    }


    @Column(name = "votes", nullable = false)
    public Integer getVotes(){
        return votes;
    }
    public void setVotes(Integer votes){
        this.votes=votes;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ratings ratings = (Ratings) o;
        return Objects.equals(movieid, ratings.movieid) && Objects.equals(rating, ratings.rating) && Objects.equals(votes, ratings.votes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieid, rating, votes);
    }

    @Override
    public String toString() {
        return "Ratings{" +
                "movie_id=" + movieid +
                ", rating=" + rating +
                ", votes=" + votes +
                '}';
    }
}
