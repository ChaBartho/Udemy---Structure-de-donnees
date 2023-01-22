

public class Carre implements Comparable{

    Long cote;

    Carre (long cote){
        this.cote = cote;
    }


    public int compareTo(Object o) {
        Carre autreCarre = (Carre) o;
       return this.cote.compareTo(autreCarre.cote);
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Carre)){
            return false;
        }
        Carre autreCarre = (Carre) obj;
        return cote == autreCarre.cote;
    }


    public int hashCode() {
        return cote.hashCode();
    }




}
