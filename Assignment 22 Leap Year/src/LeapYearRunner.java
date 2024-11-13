public class LeapYearRunner {
    
    public void calcLeapYear(int y) {
        if (y % 4 == 0 && y % 100 != 0) {
            System.out.println(y + " is a Leap Year.");
        }
        else if (y % 400 == 0) {
            System.out.println(y + " is a Leap Year.");
        }
        else {
            System.out.println(y + " is NOT a Leap Year.");
        }
    }
}
