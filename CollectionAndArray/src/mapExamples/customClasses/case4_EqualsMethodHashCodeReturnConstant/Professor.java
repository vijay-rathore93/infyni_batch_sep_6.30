package mapExamples.customClasses.case4_EqualsMethodHashCodeReturnConstant;

import java.util.Objects;

public class Professor {

    private String name;
    private Integer id;

    public Professor(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(name, professor.name) && Objects.equals(id, professor.id);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
