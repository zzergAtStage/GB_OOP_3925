package oop.seminars.s04.studentapp.domain;

import java.util.List;

public class AverageAge<T extends User>{
    int count;
    double sum;

    public void countUsers(List<T> users){
        for (User u :
            users) {
            sum += u.getAge();
            count++;
        }

    }

    public double getAverageAge(){
        return sum/count;
    }
}
