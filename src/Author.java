import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;
    private final String id;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        id = getId();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return firstName.toUpperCase() + lastName.toUpperCase();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a2 = (Author) other;
        return id.equals(a2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
