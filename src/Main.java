import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); // do while
        String playerA = ""; //rps
        String playerB = ""; //rps
        boolean done = false;

        done = false;
        do {

            System.out.print("Enter your move [RPS]: ");
            playerA = in.nextLine();
            if (playerA.equalsIgnoreCase("R"))
            {
                System.out.println("PlayerA chose ROCK");
                done = true;
            }
            else if (playerA.equalsIgnoreCase("P"))
            {
                System.out.println("Player A Chose Paper");
                done = true;
            }
            else if (playerA.equalsIgnoreCase("S"))
            {
                System.out.println("Player A chose Scissors");
                done = true;
            }
            else
                System.out.println("You must enter {RPS} not " + playerA);

        }while (!done);

        playerA = playerA.toUpperCase();
        switch (playerA)
        {
            case "R":
                System.out.println("PlayerA move is ROCK");
                break;
            case "P":
                System.out.println("PlayerA move is PAPER");
                break;
            case "S":
                System.out.println("PlayerA move is SCISSORS");
                break;

            default:
                System.out.println("PlayerA move is illegal " + playerA);
        }
    }
}