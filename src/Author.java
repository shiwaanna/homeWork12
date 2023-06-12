import java.util.Objects;

public class Author {

    private String name;

    private String lastName;

    public Author(String name, String lastName) {
        this.lastName = lastName;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return "Автор: " + this.name + " " + this.lastName;
    }

    public boolean equals(Author author) {
        return this.name.equals(author.name) && this.lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
