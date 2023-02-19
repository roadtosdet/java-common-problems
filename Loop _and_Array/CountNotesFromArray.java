public class CountNotesFromArray {
    public static void main(String[] args) {
        int[] notes = { 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int amount = 540;

        for (int i = 0; i < notes.length; i++) {
            int count = amount / notes[i];
            amount = amount % notes[i];
            if (count == 0) {
                continue;
            }
            System.out.println(notes[i] + " : " + count);

        }
    }

}
