package com.company.views;

import com.company.controllers.DBConnect;
import com.company.models.Movie;

import java.util.ArrayList;
import java.util.Scanner;

public class CmdLineView {

    public static String title;
    public static String releaseDate;
    public static String rating;

    public CmdLineView() {

    }

    public static void getInfo() {
        System.out.println("Enter movie title: ");
        Scanner input = new Scanner(System.in);
        title = input.nextLine();

        System.out.println("Enter release year: ");
        releaseDate = input.nextLine();

        System.out.println("Enter rating: ");
        rating = input.nextLine();
    }

    public static void showInfo() {
        DBConnect db = new DBConnect("movies.db");
        ArrayList<Movie> theMovies = db.getData();
        for(Movie movie : theMovies){
            System.out.println(movie.toString());
        }
    }
}
