public class LibraryManagementSystem {

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
            System.out.println("2. Display Book");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            int choice = Integer.parseInt(validator.getValidatedInput("Enter your choice: ",
                    "^[1-4]$",
                    "Choice must be an integer from 1-4."));
                    
            switch(choice){
                case 1 :
                    String title = validator.getValidatedInput("\nEnter title: ",
                            "^[A-Za-z0-9\\s\\-_,\\.;:()'!&?]+$",
                            "Titles can only contain letters, numbers, spaces, and standard punctuation (like hyphens, colons, or commas).");

                    String author = validator.getValidatedInput("\nEnter author: ",
                            "^[A-Za-z0-9]+\\.?([ '-]?[A-Za-z0-9]+\\.?)*$",
                            "Please enter a valid name.");

                    int date = validator.getValidatedYear("\nEnter year: ", 
                            "Please enter a valid year. The year cannot be in the future.");

                    library.addBook(new LibraryBook(title, author, date));
                    break;
                case 2 :
                    library.displayBooks();
                    break;
                case 3 :
                    String searchTitle = validator.getValidatedInput("\nEnter book title: ",
                            "^[A-Za-z0-9\\s\\-_,\\.;:()'!&?]+$",
                            "Titles can only contain letters, numbers, spaces, and standard punctuation (like hyphens, colons, or commas).");
                    library.searchBook(searchTitle);
                    break;
                case 4 :
                    System.out.println("Closing Library Management System . . .");
                    running = false;
                    break;
                default :
                    System.out.println("Choice must be an integer from 1-4.");
            }
        }
    }
}