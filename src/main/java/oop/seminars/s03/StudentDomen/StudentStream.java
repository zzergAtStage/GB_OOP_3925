package oop.seminars.s03.StudentDomen;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class StudentStream implements Iterable<StudentGroup>, Comparator<StudentGroup> {
    LinkedList<StudentGroup> stream; // stream collection
    private int streamNumber; //number of stream

    /**
     * Конструктор класса "Курс" создает курс с переданными группами и номером курса
     * @param stream Список групп курса
     * @param streamNumber Номер курса
     */
    public StudentStream(LinkedList<StudentGroup> stream, int streamNumber) {
        this.stream = stream;
        this.streamNumber = streamNumber;
    }

    /**
     * Базовый конструктор класса "Курс"
     */
    public StudentStream() {
        this.stream = new LinkedList<>();
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int counter;
            @Override
            public boolean hasNext() {
                return (counter<stream.size());
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()){
                    return null;
                }
                return stream.get(counter++);
            }
        };
    }

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return (o1.getGroup().size() <= o2.getGroup().size()) ? 1 : 0;
    }

    @Override
    public String toString() {
        return "StudentStream{" +
                "stream=" + stream +
                ", stream_Number=" + streamNumber +
                '}';
    }

    public LinkedList<StudentGroup> getStream() {
        return stream;
    }

    public void setStream(LinkedList<StudentGroup> stream) {
        this.stream = stream;
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }
    public void addGroupToStream(StudentGroup group){
        this.stream.add(group);
    }
}
