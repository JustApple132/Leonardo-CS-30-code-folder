import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Enter a year ::  ");
        int year = key.nextInt();

        LeapYearRunner test = new LeapYearRunner();
        test.calcLeapYear(year);
    }

}
