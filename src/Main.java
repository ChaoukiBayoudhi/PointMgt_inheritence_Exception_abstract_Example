import Exceptions.FormeGeometriques.Carré;
import Exceptions.FormeGeometriques.Cercle;
import Exceptions.FormeGeometriques.FormG;
import LesPoints.Points;
import Pointpkg.Point;

import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
//        System.out.println("Saisie d' un point du plan :");
//        Point p1 = new Point();
//        p1.saisir();
//        System.out.println("Le point p1 est definit par");
//        p1.afficher();
//        System.out.println();
//        System.out.println("Saisie d'un point de l'espace");
//        Pointpkg.PointEspace pe1 = new Pointpkg.PointEspace();
//        pe1.saisir();
//        System.out.println("Le point pe1 est definit par");
//        pe1.afficher();

        //Le polymorphisme
//        Point p=null;//p peut être une instance de la classe mère ou n'importe quelle classe fille
//        System.out.println("selectionnez un choix");
//        System.out.println("1.Point du plan\n2.Point de l'espace\n3.Quitter");
//        int choix;
//        Scanner sc=new Scanner(System.in);
//        do {
//            System.out.print("choix ? ");
//            choix=sc.nextInt();
//        }while(choix<1||choix>3);
//        switch(choix) {
//            case 1:
//                p = new Point();
//                break;
//            case 2:
//                p = new Pointpkg.PointEspace();
//                break;
//            default:
//                System.exit(0);
//        }
//        p.saisir();
//        System.out.println("Le point p est defini par");
//        p.afficher();


        //conversion implicite et explicite
//        double a=11.5;
//        int b=(int)a;
//        int w=10;
//        double q=w;

        //La classe Object
        /*Point p1=new Point(11.2,5.6);
        System.out.println("Point : "+p1);//un appel implicite à toString()
        Point p2=new Point(11.2,5.6);
        System.out.println("Point : "+p2);
        Pointpkg.PointColoré p3=new Pointpkg.PointColoré(11.2,5.6,7.9,"Red");
        System.out.println("Point Coloré : "+p3);
        System.out.println(p3.getClass());

        System.out.println("p1=p2 ? "+p3.equals(p1));
        EtudiantPkg.Etudiant e1=new EtudiantPkg.Etudiant();
        System.out.println(e1);
        EtudiantPkg.Etudiant e2=new EtudiantPkg.Etudiant();
        System.out.println(e2);
        System.out.println(e1.getClass());
        System.out.println("p1=e1 ? "+p1.equals(e1));
        */
        //Les Exceptions :
       /* try {
            Point p1 = new Point();
            p1.saisir();//Exception si p1=null
            int x=5,y=0;
            int z=x/y;
            System.out.println("z = "+z);
        }catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("fin de l'application");*/
//  try {
//            Point p1= new Point();
//            p1.saisir();//Exception si p1=null
//            int x=5,y=0;
//            int z=x/y;
//            System.out.println("z = "+z);
//        }catch(Exception e)//plymorphisme
//        {
//            System.out.println(e.getMessage());
//        }
//
//        finally{ //c'est bloc qui est executer dans tous les cas soit qu'il a eu Exception ou non
//       //dans ce bloc finally on fermer des connexions, des flux,...
//       System.out.println("Le bloc finally");
//   }
//
//        System.out.println("fin de l'application");


        //Les exceptions non predefinies

        Points pts = new Points();
        Point p1 = new Point(123.2, 15.5);
        pts.add(p1);
        Point p2 = new Point(123.2, 15.5);
        try{pts.M1(p2);}
        catch(Exception e)
        {
            System.out.println(e);
        }

        //FormG g1=new FormG();//erreur car on ne peut pas instancier une classe abtraite
        FormG g1=null;
        System.out.println("1 : Carré\n 2: Cercle");
        Scanner sc=new Scanner(System.in);
        System.out.print("Votre choix ?   ");
        int choix = sc.nextInt();
        if(choix==1)
            g1=new Carré(11,10.5);
        else
            g1=new Cercle(12,20.5,new Point(5.5,13.2));

        System.out.println("perimètre de la forme = "+g1.perimetre());
        System.out.println("surface de la forme = "+g1.surface());
        }
}
