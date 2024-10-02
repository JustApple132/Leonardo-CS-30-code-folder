//Program name: Assignment 8 Input Basics
//Student name: Leonardo.Ibarra-Marin
//Date: October 1, 2024
//Program Description:



import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        Double doubleOne, doubleTwo;
  
        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();
        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();


        System.out.print("Enter an double :: ");
        doubleOne = keyboard.nextDouble();
        System.out.print("Enter an double :: ");
        doubleTwo = keyboard.nextDouble();
  
        System.out.println("integer one = " + intOne);
        System.out.println("integer two = " + intTwo);

        System.out.println("double one = " + doubleOne);
        System.out.println("double two = " + doubleTwo);

        System.out.println("intOne + intTwo = " + (intOne + intTwo));
        System.out.println("doubleOne + doubleTwo = " + (doubleOne + doubleTwo));
    }
}
