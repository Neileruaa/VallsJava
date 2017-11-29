import java.util.Scanner;
import java.lang.*;
public class Valse {
    // Pour les E/S d'évaluation. NE PAS MODIFIER.
    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("YO CA MARCHE JUSQUE LA ");

        String type = args[1];
        int repetion = Integer.parseInt(args[2]);
        System.out.println(type);

        int[][] tabMenuet = {
        {96,32,69,40,148,104,152,119,98,3,54},
        {22,6,95,17,74,157,60,84,142,87,130},
        {141,128,158,113,163,27,171,114,42,165,10},
        {41,63,13,85,45,167,53,50,156,61,103},
        {105,146,153,161,80,154,99,140,75,135,28},
        {122,46,55,2,97,68,133,86,129,47,37},
        {11,134,110,159,36,118,21,169,62,147,106},
        {30,81,24,100,107,91,127,94,123,33,5}};
        int[][] secondTabMenuet = {
        {70,117,66,90,25,138,16,120,65,102,35},
        {121,39,139,176,143,71,155,88,77,4,20},
        {26,126,15,7,64,150,57,48,19,31,108},
        {9,56,132,34,125,29,175,166,82,164,92},
        {112,174,73,67,76,101,43,51,137,144,12},
        {49,18,58,160,136,162,168,115,38,59,124},
        {109,116,145,52,1,23,89,72,149,173,44},
        {14,83,79,170,93,151,172,111,8,78,131}};
        int[][] tabTrio = {
        {72,56,75,40,83,18},
        {6,82,39,73,3,45},
        {59,42,54,16,28,62},
        {25,74,1,68,53,38},
        {81,14,65,29,37,4},
        {41,7,43,55,17,27},
        {89,26,15,2,44,52},
        {13,71,80,61,70,94}};
        int[][] secondTabTrio = {
        {36,76,9,22,63,11},
        {5,20,34,67,85,92},
        {46,64,93,49,32,24},
        {79,84,48,77,96,86},
        {30,8,69,57,12,51},
        {95,35,58,87,23,60},
        {19,47,90,33,50,78},
        {66,88,21,10,91,31}};
        // nostab();

        if ("help".equals(args[0])){
             printHelp();
        }else if("rand".equals(args[0])){
            playRand(args[1],tabMenuet,secondTabMenuet,tabTrio,secondTabTrio);
        }else if("stdin".equals(args[0])){
            playStdin();
        }
	}
	/* Méthode printHelp : permet d'informer l'utilisateur sur
	 * le fonctionnement du programme (indications, précautions etc...)
	 */
	public static void printHelp() {
        String phrase = "test";
        System.out.println(phrase) ;
	}
	/* Méthode playRand : permet de jouer aléatoirement une combinaison
	 * de mesures en fonction du nombres de répétitions renseigné en argument
	 * lors de l'execution du programme.
	 */
	public static void playRand(String param,
                                int[][]menuuetTab,
                                int[][]secondTabMenuuet,
                                int[][]trioTab,
                                int[][]secondTrioTab) {
		int max=7; //les valeurs maximales et minimales du dé
		int min=1;

		if ("menuet".equals(param)) { //si l'utilisateur entre en paramètre "menuet" alors...
        // StdAudio.play(pistePourJouer);
    		int tirageMenuet = (int)(Math.random() * (max-min)) + min; //tirage pour le premier dé
    		int tirageSecondMenuet = (int)(Math.random() * (max-min)) + min; //tirage pour le second dé
    		int resultatMenuet = (tirageMenuet+tirageSecondMenuet)-2;
             for (int malettre = 0; malettre<8 ; malettre++) {
                     System.out.println(menuuetTab[malettre][resultatMenuet]);
                     int nbAJouer= menuuetTab[malettre][resultatMenuet];
                     String pistePourJouerMenuet = "M"+nbAJouer+".wav";
                     StdAudio.play(pistePourJouerMenuet);
                     try{Thread.sleep(1800);}catch(Exception e){System.out.println(e);}
                     //ici c la pose
             }
             System.out.println("On passe au deuxieme tab");
            for (int malettre = 0; malettre<8 ; malettre++) {
                     System.out.println(secondTabMenuuet[malettre][resultatMenuet]);
                     int nbAJouer= secondTabMenuuet[malettre][resultatMenuet];
                     String pistePourJouerMenuet = "M"+nbAJouer+".wav";
                     StdAudio.play(pistePourJouerMenuet);
                     try{Thread.sleep(1800);}catch(Exception e){System.out.println(e);}
                     //ici c la pose
             }
        }
		else if ("trio".equals(param)) { //si l'utilisateur entre en paramètre "trio" alors...
			int tirageTrio = (int)(Math.random() * (max-min)) + min; //tirage pour le premier dé
			int resultatTrio = tirageTrio-1;
            System.out.println(resultatTrio);

            for (int malettre = 0; malettre<8 ; malettre++) {
                    System.out.println(trioTab[malettre][resultatTrio]);
                    int nbAJouer3= trioTab[malettre][resultatTrio];
                    String pistePourJouerTrio = "T"+nbAJouer3+".wav";
                    StdAudio.play(pistePourJouerTrio);
                    try{Thread.sleep(1800);}catch(Exception e){System.out.println(e);}
                    //ici c la pose
             }
            System.out.println("On passe au deuxieme tab");
            for (int malettre = 0; malettre<8 ; malettre++) {
                     System.out.println(secondTrioTab[malettre][resultatTrio]);
                     int nbAJouer= secondTrioTab[malettre][resultatTrio];
                     String pistePourJouerMenuet = "M"+nbAJouer+".wav";
                     StdAudio.play(pistePourJouerMenuet);
                     try{Thread.sleep(1800);}catch(Exception e){System.out.println(e);}
                     //ici c la pose
             }
		}
		else if ("menuet+trio".equals(param)) { //si l'utilisateur entre en paramètre "menuet+trio" alors...
			int tirageMenuet = (int)(Math.random() * (max-min)) + min; //tirage pour le premier dé
            int tirageSecondMenuet = (int)(Math.random() * (max-min)) + min; //tirage pour le second dé
            int resultatMenuet = (tirageMenuet+tirageSecondMenuet)-2;

			int tirageTrio = (int)(Math.random() * (max-min)) + min; //tirage pour le premier dé
            int resultatTrio = tirageTrio-1;
            System.out.println(resultatTrio);
            for (int malettre = 0; malettre<8 ; malettre++) {
                     System.out.println(menuuetTab[malettre][resultatMenuet]);
                     int nbAJouer= menuuetTab[malettre][resultatMenuet];
                     String pistePourJouerMenuet = "M"+nbAJouer+".wav";
                     StdAudio.play(pistePourJouerMenuet);
                     try{Thread.sleep(1800);}catch(Exception e){System.out.println(e);}
                     //ici c la pose
             }
             System.out.println("On passe au deuxieme tab");
            for (int malettre = 0; malettre<8 ; malettre++) {
                     System.out.println(secondTabMenuuet[malettre][resultatMenuet]);
                     int nbAJouer= secondTabMenuuet[malettre][resultatMenuet];
                     String pistePourJouerMenuet = "M"+nbAJouer+".wav";
                     StdAudio.play(pistePourJouerMenuet);
                     try{Thread.sleep(1800);}catch(Exception e){System.out.println(e);}
                     //ici c la pose
             }
             for (int malettre = 0; malettre<8 ; malettre++) {

                    System.out.println(trioTab[malettre][resultatTrio]);
                    int nbAJouer3= trioTab[malettre][resultatTrio];

                    String pistePourJouerTrio = "T"+nbAJouer3+".wav";
                    StdAudio.play(pistePourJouerTrio);
                    try{Thread.sleep(1800);}catch(Exception e){System.out.println(e);}
                    //ici c la pose
             }
            System.out.println("On passe au deuxieme tab");
            for (int malettre = 0; malettre<8 ; malettre++) {
                     System.out.println(secondTrioTab[malettre][resultatTrio]);
                     int nbAJouer= secondTrioTab[malettre][resultatTrio];
                     String pistePourJouerMenuet = "M"+nbAJouer+".wav";
                     StdAudio.play(pistePourJouerMenuet);
                     try{Thread.sleep(1800);}catch(Exception e){System.out.println(e);}
                     //ici c la pose
             }
		}
	}//fin de la fonction playRand

	/* Méthode playStdin : permet de jouer une combinaison
	 * de mesures en fonction du nombres de répétitions et du résultat des dés renseignés en argument
	 * lors de l'execution du programme.
	 */

	public static void playStdin() {

	}//fin de la fct playStdin


    public static void nostab(){
        int[][] tabMenuet = {
        {96,32,69,40,148,104,152,119,98,3,54},
        {22,6,95,17,74,157,60,84,142,87,130},
        {141,128,158,113,163,27,171,114,42,165,10},
        {41,63,13,85,45,167,53,50,156,61,103},
        {105,146,153,161,80,154,99,140,75,135,28},
        {122,46,55,2,97,68,133,86,129,47,37},
        {11,134,110,159,36,118,21,169,62,147,106},
        {30,81,24,100,107,91,127,94,123,33,5}};
        int[][] secondTabMenuet = {
        {70,117,66,90,25,138,16,120,65,102,35},
        {121,39,139,176,143,71,155,88,77,4,20},
        {26,126,15,7,64,150,57,48,19,31,108},
        {9,56,132,34,125,29,175,166,82,164,92},
        {112,174,73,67,76,101,43,51,137,144,12},
        {49,18,58,160,136,162,168,115,38,59,124},
        {109,116,145,52,1,23,89,72,149,173,44},
        {14,83,79,170,93,151,172,111,8,78,131}};
        int[][] tabTrio = {
        {72,56,75,40,83,18},
        {6,82,39,73,3,45},
        {59,42,54,16,28,62},
        {25,74,1,68,53,38},
        {81,14,65,29,37,4},
        {41,7,43,55,17,27},
        {89,26,15,2,44,52},
        {13,71,80,61,70,94}};
        int[][] secondTabTrio = {
        {36,76,9,22,63,11},
        {5,20,34,67,85,92},
        {46,64,93,49,32,24},
        {79,84,48,77,96,86},
        {30,8,69,57,12,51},
        {95,35,58,87,23,60},
        {19,47,90,33,50,78},
        {66,88,21,10,91,31}};
    }
}
