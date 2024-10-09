public class SubMethods {
    private double ans =0;

    public void calc(int a,int b) {
        ans = (a * b)/1.76987654;
        // ans = a;
        // ans += b;

    }

    public void output() {
        System.out.println(ans);
        System.out.printf("%8.3", ans);

    /*
        %f - real/decimal value
        %d - integer value
        %c - character value
        %s - string value

        */
    }

}


