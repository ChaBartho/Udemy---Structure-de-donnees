import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//TABLEAU 1 DIMENSION
        int[] tableauDeInt = new int[5];
        char[] tableauDeChar = new char[5];
        String[] tableauDeString = new String[5];
        Voiture[] tableauDeVoiture = new Voiture[5];

        tableauDeInt[0] = 5;
        tableauDeInt[1] = 10;
        tableauDeInt[2] = 15;
        tableauDeInt[3] = 20;
        tableauDeInt[4] = 25;

        System.out.println(tableauDeInt[0]);

        tableauDeChar[0] = 'a';
        tableauDeString[0] = "Sushi";


//TABLEAU 2 DIMENSIONS
        int[][] tableauDeInt2D = new int [3][3];    //3 colonnes et 3 lignes
        tableauDeInt2D [0][0] = 1;
        tableauDeInt2D [0][1] = 2;
        tableauDeInt2D [0][2] = 3;

        tableauDeInt2D [1][0] = 4;
        tableauDeInt2D [1][1] = 5;
        tableauDeInt2D [1][2] = 6;

        tableauDeInt2D [2][0] = 7;
        tableauDeInt2D [2][1] = 8;
        tableauDeInt2D [2][2] = 9;

        for (int i = 0; i < tableauDeInt2D.length; i++) {
            for (int j = 0; j < tableauDeInt2D[i].length; j++) {
                System.out.println("L'élément contenu à la position "+i+","+j+" vaut "+tableauDeInt2D[i][j]);
            }
        }

//LIST
        Voiture peugeot206 = new Voiture();

        List list = new ArrayList();
        list.add(peugeot206);  //index 0   -> SUPPRIMÉ (methode remove)
        list.add(3);    //index 1  -> passe à l'index 0
        list.add(peugeot206);  //index 2  -> passe à l'index 1
        list.add("Tirlipinpon");    //index 3  -> passe à l'index 2

        list.remove(peugeot206);   //Se trouve à 2 emplacements de ma collection. Mais la méthode 'remove' va uniqmt supprimer le 1er élément rencontré correspondant à cet objet.  ! index

        Object obj = list.get(0);
        //Si je ne peux pas anticiper le type de l'élément récupéré, je fais une var de type Object pour récupérer cet élément

        System.out.println(obj);





    }
}