import java.util.*;
class Student {
    public int phy,che,math,hin,eng;
    public double tot_mrk,avg_per;
    public String grd;
    public String name,prn,Class;
    Scanner s1 = new Scanner(System.in);
    Student(){
        phy = 0; che = 0; math = 0; 
        hin = 0; eng = 0;
    }
    void input_studentinfo(){
        System.out.println("Student name: ");
         name = s1.nextLine();
        System.out.println("Class: ");
         Class = s1.nextLine();
        System.out.println("Student Prn: ");
         prn = s1.next();
    }
    void input_marks(){
        System.out.println("Physics: ");
         phy = s1.nextInt();
        System.out.println("Chemistry: ");
         che = s1.nextInt();
        System.out.println("Maths: ");
         math = s1.nextInt();
        System.out.println("Hindi: ");
         hin = s1.nextInt();
        System.out.println("English: ");
         eng = s1.nextInt();
    }
    double tot_marks(){
        tot_mrk = phy + che + math + hin + eng;
        return tot_mrk;
    }
    double avg_percentage(){
        avg_per = tot_mrk / 500;
        return avg_per;
    }
    String grade() {
         if(avg_per<=1.0 && avg_per>0.9){
            grd = "O";
            return grd;
         }else if(avg_per<=0.9 && avg_per>0.8){
            grd = "A+";
            return grd;
         }else if(avg_per<=0.8 && avg_per>0.7){
            grd = "A";
            return grd;
         }else if(avg_per<=0.7 && avg_per>0.6){
            grd = "B+";
            return grd;
         }else if(avg_per<=0.6 && avg_per>0.65){
            grd = "B";
            return grd;
         }else if(avg_per<=0.65 && avg_per>0.5){
            grd = "C";
            return grd;
         }else if(avg_per<=0.5 && avg_per>=0.4){
            grd = "Pass";
            return grd;
         }else{
            grd = "Fail";
            return grd;
         }
    }
    void display(){
        System.out.println("\n"+"-".repeat(52));
        System.out.println("NAME: " + name);
        System.out.println("PRN: " + prn);
        System.out.println("CLASS: " + Class);
        System.out.println(" Total Marks: " + tot_marks());
        System.out.println(" Average percentage: " + avg_percentage());
        System.out.println("\t\t\t\t\tGrade: " + "\'"+grade()+"\'");
        System.out.println("-".repeat(52)+"\n");
    }
}
public class StudentGrade_Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n"+"_".repeat(55)+"\n");
        System.out.println("\t\tStudent Grade Calculator");
        System.out.println("_".repeat(55));
        Student s = new Student();
        System.out.println("Enter the details of student as follows: ");
        s.input_studentinfo();
        System.out.println("\nEnter the marks of given subjects: ");
        s.input_marks();
        s.display();
        sc.close();
    }
}
