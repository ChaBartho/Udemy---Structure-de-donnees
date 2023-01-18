public class Voiture {

        //Propriétés :
        int nbPortes=5;
        boolean automatique;
        String couleur;
        int rapportCourant;
        int vitesseCourant;


        //Constructeur :

        Voiture(){
            System.out.println("Une voiture est en cours de construction");
        }



        //Méthodes :
        static void klaxonnner(){       // = méthode static (ou de class)
            System.out.println("Tutut");
        }
        int accelerer(){
            System.out.println("J'accélère");
            return 100;
        }
        int accelerer(int vitesseEnPlus) {
            System.out.println("J'accélère");
            return vitesseCourant + vitesseEnPlus;
        }
        int passerRapport(boolean augmenter){       // = méthode d'instance
            if(augmenter){
                rapportCourant++;           //this.rapportCourant++;  = le rapport courant de l'objet actuellement manipulé pdt l'exécution
            }else{
                rapportCourant--;
            }
            return rapportCourant;
        }
        static void tourner(boolean droite, int angle){
            String droiteOuGauche = null;
            if(droite){
                droiteOuGauche ="droite";
            }else{
                droiteOuGauche="gauche";
            }
            System.out.println("La voiture va tourner à "+droiteOuGauche+" d'un angle de "+angle);
        }

}


