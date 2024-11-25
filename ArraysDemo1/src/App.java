public class App {
    public static void main(String[] args) throws Exception {
        //Declare
        // int[] scores = null;
        // String [] names = null;

        //Create or Initiate Array
        // scores = new int[10];
        // names = new String[10];

        //Assign Values of Arrays
        //List of Data (solution set) 
        String [] names = {"wolf", "Stutter", "Cook", "Fox", "Golden"};
        int[] scores = {9000, 7001, 1337, 2048, 4096};

        // Individual positions
        names[0] = "wolf";
        scores [0] = 9000;

        //Array Length Property 
        System.out.println("Scores length is " + names.length);

        //Outputting or Accessing Arrays
        for (int i = 0; i < names.length; i++) {
            System.out.println(i +")"+ names[i] + ": " + scores[i]);
        }

        for (int i = names.length -1; i >= 0; i++) {
            System.out.println(i +")"+ names[i] + ": " + scores[i]);
        }


        // Find the sum of the Array
        int sum = 0;
        for (int i = 0; i < names.length; i ++) {
            sum = sum + scores[i];
        }
        System.out.println("the sum is " + sum);

        // Count elements of an array (eg. even number)
        int count = 0;
        for (int i = 0; i < scores.length; i ++) {
            if (scores[i] % 2 ==0) {
                count++;
            }
        }
        // //List of Data ()
        // System.out.println(scores[5]);
    }
}
