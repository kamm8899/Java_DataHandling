import java.util.Scanner;
public class functionOverloading {
    //Write another function display() with Employee ID array and Employee name array as 
    // arguments. (Note: here we are using concept of function overloading). This function
    //will display the content of the 2 arrays in the following format. 

  
    private static void display(String[] ids, String[] names){
        System.out.print("ID-Name");
        for(int i=0; i<names.length; i++){
            System.out.println(ids[i] + "\t" + names[i]);
        }

    }
    public static void main(String[] args) {
                
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of inputs: ");
        n = sc.nextInt();
        
        String ids[] = new String[n];
        String names[] = new String[n];
        
        sc.nextLine();
        
        for(int i=0;i<n;i++) {
                System.out.print("Enter id " + (i+1) + ": ");
                ids[i] = sc.nextLine();
                System.out.print("Enter name " + (i+1) +": ");
                names[i] = sc.nextLine();
        }
        
        sc.close();
        
        display(ids, names);

}

}

