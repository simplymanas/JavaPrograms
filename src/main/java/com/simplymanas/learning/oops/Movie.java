package com.simplymanas.learning.oops;

public class Movie {
    private  String name;

    public Movie(String name) {
        this.name = name;
    }

    public  String Description(){
        System.out.println("Created a " + getClass().getSimpleName() + " object.");

        return "No Description available";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class DDLJ extends Movie{
    public  DDLJ(){
        super  ("DDLJ");
    }

    @Override
    public String Description() {
        return "Raj mets simron";
    }
}

class Toofan extends Movie{
    public  Toofan(){
        super  ("Toofan");
    }

    public String Description() {
        return "Amitabh ne toofan machaya";
    }
}

class Mogli extends Movie {
    public Mogli() {
        super("Mogli");
    }
}

 class    Main {

    public static void main(String[] args) {

for (int i=1; i<5;i++){
    Movie movie = randomMovie();
    if(null == movie){
        System.out.println("No movies.. next luck");continue;}

    System.out.println(  "Movie # " + i +" " +
    movie.getName() + "\n" +
    "Description: " + movie.Description() + "\n");
}
    }

     private static Movie randomMovie() {

        int randomNumber = (int) (Math.random() * 5) + 1;
         System.out.println("Random no: " + randomNumber);

         switch (randomNumber) {
             case 1:
                 return new DDLJ();
             case 2:
                 return new Toofan();
             case 3:
                 return new Mogli();
         }
         return  null;
     }
 }