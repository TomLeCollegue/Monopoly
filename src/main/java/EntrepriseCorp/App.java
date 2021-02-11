package EntrepriseCorp;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Monopoly !" );
        Partie partie = new Partie();
        Menu(partie);
        partie.donnerLaMain();
        

    }
     public static void Menu(Partie partie){
         Scanner in = new Scanner(System.in);
         boolean lauchGame = false;
         while(!lauchGame) {
             System.out.println("-------------------------\n");
             System.out.println("1 - Ajouter un joueur");
             System.out.println("2 - Lancer la partie !");
             int selection = in.nextInt();

             if(selection == 1) {
                 System.out.print("Enter your name: ");
                 String name = in.nextLine();
                 partie.createJoueur(name);
                 System.out.println("Bienvenue " + name + " !");
             }

             else {
                 lauchGame = true;
             }
         }
    }
}
