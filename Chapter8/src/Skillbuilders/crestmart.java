package Skillbuilders;

import java.text.NumberFormat;
import java.util.Scanner;

public class crestmart {

    public static void payEmployee(CEmployee emp, double payArg) {
        NumberFormat money = NumberFormat.getCurrencyInstance();

        double pay;

        System.out.println(emp);

        pay = emp.pay(payArg);

        System.out.println(money.format(pay));
    }

    public static void main(String[] args) {
    	
    	
    		manager emp1 = new manager("Justin", "Kitchen", 80000 );
    		associate emp2 = new associate("Shaquel", "Amor", 15.00);
    		
    		Scanner input = new Scanner(System.in);
    		
    		CEmployee emp = emp1;
    		
    		String action;
    		int empNum;
    		double payArg;
    		
    		do
    		{
    			System.out.println("\n (E)mployee \\ (P)ay \\ (Q)uit");
    			System.out.println("Make a choice: ");
    			action = input.next();
    			
    			if(!action.equalsIgnoreCase("Q"))
    			{
    				System.out.println("Enter Employee number( 1 or 2): ");
    				empNum = input.nextInt();
    				
    				switch(empNum)
    				{
    					case 1: emp = emp1; break;
    					case 2: emp = emp2; break;
    				}
    				
    				if(action.equalsIgnoreCase("E"))
    				{
    					System.out.println(emp);
    				}
    				else if(action.equalsIgnoreCase("P"))
    				{
    					System.out.println("Enter the hours for Associate"
    									+ "pay period for Manager ");
    					payArg = input.nextDouble();
    					payEmployee(emp, payArg);
    				}
    			}
    			
    		}while(!action.equalsIgnoreCase("Q"));
    
    }
}

