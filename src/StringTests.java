import java.util.Arrays;

public class StringTests {

    public static void main(String[] args) {
        String randomString;
        String myQuote;

        randomString = "My name is Jeff";
        myQuote = "He said: \"I am here \"";
        System.out.println(randomString);
        System.out.println(myQuote);

        int n = 10;
        String n1 = "nndwdw";
        String n2 = "nndwdw";

        System.out.println(randomString + ". " + myQuote);


        if (n1.equals(n2)) {
            System.out.println("They are equal");
        }
        System.out.println(n1.length()); // length of the string
        System.out.println(n1.charAt(2));
        for (int i = 0; i < n1.length(); i++) {
            System.out.println(n1.charAt(i));
        }
        System.out.println(n1.toLowerCase());
        System.out.println(n1.toUpperCase());
        System.out.println(n1.replace("n", "y"));



        String letter = "abcde";
        String moreLetter = "fghij";
        // System.out.println(letter.compareTo(moreLetter));

        String[] letterArray = new String[]{letter, moreLetter};
        for (int i = 0; i < letterArray.length; i++) {
            System.out.println(Arrays.toString(letterArray));

        }



        String[] letterArray2 = letter.split("");
        char[] charArray = letter.toCharArray();
        System.out.println(Arrays.toString(charArray));

        StringBuilder randomStringBuilder= new StringBuilder("a random value");
        System.out.println(randomStringBuilder);

        System.out.println(randomStringBuilder.append(" Joakim"));
        randomStringBuilder.trimToSize();


    }
}
