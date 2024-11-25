import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        private Scanner inp = new Scanner(System.in);
        private int [] nums = null; //Declare the Array
        


        System.out.println("How many numbers would you like to");
        int SIZE = inp.nextInt();

        nums = new int[SIZE];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Please enter a integer: ");
            nums[i] = inp.nextInt();
        }
        
        printArr();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 2;

        }

        private static void printArr()
        System.out.println("Your list of numbers is: ");
        for(int i = 0; i<nums.length-1; i++) {
                System.out.println(nums[i] + ", ");
        }

        //Output the last value WITH a new line
        System.out.println(nums[nums.length-1] + ".");
    }

}
