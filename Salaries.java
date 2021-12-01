import java.util.Scanner;
public class Salaries {
   //Write a program to accept 5 employee IDs and corresponding names and their salareies
   //from user and store them in three arrays. Pass these arrays to a function display() as arguments
   // This display() will display the content of the arrays in the following format. 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //establish 3 arrays
        int id[]= new int[5];
        int salary[]= new int[5];
        int i;
        String names[]= new String[5];

        for(i=0; i<5; i++){
            System.out.println("Enter the employee id");
            id[i]= input.nextInt();
            System.out.println("Enter the employees salary");
            salary[i]=input.nextInt();
            System.out.println("Enter the employee name");
            names[i]= input.nextInt();
        }
        System.out.println("ID Name Salary");
        for(i=0; i<5; i++){
            System.out.println("String.format('%4d%8s%14d'", id[i], name[i], salary[i]);
        }
    }

}
