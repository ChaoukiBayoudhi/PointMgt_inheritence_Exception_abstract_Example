//java gère les erreurs via la classe Exception
//Une Exception n'est autre q'une classe qui hérite de Exception
//pour utiliser cette classe on a 5 mots : try, catch, finally, throw et throws
//On a deux types des exceptions :
//-->Les exceptions predefinies : DividByZeroException, IndexOutOfBoundsException, IOException, NullPointerException
public class PointException extends Exception {
    //private String Message;
    private int codeErreur;


    public PointException(String message,int codeErreur) {
        super(message);
        this.codeErreur=codeErreur;
    }

    @Override
    public String toString() {
        return "PointException{" +
                super.toString()+
                "codeErreur=" + codeErreur +
                '}';
    }
}
