import java.util.*;
class Guesser{
    Scanner sc = new Scanner (System.in);
    int gGuessNum;

    public int guessNum(){
        System.out.print("\nGUESSER guess the number\t -\t");
        gGuessNum = sc.nextInt();
        return gGuessNum;
    }
}
class Umpire{
    int gNumber;

    public void gGuessNum(){
        Guesser g1 = new Guesser();
        gNumber = g1.guessNum();
    }

    public void range (){
        System.out.println("\t== RANGE is in Between " + (gNumber - 5) + " and " + (gNumber + 5) + " ==");
    }

    int player1;
    int player2;
    int player3;

    String playerName1;
    String playerName2;
    String playerName3;

    public void pGuessNum(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        playerName1 = p1.name();
        player1     = p1.pGuessNum();
        playerName2 = p2.name();
        player2     = p2.pGuessNum();
        playerName3 = p3.name();
        player3     = p3.pGuessNum();
    }

    public void win(){

        if (gNumber == player1){
            if (gNumber == player2 && gNumber == player3){
                System.out.println("\n\t\t== Match Tied! ==\nYou all played Great, but winner can only be one!");
            }
            else if (gNumber == player2){
                System.out.println("\n" + playerName1 + " and " + playerName2 + " won the game");
            }
            else if (gNumber == player3){
                System.out.println("\n" + playerName1 + " and " + playerName3 + " won the game");
            }
            else{
                System.out.println("\nWinner is - " + playerName1);
            }
        }
        else if (gNumber == player2){
            if (gNumber == player3){
                System.out.println("\n" + playerName2 + " and " + playerName3 + " won the game");
            }
            else{
                System.out.println("\nWinner is - " + playerName2);
            }
        }
        else if (gNumber == player3){
            System.out.println("\nWinner is - " + playerName3);
        }
        else {
            System.out.println("\nNo one won the game");
        }
    }
}
class Player {
    Scanner sc = new Scanner(System.in);
    
    int pGuessNum;
    String name;
    
    public String name (){
        System.out.print("Enter your name\t\t -\t");
        name = sc.next();
        return name;
    }
    public int pGuessNum(){
        System.out.print(this.name + " Guess the number\t\t -\t");
        pGuessNum = sc.nextInt();
        return pGuessNum;
    }
}

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWanna Play Guesser Game?\n1 - play\n2 - Dont wanna play");
        int choice = sc.nextInt();

        while (choice != 1 && choice != 2){
            System.out.println("Enter Corrrect Choice");
            choice = sc.nextInt();   
        }

        if (choice == 1){
            while (choice == 1){
                Umpire u1 = new Umpire();
                u1.gGuessNum();
                u1.range();
                u1.pGuessNum();
                u1.win();

                System.out.println("\n1 - Play again\n2 - End");
                choice = sc.nextInt();

                while (choice != 1 && choice != 2){
                    System.out.println("Enter write Choice");
                    choice = sc.nextInt();
                }
                if (choice == 2){
                    System.out.println("\nHope you Visit again");
                }
            }
        }
        else {
            System.out.println("\nVisit Soon");
        }
    }
}
