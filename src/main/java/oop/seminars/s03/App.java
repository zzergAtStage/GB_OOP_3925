package oop.seminars.s03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import oop.seminars.s03.StudentDomen.Person;
import oop.seminars.s03.StudentDomen.Student;
import oop.seminars.s03.StudentDomen.StudentGroup;
import oop.seminars.s03.StudentDomen.StudentStream;

public class App {
    protected static final int STEAM_DEFAULT_NUMBER = 2;
    public static void main(String[] args) throws Exception {
        Person man = new Person("Денис", "Криницын", 35);
        //System.out.println(man.toString());

        Student pers1 = new Student("Денис", "Криницын", 35, 1);
        //System.out.println(pers1.toString());

        Student s1 = new Student("Сергей", "Иванов", 22, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 23, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        listStud.add(pers1);

        StudentGroup group4335 = new StudentGroup(listStud, 4335);
        //System.out.println(group4335.toString());

        for(Student stud:group4335)
        {
            System.out.println(stud.toString());
        }

        System.out.println("===============================");
        Collections.sort(group4335.getGroup());

        for(Student stud:group4335)
        {
            System.out.println(stud.toString());
        }

        StudentGroup group3925 = new StudentGroup(listStud, 3925);

        StudentStream stream02 = new StudentStream();
        stream02.addGroupToStream(group4335);
        stream02.addGroupToStream(group3925);
        stream02.setStreamNumber(STEAM_DEFAULT_NUMBER);

        System.out.println("------------------------");
        System.out.printf("Stream #%d :\n",stream02.getStreamNumber());
        for (StudentGroup group: stream02) {
            System.out.println(group.getGroupList().toString());
        }
    }
}
