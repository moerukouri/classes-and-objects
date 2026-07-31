import java.util.Scanner;

public class InputValidator {
    private final Scanner sc;

    public InputValidator() {
        this.sc = new Scanner(System.in);
    }

    public String getValidatedInput(String prompt, String regex, String errorMsg) {
    System.out.print(prompt);
    String input = sc.nextLine().trim();

    while (!input.matches(regex)) {
        System.out.println(errorMsg);
        System.out.print(prompt);
        input = sc.nextLine().trim();
        }
        return input;
    }

    public int getValidatedYear(String prompt, String errorMsg){
    System.out.print(prompt);
    String input = sc.nextLine().trim();
    boolean valid = isValidYear(input);

    while (!valid) {
        System.out.println(errorMsg);
        System.out.print(prompt);
        input = sc.nextLine().trim();
        valid = isValidYear(input);
    }

    return Integer.parseInt(input);
    }

    private boolean isValidYear(String input) {
        if (!input.matches("^[1-9][0-9]*$")) {
            return false;
        }
        int year = Integer.parseInt(input);
        return year <= java.time.Year.now().getValue();
    }
}