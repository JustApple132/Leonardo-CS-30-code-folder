public class LoopStatsRunner {

    private int start, stop;

	public void setNums(int beg, int end)
	{
        beg = start;
        end = stop;
	}

    public int getEvenCount(int beg, int end)
	{
		int evenCount = 0;
		for( int i = beg; i <= end; i++) {
			if(i % 2 == 0) {
				evenCount = evenCount + 1;
			}
		}
		System.out.println(evenCount);
		return evenCount;
	}

	public int getOddCount(int beg, int end)
	{
		int oddCount=0;
		for( int i = beg; i <= end; i++) {
			if(i % 2 == 0) {
				oddCount = oddCount + 1;
			}
		}

		System.out.println(oddCount);
		return oddCount;
	}

	public int getTotal(int beg, int end)
	{
		int total=0;
        if (start <= stop ) {


        }

		return total;
	}
	
	public String toString()
	{
		return start + " " + stop;
	}

}


