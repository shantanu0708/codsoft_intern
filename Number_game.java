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
        
        do{
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Options:\n1.number game\n2.Exit\nEnter the option:");
        int opt = sc1.nextInt(); 
        if(opt == 2){
            sc1.close();
            break;
        }
        switch (opt) {
            case 1:
                System.out.println("*".repeat(45));
                System.out.println("\t\tNumber Game");
                System.out.println("*".repeat(45));
                int num = 1 + (int) (Math.random() * 100);
                int guess = Guessing_number(num);
                System.out.println(guess);
                System.out.println("The original number is: "+num);
                break;
            default:
                System.out.println("!!!Wrong Option!!!");
                break;
        } 
        sc1.close();
    }while(8 < 9);  
    }
}