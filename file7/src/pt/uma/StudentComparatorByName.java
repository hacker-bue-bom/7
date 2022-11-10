package pt.uma;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student> {
    @Override
    public int compare (Student um, Student dois) {
        return um.getName().compareTo(dois.getName());
    }
}
