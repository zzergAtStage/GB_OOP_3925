package oop.seminars.s05.mvcstudentapp.model;

import oop.seminars.s05.mvcstudentapp.controller.iGetModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileModel implements iGetModel {
    public String fileName;

    /**
     * Model constructor
     * @param fileName Full path of the file with data
     */
    public FileModel(String fileName) {
        this.fileName = fileName;
        try(FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Returns a list of students, that is getting from a file
     * @return List of students
     */
    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try{
            //create a file and read if row by row
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line!=null){
                String[] element = line.split(" ");
                Student preston = new Student(element[0], element[1],Integer.parseInt(element[2]), Integer.parseInt(element[3]));
                students.add(preston);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return students;
    }
    public void saveAllStudentToFile(List<Student> students)
    {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student pers : students)
            {
                fw.write(pers.getFirstName()+" "+pers.getSecondName()+" "+pers.getAge()+" "+pers.getId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public List<Student> deleteStudentByNumber(List<Student> students, int number) {
        //TODO DRY!!!!111
        try{
            Student rem = students.remove(number);
            System.out.println("Deleted: " + rem.toString());
        } catch (NullPointerException e) {
            System.out.printf("There is no student in list #%d",number);
        }
        return students;
    }
}
