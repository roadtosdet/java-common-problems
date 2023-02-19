public class NumberExistsInArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int number = 9;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(number + " is found.");
        } else {
            System.out.println(number + " is not found.");
        }
    }
    
}
