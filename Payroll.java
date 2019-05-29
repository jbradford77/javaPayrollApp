import employees.*;
import util.*;

public class Payroll { 
    public static void main(String[] args) {
        String fName = null;
        String lName = null;
        int dept = 0;
        double payRate = 0.0;
        double hours = 0.0;
        
        Employee e = null;

        fName = KeyboardReader.getPromptedString("Enter first name: ");
        lName = KeyboardReader.getPromptedString("Enter last name: ");
        dept = KeyboardReader.getPromptedInt("Enter department: ");
            do {
                payRate = KeyboardReader.getPromptedDouble("Enter pay rate: ");
                if (payRate < 0.0) System.out.println("Pay rate must be >= 0");
            } while (payRate < 0.0);
            e = new Employee(fName, lName, dept, payRate);
            System.out.println(e.getPayInfo());
        }
    }