package Basic;

public class FindInterestOfBank {
    // Find compound interest of bank
    public static void main(String[] args) {
        double principle = 10000;
        double rate = 0.06;
        int time = 5;
        double interest = principle * Math.pow(1 + rate, time) - principle;
        System.out.println("Interest is: " + interest);

    }

}
