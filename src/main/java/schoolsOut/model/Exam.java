package schoolsOut.model;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Lob
    private String description;
    private LocalDate date;
    private int weight;
    private int total;
    @ManyToOne
    private Module module;

    public Exam() {
    }

    public String getName() {
        return name;
    }

    public Exam setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Exam setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Exam setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Exam setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public Exam setTotal(int total) {
        this.total = total;
        return this;
    }

    public Module getModule() {
        return module;
    }

    public Exam setModule(Module module) {
        this.module = module;
        return this;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", weight=" + weight +
                ", total=" + total +
                ", module=" + module +
                '}';
    }
}
