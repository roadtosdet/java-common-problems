package String;
public class CountVowel {
    //count the number of vowels in a string
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
    
}
