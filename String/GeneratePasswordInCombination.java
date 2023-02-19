package String;
import java.util.Random;

//Generate password with at least one uppercase letter, one lowercase letter, one number, and one special character

public class GeneratePasswordInCombination {
    private static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMERIC_CHARACTERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+-=[]{}|;':\",.<>?";
    private static final int PASSWORD_LENGTH = 12;

    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        password.append(UPPERCASE_CHARACTERS.charAt(random.nextInt(UPPERCASE_CHARACTERS.length())));
        password.append(LOWERCASE_CHARACTERS.charAt(random.nextInt(LOWERCASE_CHARACTERS.length())));
        password.append(NUMERIC_CHARACTERS.charAt(random.nextInt(NUMERIC_CHARACTERS.length())));
        password.append(SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length())));

        for (int i = 0; i < PASSWORD_LENGTH - 4; i++) {
            String characters = LOWERCASE_CHARACTERS + UPPERCASE_CHARACTERS + NUMERIC_CHARACTERS + SPECIAL_CHARACTERS;
            password.append(characters.charAt(random.nextInt(characters.length())));
        }

        System.out.println("Generated password: " + password);
    }
}
