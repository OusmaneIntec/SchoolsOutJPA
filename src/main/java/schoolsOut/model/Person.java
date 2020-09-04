package schoolsOut.model;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @OneToOne(cascade = CascadeType.ALL)
    private User user;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Course course;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Person setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public Course getCourse() {
        return course;
    }

    public Person setCourse(Course course) {
        this.course = course;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Person setUser(User user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
              //  ", user=" + user +
              //  ", course=" + course +
                '}';
    }
}
