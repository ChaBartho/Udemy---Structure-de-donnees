import java.util.*;

public class Main {
    public static void main(String[] args) {


//TABLEAU 1 DIMENSION
        System.out.println("------------------TAB 1D : ----------------");
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
        System.out.println("------------------TAB 2D : ----------------");
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
//ordre en fonction des ajouts
        System.out.println("-------------------LIST : -----------------");
        Voiture peugeot206 = new Voiture();
        peugeot206.couleur="rouge";
        Voiture peugeot207 = new Voiture();
        peugeot207.couleur="noire";

        List list = new ArrayList();
        list.add(peugeot206);  //index 0   -> SUPPRIMÉ (methode remove)
        list.add(3);    //index 1  -> passe à l'index 0
        list.add(peugeot206);  //index 2  -> passe à l'index 1
        list.add("Tirlipinpon");    //index 3  -> passe à l'index 2

        list.remove(peugeot206);   //Se trouve à 2 emplacements de ma collection. Mais la méthode 'remove' va uniqmt supprimer le 1er élément rencontré correspondant à cet objet.  ! index

        Object obj = list.get(0);
        //Si je ne peux pas anticiper le type de l'élément récupéré, je fais une var de type Object pour récupérer cet élément

        System.out.println(obj);
        System.out.println(list.size());    // = 3



//SET = type de Collection qui peut contenir un ensemble non ordonné d'Objets mais qui n'accepte pas les doublons.
//ordre et position des éléments totalement imprévisibles
        System.out.println("-------------------SET : -------------------");

        Set<Voiture> set = new HashSet<>();
        set.add(peugeot206);
        set.add(peugeot207);
        set.add(peugeot206);    // -> Je ne peux pas ajouter 2x le même élément dans une HashSet, celui-ci a été ignoré

        System.out.println(set.size()); // = 2


//FOREACH = itérer/parcourir sur une collection
//( élément1  :  élément2 ) -> élément1 = la variable qui va contenir successivement chacun des éléments de la collection lors de son parcours / élément2 = la collection sur laquelle je souhaite itérer
        System.out.println("-------------------FOREACH : -------------------");

        for (Voiture voiture : set) {
            System.out.println(voiture.couleur);
        }

        Iterator<Voiture> it =  set.iterator();

        while( it.hasNext() ) { // Renvoie vrai tant qu'il existe un prochain élément dans la collection

            Voiture v = it.next();
            System.out.println(v.couleur);
        }


//MAP = référence chaque élément grâce à une clé    -> On peut insérer 2x la même valeur, mais pas 2x la même clé
        System.out.println("-------------------MAP : -------------------");

        Voiture peugeot205 = new Voiture();
        peugeot205.couleur="bleue";

        Map<String, Voiture> map = new HashMap();
        map.put("205", peugeot205);
        map.put("207", peugeot207);

        Voiture v = map.get("207");

        System.out.println(v.couleur);

        //parcourir une map = foreach   -> à gauche des :  = la variable qui va stocker chacun des éléments de la map (sauf que les éléments sont matérialisés par une clef ET une valeur = couple d'objet -> objet qui va contenir un couple d'objet = Entry = classe interne de Map)
        //Si je veux savoir l'ensemble des couple <K,V>
        for (Map.Entry<String, Voiture> entry : map.entrySet()) {
            String key = entry.getKey();
            Voiture value = entry.getValue();
            System.out.println("l'élément suivant a pour clef : "+key+" il s'agit d'une voiture de couleur "+value.couleur);
        }

        //Si je veux juste savoir les K     keySet() renvoie un set -> clef = unique
        for (String key : map.keySet()) {
            System.out.println("l'élément suivant a pour clef : "+key);
        }
        //Si je vuex savoir l'ensemble des V        values() renvoie une liste -> doublons possibles
        for (Voiture value : map.values()) {
            System.out.println("il s'agit d'une voiture de couleur "+value.couleur);
        }


        System.out.println("le nombre d'éléments dans la map est de : "+map.size());
        System.out.println("la map est-elle vide ? "+map.isEmpty());
        System.out.println("la map contient-elle une 207 ? "+map.containsKey("207"));
        System.out.println("la map contient-elle la peugeot 207 ? "+map.containsValue(peugeot207));

        //map.clear(); //Vider la collection

        //Collection = interface
        //Collections = classe utilitaire de java avec méthodes static(+-50)
        //Collections.replaceAll(DansTelleListe, argumentARemplacer, argumentDeRemplacement)


//SORTEDSET & SORTEDMAP
        System.out.println("-------------------TREESET : -------------------");

        Set<Carre> setCarre = new TreeSet<>();
        setCarre.add(new Carre(10l));
        setCarre.add(new Carre(8l));
        setCarre.add(new Carre(50l));
        setCarre.add(new Carre(2l));

        for (Carre carre : setCarre){
            System.out.println(carre.cote);
        }
        System.out.println("-------------------TREEMAP : -------------------");

        Map<Carre, Voiture> mapCarre = new TreeMap<>();
        mapCarre.put(new Carre(10l), peugeot205);
        mapCarre.put(new Carre(8l), peugeot206);
        mapCarre.put(new Carre(50l), peugeot207);
        mapCarre.put(new Carre(2l), peugeot207);

        for (Map.Entry<Carre, Voiture> entry : mapCarre.entrySet()){
            System.out.println(entry.getKey().cote+" "+entry.getValue().couleur);
        }

//COMPARABLE

        //Qu'est ce que l'ordre naturel dans une collection d'objets ?
        //Les objets d'une List par exemple peuvent être ordonnées en invoquant la méthode Collections.sort.
        // Mais c'est au développeur de définir comment les objets doivent se comparer entre eux
        // et ceci est défini dans la méthode compareTo issue de l'interface Comparable.






    }
}