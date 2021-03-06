package schoolsOut.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Lob
    private  String description;
    private String code;
    private String imageURL;
    private Boolean active;
    @OneToMany(mappedBy = "course",cascade ={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    private List<Person> people;
    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    private List<Module> modules;

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Course setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Course setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Course setCode(String code) {
        this.code = code;
        return this;
    }

    public String getImageURL() {
        return imageURL;
    }

    public Course setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public Boolean getActive() {
        return active;
    }

    public Course setActive(Boolean active) {
        this.active = active;
        return this;
    }

    public List<Person> getPeople() {
        return people;
    }

    public Course setPeople(List<Person> people) {
        this.people = people;
        return this;
    }

    public List<Module> getModules() {
        return modules;
    }

    public Course setModules(List<Module> modules) {
        this.modules = modules;
        return this;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", code='" + code + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", active=" + active +
                ", people=" + people +
                ", modules=" + modules +
                '}';
    }
}
