package com.formation;

public class Account {

    private static int nbAccount = 0; //pas une bonne pratique

   private String name;
   private String lastname;
   private double sold;

    public Account(){
        this.name="";
        this.lastname="";
        this.sold =0;
        nbAccount++; //pas une bonne pratique

    }

    public Account(String name, String lastname, double sold){
        this.name="name";
        this.lastname="";
        this.sold =0;
        nbAccount++; //pas une bonne pratique

    }

    public static  int getNbAccount(){
    return 3;
    }

}
