import java.util.ArrayList;
import java.util.UUID;
import java.util.Scanner;

class BookInfo {
    private UUID id;
    private String title;
    private String author;
    private String category;

    public BookInfo(String title, String author, String category) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private static ArrayList<BookInfo> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("Welcome to Book Management App!");
            System.out.println("1. Create new book");
            System.out.println("2. Get all books");
            System.out.println("3. Get book by ID");
            System.out.println("4. Update book by ID");
            System.out.println("5. Delete book by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewAllBooks();
                    break;
                case 3:
                    viewBookById();
                    break;
                case 4:
                    updateBookById();
                    break;
                case 5:
                    deleteBookById();
                    break;
                case 6:
                    running = false;
                    System.out.println("Bye....");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1-6.");
            }
        }
    }

    private static void addBook() {
        System.out.println("Enter book details:");
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Category: ");
        String category = scanner.nextLine();

        BookInfo book = new BookInfo(title, author, category);
        books.add(book);

        System.out.println("Book created!");
        System.out.println("=======");
        System.out.println("ID: " + book.id);
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Category: " + book.category);
        System.out.println("=======");



    }

    private static void viewAllBooks() {
        System.out.println("List of all books:");
        for (BookInfo book : books) {
            System.out.println("ID: " + book.getId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Category: " + book.getCategory());
            System.out.println();
        }
    }

    private static void viewBookById() {
        System.out.print("Enter book ID: ");
        String idString = scanner.nextLine();
        UUID id = UUID.fromString(idString);

        BookInfo book = findBookById(id);
        if (book != null) {
            System.out.println("Book details:");
            System.out.println("ID: " + book.getId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Category: " + book.getCategory());
        } else {
            System.out.println("Book not found!");
        }
    }

    private static void updateBookById() {
        System.out.print("Enter book ID: ");
        String idString = scanner.nextLine();
        UUID id = UUID.fromString(idString);

        BookInfo book = findBookById(id);
        if (book != null) {
            System.out.println("Enter new book details:");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Category: ");
            String category = scanner.nextLine();

            book.setTitle(title);
            book.setAuthor(author);
            book.setCategory(category);

            System.out.println("Book updated!");
            System.out.println("=======");
            System.out.println("ID: " + book.id);
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Category: " + book.category);
            System.out.println("=======");
        } else {
            System.out.println("Book not found!");
        }
    }

    private static void deleteBookById() {
        System.out.print("Enter book ID: ");
        String idString = scanner.nextLine();
        UUID id = UUID.fromString(idString);

        BookInfo book = findBookById(id);
        if (book != null) {
            books.remove(book);
            System.out.println("Book deleted!");
        } else {
            System.out.println("Book not found!");
        }
    }

    private static BookInfo findBookById(UUID id) {
        for (BookInfo book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }
}
