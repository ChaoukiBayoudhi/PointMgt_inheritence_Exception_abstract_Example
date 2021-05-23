package EtudiantPkg;

public class Note {
    private float valeur;
    private float coeffecient;

    public Note() {
    }

    public Note(float valeur, float coeffecient) {
        this.valeur = valeur;
        this.coeffecient = coeffecient;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }

    public float getCoeffecient() {
        return coeffecient;
    }

    public void setCoeffecient(float coeffecient) {
        this.coeffecient = coeffecient;
    }
}
