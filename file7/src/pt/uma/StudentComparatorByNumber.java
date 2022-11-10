package pt.uma;

import java.util.Comparator;

public class StudentComparatorByNumber implements Comparator<Student> {
    @Override
    public int compare (Student um, Student dois) {
        return um.getNumber() - dois.getNumber();
    }
}
