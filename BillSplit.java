//This program lets people split a bill

package billsplit;

import java.util.Scanner;


public class BillSplit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner in = new Scanner(System.in);
        
        double bill;
        System.out.print("What was the total bill? ");
        bill = in.nextDouble();
        System.out.println();
        
        double tip;
        System.out.print("How much tip would you like to pay? Enter a number: ");
        tip = in.nextDouble();
        
        double total;
        total = (bill*(tip/100))+ bill;
        System.out.println("Ok, you're toal bill is: " + total);
        
        double party;
        System.out.println("How many people are in your group? ");
        party = in.nextDouble();
        
        double split = total/party;
        System.out.println("You each owe " + split + " dollars!");
    }
    
   
  
}
