import java.util.*;

public class Number_game {
     
    public static int Guessing_number(int n){
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(i<7){
            
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
        sc.close();
        if(i == 7){
            System.out.println("You have exhausted the trials");
            return 0;
        }else if(i<7){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args){
        int guess = 0, hsc = 0, j=0;
        Scanner sc1 = new Scanner(System.in);
        while(j<5){
            
            System.out.println("*".repeat(45));
            System.out.println("\t\tNumber Game");
            System.out.println("*".repeat(45));
            int num = 1 + (int) (Math.random() * 100);
            guess = Guessing_number(num);
            System.out.println("*".repeat(5)+" The original number is: "+num+" "+"*".repeat(5)+"\n");
            if(guess == 1){
                hsc = hsc + 100;
            }
            System.out.println("Your score is: "+hsc+"\n");
            System.out.print("Ready To play?:(1 for yes/0 for no)  ");
            int playagain = sc1.nextInt();
            if(playagain == 0){
                break;
            }
            j++;
        } sc1.close(); 
    }  

}