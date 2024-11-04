import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner key = new Scanner(System.in);

        System.out.print("Enter the distance ::  ");
		int dist = key.nextInt();

		System.out.print("Enter the hours ::  ");
		int hrs = key.nextInt();

		System.out.print("Enter the minutes ::  ");
		int mins = key.nextInt();


		MilesPerHourRunner test = new MilesPerHourRunner();
		test.setNums(dist, hrs, mins);
		test.calcMPH();
		test.print();

    }

}
