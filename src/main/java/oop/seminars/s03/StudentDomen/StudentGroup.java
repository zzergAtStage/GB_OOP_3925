package oop.seminars.s03.StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    List<Student> group;
    private int idGroup;

    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    /**
     * Метод формирует список студентов в группе
     * @return StringBuilder список студентов
     */
    public StringBuilder getGroupList(){
        StringBuilder sb = new StringBuilder();
        sb.append("Group: ").append(this.idGroup).append("\n");
        for (Student stud : this
                ) {
            sb.append(stud.toString()).append("\n");
        }
        return sb;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {

        return new Iterator<Student>()
        {
            private int counter;
       
            @Override
            public boolean hasNext() {
                return counter<group.size();
            }
        
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                return group.get(counter++);
            }
        };

        //return new SGIterator(group);
    }


}
