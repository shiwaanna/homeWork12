public class Main {

    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", tolstoy, 1835);
        System.out.println("Книга: " + warAndPeace.getTitle() + " автор: " + warAndPeace.getAuthor().getName() + " " + warAndPeace.getAuthor().getLastName());

        warAndPeace.setPublicationYear(1859);
        System.out.println(warAndPeace.getPublicationYear());

        Author dostoevsky = new Author("Fyodor", "Dostoevsky");
        Book crimeAndPunishment = new Book("Crime and Punishment", dostoevsky, 1866);
        System.out.println("Книга: " + crimeAndPunishment.getTitle() + " автор: " + crimeAndPunishment.getAuthor().getName() + " " + crimeAndPunishment.getAuthor().getLastName());
    }
}