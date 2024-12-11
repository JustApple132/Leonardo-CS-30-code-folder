public class LoopStatsRunner {

    public int getEvenCount(int beg, int end)
	{
		int evenCount = 0;
		for( int i = beg; i <= end; i++) {
			if(i % 2 == 0) {
				evenCount = evenCount + 1;
			}
		}
		System.out.println("Their is " + evenCount + " even numbers");
		return evenCount;
	}

	public int getOddCount(int beg, int end)
	{
		int oddCount=0;
		for( int i = beg; i <= end; i++) {
			if(i % 2 != 0) {
				oddCount = oddCount + 1;
			}
		}

		System.out.println("Their is " + oddCount + " odd numbers");
		return oddCount;
	}

	public int getTotal(int beg, int end)
	{
		int total = 0;
        for (int i = beg ; i <= end; i ++) {
			total = total + i;
        }
		System.out.println("The total is: " + total);
		return total;
	}
	
}



