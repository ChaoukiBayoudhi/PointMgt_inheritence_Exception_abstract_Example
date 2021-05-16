import java.util.Scanner;

public class PointEspace extends Point {
    //PointEspace herite de Point
    //PointEspace est une classe fille ou sous classe
    //Point est dite classe mère ou super classe
    //La classe PointEspace herite tout ce que est dans la classe Point
    //Elle ne peut acceder directement qu'aux attributs et methodes declarés public or protected

    private double z;
    public PointEspace()
    {
        super();//appel au constructeur non paramétré
        this.z=0.0;
    }
    public PointEspace(double x,double y,double z)
    {
        super(x, y);//appel au constructeur prametré de la classe mère (Point)
        this.z=z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    //***la surcharge de la méthode afficher
    //La surcharge se produit dans la même classe
    //Les méthodes srchargées doivent avoir des paramètres differents en nombre et/ou en type
//    public void afficher(int x)
//    {
//
//    }
//    public void afficher(Point[] tab)
//    {
//
//    }
    //La notion de redefinition
    //la redefiniotion se passe entre classe mère et classe fille
    //Les deux méthodes (celle de la classe mère et celle de la classe fille) ont la même signature
    //on fait recours à la redefinitrion si la méthode de la classe mère ne donne pas le bon fonctionnement
    //pour les objets de la classe fille
    @Override //annotation (optionnel)
    public void afficher()
    {
        super.afficher();//on appel la méthode afficher() de la classe mère
        System.out.println(", z = "+ this.z);

    }
    public void saisir()
    {
        Scanner sc=new Scanner(System.in);
        super.saisir();
        System.out.print("Z ? ");
        this.z=sc.nextDouble();

    }

    @Override
    public String toString() {
        return super.toString()+
                ", z=" + z;

    }
}
