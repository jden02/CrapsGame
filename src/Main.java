import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Let the game of Craps begin");
            int die1 = r.nextInt(6) + 1;
            int die2 = r.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            int point;

            System.out.println("You rolled: \nD1: " + die1 + "  D2: " + die2 + "\nFor a total of: " + crapsRoll);
            if(crapsRoll == 7 || crapsRoll == 11){
                System.out.println("You won via a natural!!");
            }else if(crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12){
                System.out.println("You crapped out and lost. :(");
            }else{
                System.out.println("The point is now: " + crapsRoll);
                point = crapsRoll;
                do {
                    die1 = r.nextInt(6) + 1;
                    die2 = r.nextInt(6) + 1;
                    crapsRoll = die1 + die2;
                    System.out.println("\nYou rolled: \nD1: " + die1 + "  D2: " + die2 + "\nFor a total of: " + crapsRoll);
                    if(crapsRoll == 7){
                        System.out.println("You rolled a 7 and lost. :(");
                    }else if(crapsRoll == point){
                        System.out.println("You rolled the point and won!!");
                    }else{
                        System.out.println("You gotta roll again.");
                    }
                }while((crapsRoll != point) && crapsRoll != 7);
            }

            System.out.println("Would you like to play again?(y/n): ");
        }while(sc.next().equalsIgnoreCase("y"));
    }
}