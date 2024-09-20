public class P9 {
    public static String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            result.append(c).append(c);  
        }
        return result.toString();
    }

    public static void main(String[] args) {
        
        System.out.println(doubleChar("The"));                
        System.out.println(doubleChar("Hi-There"));   
    }
}
