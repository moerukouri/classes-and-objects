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
        int currentYear = java.time.Year.now().getValue();
        System.out.print(prompt);
        String input = sc.nextLine().trim();
        int year = 0;
        boolean valid = false;

        while(!valid){
            try{
                year = Integer.parseInt(input);
                if(year > currentYear || year < 0){
                    System.out.println(errorMsg);
                    System.out.print(prompt);
                    input = sc.nextLine().trim();
                } else {
                    valid = true;
                }
            } catch(NumberFormatException e){
                System.out.println(errorMsg);
                System.out.print(prompt);
                input = sc.nextLine().trim();
            }
        }
        return year;
    }
}