package Exceptions.FormeGeometriques;

import java.util.Objects;

public class Carré extends FormG {
    protected double longueur;

    public Carré() {
        this.longueur = 0.0;
    }

    public Carré(int code, double longueur) {
        super(code);
        this.longueur = longueur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carré)) return false;
        if (!super.equals(o)) return false;
        Carré carré = (Carré) o;
        return Double.compare(carré.longueur, longueur) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), longueur);
    }

    @Override
    public String toString() {
        return super.toString()+
                " ,longueur=" + longueur;

    }

    @Override
    public double perimetre() {
        return 4*this.longueur;
    }

    @Override
    public double surface() {
        return this.longueur*this.longueur;
        //return Math.pow(this.longueur,2);
    }
}
