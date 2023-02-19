public class LenearSearch {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 5;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
    
}
