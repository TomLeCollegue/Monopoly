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
             System.out.println("3 - Toggle le cheatMode !");

             int selection = in.nextInt();

             if(selection == 1) {
                 System.out.print("Enter your name: ");
                 String name = in.next().toString();
                 partie.createJoueur(name);
                 System.out.println("Bienvenue " + name + " !");
             }

             else if (selection == 2){
                 lauchGame = true;
             }
             else {
                 partie.Cheat = !Partie.Cheat;
                 System.out.println( "Cheat : "+ Partie.Cheat);
             }
         }
    }
}
