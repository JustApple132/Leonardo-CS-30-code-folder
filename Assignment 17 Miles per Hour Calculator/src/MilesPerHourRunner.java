public class MilesPerHourRunner {

    private double distance, hours, minutes;
    private int mph;


    // public MilesPerHourRunner() {
    //     setNums(0,0,0);
	// 	mph=0.0;
    // }

    public void setNums(int dist, int hrs, int mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }
    
    public void calcMPH() {
        hours = hours + (double) minutes/60;
        mph = (int)(distance/hours);
	}

	public void print() {
        System.out.println((int)(distance) + " miles in " + (int)(hours) + " hours and " + (int)(minutes) + " minutes = " + mph + " MPH");
	}

}
