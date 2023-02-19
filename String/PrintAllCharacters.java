package String;
public class PrintAllCharacters {
    // Print all characters from a string
    public static void main(String[] args) {
        String str = "Hello World";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
    
}
