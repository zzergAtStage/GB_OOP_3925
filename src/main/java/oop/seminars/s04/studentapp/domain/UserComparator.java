package oop.seminars.s04.studentapp.domain;



import java.util.Comparator;


public class UserComparator<T extends User> implements Comparator<T> {
    /**
     * Compares two Users by first name, and then by second name
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
