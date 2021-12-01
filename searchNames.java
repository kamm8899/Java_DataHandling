import java.util.Scanner;
public class searchNames {
    //Write another function named display() which takes 4 arguments. the arguments are named as String and 3 arrays. 
    //(Employee id, name and salary). Function prototype looks like
    //display(String name, int regno[], String Empname [], double salary[])
    
    public static void display(String regno[], String Empname[], double salary[]){
        System.out.println("\nID \t Salary");
        for(int i=0;i<5;i++){
            System.out.print("\n" +regno[i] + "\t" + Empname[i] + "\t" + salary[i]);
        }
        public static void display(String regno[], String Empname[]){
            System.out.println("\n\nID \t Name");
            for(int i=0;i<5;i++){
                System.out.print("\n" + regno[i] + "\t" + Empname[i]);
            }

    }
    public static void display(String name, String regno[], String Empname[], double salary[]){
        int i;
        for(i=0;i<5;i++){
            if(name.equals(Empname[i])){
                System.outprintln("\nID \t Name \t Salary");
                System.out.println(regno[i] + "\t" + Empname[i] + "\t" + salary[i]);
                break; 
            }
            if(i==5){
                System.out.println("No records found!");
            }
        }
        public static void main(String ar[]){
            Scanner input = new Scanner(System.in);
            String regno[]= new String[5];
            String Empname[] = new String[5];
            double salary[] = new double[5];

            for(int i=0;i<5;i++){
                System.out.print("Enter ID: ");
                regno[i] = input.nextInt();
                System.out.print("Enter name:");
                Empname[i] = input.nextInt();
                System.out.print("Enter salary: ");
                salary[i] = input.nextDouble();

            }
        }
    }

