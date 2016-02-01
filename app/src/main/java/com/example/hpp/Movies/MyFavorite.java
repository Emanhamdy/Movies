package com.example.hpp.Movies;

public class MyFavorite {
    public   String movieId ;
    public   String movieTitle;
    public   String movieOverview ;
    public   String movieReleaseDate ;
    public   String moviePosterPath ;
    public   String movieVoteAverage;
    public MyFavorite(String movieId, String movieTitle, String movieOverview,
                      String movieReleaseDate, String moviePosterPath, String movieVoteAverage){
        this.movieId=movieId;
        this.movieTitle=movieTitle;
        this.movieOverview=movieOverview;
        this.movieReleaseDate=movieReleaseDate;
        this.moviePosterPath=moviePosterPath;
        this.movieVoteAverage=movieVoteAverage;
    }
}
