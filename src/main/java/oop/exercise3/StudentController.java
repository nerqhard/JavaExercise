package oop.exercise3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Student> students = new ArrayList<>();

    private FileUtils fileUtils = new FileUtils();

    public List<Student> getStudents()  {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(int id) {
        for(int i=0;i<students.size();i++){
            Student st = students.get(i);
            if  (st.getId() == id) {
                students.remove(st);
            }
        }
    }

    public void saveToFile (String path) throws IOException {
        fileUtils.writeJsonFile(path,students);
    }

    public void loadFromFile (String path) throws IOException {
        students = fileUtils.readJsonFile(path, Student[].class);
    }

    public Student getById(int id) {
        for (Student st: students) {
            if (st.getId() == id) {
                return st;
            }
        }
        return null;
    }

    public List<Student> findByName(String firstName) {
        List<Student> result = new ArrayList<>();
        for (Student st: students){
            if (st.getFirstName().equals(firstName)) {
                result.add(st);
            }
        }
        return result;
    }

    public List<Student> findByClassName (String className) {
        List<Student> result = new ArrayList<>();
        for (Student st: students){
            if (st.getClassName().equals(className)) {
                result.add(st);
            }
        }
        return result;
    }
}
