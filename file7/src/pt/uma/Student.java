package pt.uma;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private int number;
    private String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Student() {
        number = 0;
        name = "";
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return number == student.number && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getName());
    }

    @Override
    public int compareTo(Student apple) {
        if(number - apple.getNumber() != 0) {
            return number - apple.getNumber();
        }
        else {
            return name.compareTo(apple.getName());
        }
    }

}

