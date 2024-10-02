//String Basics Assignment 7
// Leonardo.Ibarra-Marin
// September 27, 2024
// Manipulating Strings


public class App {
    public static void main(String[] args) throws Exception {

        String message1 = "I am very happy!";
        String target1 = "very ";

        String message2 = "That was great - lol.";
        String target2 = "lol";
        String s1 = "laugh out loud.";
        System.out.println(message1.replace("very ",""));

        System.out.println(message2.length());
        System.out.println(message2.indexOf("lol"));
        System.out.println(message2.substring(0,17) + s1);

    }
}
