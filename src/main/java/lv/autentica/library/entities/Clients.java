package lv.autentica.library.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity(name = "clients")
public class Client {

    @Id
    @SequenceGenerator(name = "client_sequence", sequenceName = "client_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_sequence")
    @Column(updatable = false)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String Email;

    public Client() {
    }

    public Client(Long id) {
        this.id = id;
    }

    public Client(String firstName, String lastName, Email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id) &&
                Objects.equals(firstName, author.firstName) &&
                Objects.equals(lastName, author.lastName);
                Objects.equals(lastName, author.Email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, Email);
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String Email) {
        this.Email = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
