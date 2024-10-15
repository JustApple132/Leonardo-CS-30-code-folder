
public class App {
    public static void main(String[] args) throws Exception {
        BigorSmallrunner keys = new BigorSmallrunner();

        BigorSmallrunner.check( 10, 20);
        BigorSmallrunner.check( 20, 10);
        BigorSmallrunner.check( 20, 20);
        BigorSmallrunner.check( 10, 10);
        BigorSmallrunner.check( 0, 1);
        BigorSmallrunner.check( 1, 0);
        BigorSmallrunner.check( 3, 5);
        BigorSmallrunner.check( 5, 3);
        BigorSmallrunner.check( 55342, 323);

    }

}
