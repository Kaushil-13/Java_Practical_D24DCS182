public class P11 {

    public static void main(String[] args) {
        String str = "CHARUSAT UNIVERSITY";

        System.out.println("Length of the string: " + str.length());

        String replacedStr = str.replace('H', 'K');
        System.out.println("String after replacing 'H' with 'K': " + replacedStr);

        String lowerStr = str.toLowerCase();
        System.out.println("String in lowercase: " + lowerStr);
    }
}
