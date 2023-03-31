public class Main {
    public static void main(String[] args) {
        Author shak = new Author("Shak", "Shuk");
        Author bill = new Author("Bill", "Pork");

        Book book1 = new Book("Gibbet", shak, 1982);
        Book book2 = new Book("Eggs", bill, 1996);

        System.out.println("book1.getPublicationYear() = " + book1.getPublicationYear());
        book1.setPublicationYear(1999);
        System.out.println("book1.getPublicationYear() = " + book1.getPublicationYear());

        System.out.println(book1);
    }
}