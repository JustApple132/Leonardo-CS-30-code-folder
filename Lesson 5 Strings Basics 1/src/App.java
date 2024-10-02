// Program name: Variable Basics

// Student name: Leonardo. Ibarra-Marin

// Date: September 20, 2024

// Program Description:  Calculating how many chicken wings I can afford. to get by dividing the total amount of money variable with the price of one chicken wing and creating a 
// variable calculating the total amount I can get, then printing the total


public class App {
    public static void main(String[] args) throws Exception {
        double cost = 0.75;
        double money = 4.75;
        
        double total = (int)(money / cost);

        System.out.println ("You can get " + total + (" chicken wings"));
    }
}
