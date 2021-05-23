package LesPoints;



import Exceptions.PointException;
import Pointpkg.Point;

public class Points {
    private Point[] tab=new Point[10];
    private int nbPoints=0;
    public void add(Point p) //ajoute un point à la fin du tableau
    {
        try {
            //on lance une exception non predefinie avec le mot clé throw
            if(exists(p))
                throw new PointException("Ce point existe déjà",10001);
            tab[nbPoints] = p;
            nbPoints++;
            System.out.println("Point ajouté");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void add2(Point p) throws PointException,IndexOutOfBoundsException//ajoute un point à la fin du tableau
            //la notion de propagation d'exception (en utilisant le mot clé throws)
    {

            //on lance une exception non predefinie avec le mot clé throw
            if(exists(p))
                throw new PointException("Ce point existe déjà",10001);
            tab[nbPoints] = p;
            nbPoints++;
            System.out.println("Point ajouté");

    }
    public boolean exists(Point p) {
        boolean trouve=false;
        int i=0;
        while(i<nbPoints&&!trouve)
        {
            if(tab[i].equals(p))
                trouve=true;
            else
                i++;
        }
        return trouve;
}
//public void M1(Point p)
//{
//    try {
//        add2(p);
//    }catch(PointException e)
//    {
//        System.out.println(e);
//    }
//}
    //autre possibilité
public void M1(Point p) throws PointException, IndexOutOfBoundsException
{
        add2(p);

}
}
