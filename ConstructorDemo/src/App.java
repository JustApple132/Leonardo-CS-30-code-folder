public class App {
    public static void main(String[] args) throws Exception {
        SubMethods test = new SubMethods();
        int Num = test.myFunction();
        System.out.println("This return is" + Num );

        myName();

    }

    private static void myName() {
        System.out.println(" my name is Fox");
    }
}
