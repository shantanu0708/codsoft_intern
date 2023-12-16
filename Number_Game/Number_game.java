package Number_Game;
import java.util.Scanner;

public class Number_game { 
    public static void main(String[] args){
        int guess = 0, hsc = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Options:\n1.number game\n2.Score\n3.Exit\nEnter the option:");
            int opt = sc.nextInt(); 
            if(opt == 3){
                System.out.println("!!Thank you for playing!!");
                break;
            }
            switch (opt) {
                case 1:
                    System.out.println("*".repeat(45));
                    System.out.println("\t\tNumber Game");
                    System.out.println("*".repeat(45));
                    int n = 1 + (int) (Math.random() * 100);
                    System.out.println(" !!!Enter the number between 1 to 100!!! \n");      
                    int i=0;
                    while(i<6){
                        System.out.println("Guess the number:");
                        int n1 = sc.nextInt();
                        if(n1 == n){
                            System.out.println("Congratulations, you guessed the number!");
                            break;
                        }
                        else if(n1<n){
                            System.out.println("The guess number is too low");
                        }else if(n1>n){
                            System.out.println("The guess number is too high");
                        }
                        i++;
                    }
                    if(i == 6){
                        System.out.println("You have exhausted the trials");
                        guess = 0;
                    }else if(i<6){
                        guess = 1;
                    }
                    System.out.println("*".repeat(5)+" The original number is: "+n+" "+"*".repeat(5)+"\n");
                    if(guess == 1){
                    hsc = hsc + 100;
                    }
                    System.out.println("Your score is: "+hsc+"\n");
                    break;
                case 2:    
                    System.out.println("*".repeat(45));
                    System.out.println("     Your total score is: "+hsc+"     \n");
                    System.out.println("*".repeat(45));
                    break;
                default:
                    System.out.println("!!!Wrong Option!!!");
                    break;
            }
        }  sc.close();
        return;
    }  
}