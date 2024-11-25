public class CoolNumberRunner {
    public static boolean isCoolNumber(int n) {
        if (n % 3 == 1 && n % 4 == 1 && n % 5 == 1 && n % 6 == 1) {
            return true;
        }
        return false;
    }

public static void count(int stop) {
        int counter = 0;
        for (int i = 6; i <= stop; i++) {
            if (isCoolNumber(i)) {
                counter ++;
            }
        }
        System.out.println(counter);
    }
}

