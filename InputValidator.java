import java.util.Scanner;

public class InputValidator {
    private final Scanner sc;

    public InputValidator() {
        this.sc = scanner;
    }

    public static String getValidatedInput(String prompt, String regex, String errorMsg) {
        boolean running = true;
        while (running) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            if (input.matches(regex)) {
                return input;
            }
            System.out.println(errorMsg);
            running = false;
        }
    }
}