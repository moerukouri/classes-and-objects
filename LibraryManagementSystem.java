public class LibraryManagementSystem {
    private static boolean promptAndAddBook(InputValidator validator, Library library) {
        String title = validator.getValidatedInput("\nEnter title: ",
                "^[A-Za-z0-9\\s\\-_,\\.;:()'!&?]+$",
                "Titles can only contain letters, numbers, spaces, and standard punctuation (like hyphens, colons, or commas).");
        String author = validator.getValidatedInput("\nEnter author: ",
                "^[A-Za-z0-9]+\\.?([ '-]?[A-Za-z0-9]+\\.?)*$",
                "Please enter a valid name.");
        int date = validator.getValidatedYear("\nEnter year: ",
                "Please enter a valid year. The year cannot be in the future.");

        return library.addBook(new Book(title, author, date));
    }
    public static void main(String[]args) {
        InputValidator validator = new InputValidator();
        Library library = new Library();
        boolean running = true;
        String border = "-".repeat(40);

        while(running) {
            System.out.println();
            System.out.println(border);
            System.out.println("Library Management System");
            System.out.println(border);
            System.out.println("Menu");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            int choice = Integer.parseInt(validator.getValidatedInput("Enter your choice: ",
                    "^[1-4]$",
                    "Choice must be an integer from 1-4."));
                    
            switch(choice){
                case 1 :
                    System.out.println("\n============= Add Book =============");
                    boolean added = promptAndAddBook(validator, library);
                    while (!added) {
                        added = promptAndAddBook(validator, library);
                    }
                    break;
                case 2 :
                    System.out.println("\n============= Display Books =============");
                    library.displayAll();
                    break;
                case 3 :
                    System.out.println("\n============= Search Book =============");
                    String searchTitle = validator.getValidatedInput("\nEnter book title: ",
                            "^[A-Za-z0-9\\s\\-_,\\.;:()'!&?]+$",
                            "Titles can only contain letters, numbers, spaces, and standard punctuation (like hyphens, colons, or commas).");
                    library.searchBook(searchTitle);
                    break;
                case 4 :
                    System.out.println("\nClosing Library Management System . . . ");
                    running = false;
                    break;
                default :
                    System.out.println("Choice must be an integer from 1-4.");
            }
        }
    }
}