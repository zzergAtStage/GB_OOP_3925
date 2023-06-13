package oop.seminars.s03.StudentDomen;

import java.util.Comparator;

public class PersonComparator<T extends Person> implements Comparator<T> {
    /**
     * Compares two person by first name, and then by second name
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return resul of comparing the objects
     */
    @Override
    public int compare(T o1, T o2) {
        int resultComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultComparing == 0) {
            resultComparing = o1.getSecondName().compareTo(o2.getSecondName());
            return resultComparing;
        } else {
            return resultComparing;
        }
    }
}
