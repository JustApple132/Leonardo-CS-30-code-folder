import java.util.Scanner;

public class AreaTriangle {
    
    public static void main(String[] args) throws Exception {
        
        Scanner key = new Scanner(System.in);
        
        System.out.print("Enter side A ::  ");
		int a = key.nextInt();

		System.out.print("Enter side B ::  ");
		int b = key.nextInt();

		System.out.print("Enter side C ::  ");
		int c = key.nextInt();

        AreaTriangleRunner test = new AreaTriangleRunner();
		test.setSides(a,b,c);
		test.calcPerimeter();
		test.calcArea();
		test.print();
		key.close();

    }

}
