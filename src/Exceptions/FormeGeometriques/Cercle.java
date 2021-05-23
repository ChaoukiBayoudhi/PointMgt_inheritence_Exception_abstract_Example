package Exceptions.FormeGeometriques;

import Pointpkg.Point;

import java.util.Objects;

public class Cercle extends Carré{
    private Point centre;

    public Cercle() {
        super();
        this.centre = new Point(0.0,0.0);
    }

    public Cercle(int code, double longueur, Point centre) {
        super(code, longueur);
        this.centre = centre;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cercle)) return false;
        if (!super.equals(o)) return false;
        Cercle cercle = (Cercle) o;
        return Objects.equals(centre, cercle.centre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), centre);
    }

    @Override
    public String toString() {
        return super.toString()+
                ", centre=" + centre;
    }
    @Override
    public double perimetre()
    {
        return 2*Math.PI*longueur;
    }
    @Override
    public double surface()
    {
        return Math.PI*Math.pow(longueur, 2);
    }
}
