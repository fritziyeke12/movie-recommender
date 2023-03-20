package io.datajek.spring.basics.movierecommendersystem.lesson2;


public class RecommenderImplementation {

    public String[] recommendMovies(String movie){
        //use content based filter to find similar movies
        CollaborativeFilter filter = new CollaborativeFilter();
        String[] results = filter.getRecommendations("Finding Dory");
        //returns movie results
        return results;
    }
}

