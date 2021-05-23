package Exceptions.FormeGeometriques;

import java.util.Objects;

public abstract class FormG { //une classe abstraite est une classe ayant au moins une méthode abstraite
    //Une classe abtraite n'est jamais instanciée (elle est utilisée dans une relation d'héritage)
    private int code;

    public FormG() {
    }

    public FormG(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FormG)) return false;
        FormG formG = (FormG) o;
        return code == formG.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "code=" + code;
    }

    public abstract double perimetre();
    //Une méthode est dite abtraite si elle n'a pas de corps

    public abstract double surface();

}
