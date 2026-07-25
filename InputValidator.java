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
}