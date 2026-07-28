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
        int year = sc.nextInt();
        int currentYear = java.time.Year.now().getValue();

        while(year > currentYear){
            System.out.println(errorMsg);
            System.out.print(prompt);
            year = sc.nextInt();
        }
        return year;
    }
}