package geometry;

public class TriangleRectangle extends Rectangle {

    //Hérite de Rectangle
    //getSurface
    //hypoténus
    //Perimetre


    public TriangleRectangle(double longueur, double largeur){
        super(longueur, largeur);
    }

    @Override
    public double getSurface() {
        return super.getSurface()/2;
    }

    @Override
    public double getPerimetre() {
        return super.getPerimetre()/2;
    }

    public double getHypotenus(){

        double hypotenus = Maths.sqrt((super.getLongueur())^2 +super.getLargeur()^2);
    }
}
