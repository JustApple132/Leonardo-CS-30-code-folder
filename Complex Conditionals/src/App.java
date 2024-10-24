public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int x = 2;
        int y = 5;
        
        
        if (x < 0) {
            System.out.println("x is negative");
        }
        else if (x == 0) {
            System.out.println("x is zero");
        }
        else {
            System.out.println("x is positive");
        }

        if (x > 0) {
            if (x > y) {
                System.out.println("x is pos+ and greater than " + y); 
            }
        }
            //Eqivilant
        if (x > 0 && x > y) {
            System.out.println("x is pos+ and greater than " + y);
        }

        // ELSE IF AND THE
        if (x < 0) {
            System.out.println("Not a winning number");
        }

        else if (x > 5) {
            System.out.println("Not a winning number");
        }

        else {
            System .out.println("This is a winning number");
        }
            
            //Eqivilant
        if (x < 0 || x > 5) {
            System.out.println("Not a winner");
        }
        else {
            System.out.println("Winner");
        }

    }
    
}
