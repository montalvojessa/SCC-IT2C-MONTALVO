
package montalvo;
import java.util.Scanner;
public class Grade {
       
    public Grade() {
       
        Scanner input = new Scanner(System.in);
        
        
        String name;
        double p, m, pf, f, tm, totalAvg;
        
        System.out.println("Enter your ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Enter your full name: ");
        name = input.nextLine(); 
        System.out.println("Enter Marks in: ");
        System.out.println("Prelim: ");
        p = input.nextDouble(); 
        System.out.println("Midterm: ");
        m = input.nextDouble(); 
        System.out.println("Prefinal: ");
        pf = input.nextDouble();
        System.out.println("Final: ");
        f = input.nextDouble(); 
        
     
        tm = p + m + pf + f;
        totalAvg = tm / 4.0; 
        
        
        System.out.println("===========================================");
        System.out.println("Grade Details");
        System.out.println("===========================================");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total Average: " + totalAvg);
        
        if (totalAvg <= 3.0) {
            System.out.println("You Passed!");
        } else {
            System.out.println("You Failed");
        }
        
        
        input.close();
    }
}



