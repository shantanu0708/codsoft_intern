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
        int guess = 0, hsc = 0;
        Scanner sc1 = new Scanner(System.in);
        while(true){
        System.out.println("Options:\n1.number game\n2.Score\n3.Exit\nEnter the option:");
        int opt = sc1.nextInt(); 
        if(opt == 3){
            break;
        }
        switch (opt) {
            case 1:
                System.out.println("*".repeat(45));
                System.out.println("\t\tNumber Game");
                System.out.println("*".repeat(45));
                int num = 1 + (int) (Math.random() * 100);
                guess = Guessing_number(num);
                System.out.println("The original number is: "+num);
                if(guess == 1){
                    hsc = hsc + 100;
                }
                break;
            case 2:
                System.out.println("Your score is: "+ hsc);
                break;
            default:
                System.out.println("!!!Wrong Option!!!");
                break;
        }
    }   
    sc1.close();
    }
}