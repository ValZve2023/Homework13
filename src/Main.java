public class Main {
    public static void main(String[] args) {
        Author Rowling = new Author("Joanne Rowling");
        Book HarryPotter = new Book("Harry Potter", 1997, Rowling);
        System.out.println(HarryPotter);

        Author Bulgakov = new Author("Mikhail Bulgakov");
        Book theMasterAndMargarita = new Book("The Master and Margarita", 1966, Bulgakov);
        System.out.println(theMasterAndMargarita);
        theMasterAndMargarita.setPublicationYear(1968);
        System.out.println(theMasterAndMargarita);
        System.out.println(Rowling.equals(Bulgakov));
        System.out.println(HarryPotter.equals(theMasterAndMargarita));
    }
}