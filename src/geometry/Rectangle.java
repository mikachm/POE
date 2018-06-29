package geometry;

public class Rectangle {

    private double longueur;
    private double largeur;

public static void main(String[] args){

    Rectangle R = new Rectangle(5,4);
    System.out.println(R.getLongueur());
    System.out.println(R.getLargeur());
    System.out.println(R.getPerimetre());
    System.out.println(R.getSurface());

}//main



    Rectangle(){}

    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getSurface(){
        return longueur*largeur;
    }

    public double getPerimetre(){
        return 2*longueur+2*largeur;
    }

}
