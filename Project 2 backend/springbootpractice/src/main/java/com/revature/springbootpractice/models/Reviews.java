package com.revature.springbootpractice.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_reviews")
public class Reviews {



    @Id
    @Column(name="reviewid")
    int review_id;
    @Column(name="userid")
    int userid;
    @Column(name="moviename")
    String movie_name;
    @Column(name="releaseyear")
    int movie_release_year;

    @Column(name="rating")
    int rating;
    @Column(name="reviewdetail")
    String review_details;
    @Column(name="recommends")
    boolean recommends;

    public int getReview_id() {
        return review_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview_details() {
        return review_details;
    }

    public void setReview_details(String review_details) {
        this.review_details = review_details;
    }

    public boolean isRecommends() {
        return recommends;
    }

    public void setRecommends(boolean recommends) {
        this.recommends = recommends;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public int getMovie_release_year() {
        return movie_release_year;
    }

    public void setMovie_release_year(int movie_release_year) {
        this.movie_release_year = movie_release_year;
    }

    public Reviews() {
    }
}
