public class Main {

    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", tolstoy, 1835);
        System.out.println(tolstoy.toString());
        System.out.println(warAndPeace.toString());

        warAndPeace.setPublicationYear(1859);
        System.out.println(warAndPeace.getPublicationYear());

        Author dostoevsky = new Author("Fyodor", "Dostoevsky");
        Author dostoevsky2 = new Author("Fyodor", "Dostoevsky");
        Book crimeAndPunishment = new Book("Crime and Punishment", dostoevsky, 1866);

        System.out.println(dostoevsky.toString());
        System.out.println(crimeAndPunishment.toString());
        System.out.println(dostoevsky.equals(dostoevsky2));
        System.out.println(crimeAndPunishment.equals(warAndPeace));
    }
}