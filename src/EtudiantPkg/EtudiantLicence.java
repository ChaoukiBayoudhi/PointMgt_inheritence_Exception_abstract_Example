package EtudiantPkg;

public class EtudiantLicence implements IEtudiant, IA,IB{
    private int code;
    private String nom;
    private Note[] tab=new Note[10];
    @Override
    public void afficher() {
        System.out.println("code="+code+", nom="+nom+" , moyenne="+calculerMoyenne());
    }

    @Override
    public void saisir() {

    }

    @Override
    public double calculerMoyenne() {
        float sCoeff=0.0f;
        for (Note n:tab) { //pour chaque Note (n) dans le tableau "tab"
            sCoeff+=n.getCoeffecient();
        }
        double moy=0.0;
        for(Note n:tab){
            moy+=n.getValeur()*n.getCoeffecient();
        }
        return moy/sCoeff;
    }

    @Override
    public void MA() {

    }

    @Override
    public void MB() {

    }
}
