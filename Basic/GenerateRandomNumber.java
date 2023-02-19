package Basic;
public class GenerateRandomNumber {
    
    public static void main(String[] args) {
        int min = 10;
        int max = 100;
        int randomNum = (int)(Math.random() * ((max - min) + min));
        System.out.println(randomNum);
    }
    
}
