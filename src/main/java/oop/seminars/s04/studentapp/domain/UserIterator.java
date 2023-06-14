package oop.seminars.s04.studentapp.domain;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class UserIterator<T extends User> implements Iterator<User> {
    private List<T> userList;
    private int currentIndex;
    public UserIterator(List<T> userList) {
        this.userList = userList;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < userList.size();
    }

    @Override
    public User next() {
        if (hasNext()) {
            User user = userList.get(currentIndex);
            currentIndex++;
            return user;
        }
        throw new NoSuchElementException("No more elements in the iterator.");
    }
}
