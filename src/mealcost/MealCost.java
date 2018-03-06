/*
 * Aliza Huynh
 * MealCost.java
 * This displays the reciept of a meal incuding the cost
 * the tax, and the total including the tax
 */

package mealcost;

/**
 *
 * @author alhuy9821
 */

import java.text.DecimalFormat;
public class MealCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double price = 8.95;
        double paid = 20.0;
        
        //calculate tax using the price of the food
        double tax = price*0.13;
        
        //total cost using the final price as well as the amount paid
        double total = tax+price;
        double change = 2000%1249;
  
        DecimalFormat RestaurantBill = new DecimalFormat("###.##");
        //System.out.println(RestaurantBill.format(tax));

        System.out.println("Restaurant Bill");
        System.out.println("****************");
       
        //Displays all of the costs
        System.out.println("Price: " + price);
        //System.out.println(RestaurantBill.format(tax));
        System.out.println("HST: " + RestaurantBill.format(tax));
        System.out.println("Total: " + RestaurantBill.format(total));
       
    }
    
}
