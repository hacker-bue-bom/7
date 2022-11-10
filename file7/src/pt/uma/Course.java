package pt.uma;

import java.util.Objects;

public class Course implements Comparable<Course>{
    private int code;
    private String name;
    private int ects;
    private int ano;

    public Course(int code, String name, int ects, int ano) {
        this.code = code;
        this.name = name;
        this.ects = ects;
        this.ano = ano;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getEcts() {
        return ects;
    }

    public int getAno() {
        return ano;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return code == course.code && Objects.equals(name, course.name) && ects == course.ects && ano == course.ano;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getName(), getEcts(), getAno());
    }

    @Override
    public String toString() {
        return "Course{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", ects=" + ects +
                ", ano=" + ano +
                '}';
    }

    @Override
    public int compareTo(Course o) {
        return 0;
    }
}
