package Pointpkg;

public class PointColoré extends PointEspace {
    //Point
    // |__PointEspace
         // |__PointColoré
    private String couleur;

    public PointColoré() {
        this.couleur = "black";
    }

    public PointColoré(double x, double y, double z, String couleur) {
        super(x, y, z);
        this.couleur = couleur;
    }

    //La classe Object
    //c'est une classe predefinie
    //toutes les classes hérite implikcitement de la classe Object
    //cette classe defini plusieurs méthodes :
    //public boolean equals(Object obj) : permet de comparer deux objets
    //cette comparaison se fait par defaut, selon les references

    //Class getClass() : permet de retourner la classe à partir de laquelle l'objet à été instencier
    //public String toString() : retourne par defaut la reference de l'objet


    @Override
    public String toString() {
        return super.toString() +
                ", couleur='" + couleur+"'" ;
    }
}
