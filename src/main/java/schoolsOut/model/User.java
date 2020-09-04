package schoolsOut.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    private String login;
    private String passwordhash;
    private Boolean active;
    @OneToOne(mappedBy = "user",cascade = CascadeType.MERGE)
    private Person person;

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public User setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPasswordhash() {
        return passwordhash;
    }

    public User setPasswordhash(String passwordhash) {
        this.passwordhash = passwordhash;
        return this;
    }

    public Boolean getActive() {
        return active;
    }

    public User setActive(Boolean active) {
        this.active = active;
        return this;
    }

    public Person getPerson() {
        return person;
    }

    public User setPerson(Person person) {
        this.person = person;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", passwordhash='" + passwordhash + '\'' +
                ", active=" + active +
                ", person=" + person +
                '}';
    }
}
