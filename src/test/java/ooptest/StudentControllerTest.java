package ooptest;

import oop.exercise3.Student;
import oop.exercise3.StudentController;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentControllerTest {
    @Test
    public void test_getStudent() {
        Student st = Student
                .StudentBuilder
                .newStudenBuilder()
                .setId(1)
                .setFirstName("ha")
                .setLastName("nguyen")
                .setClassName("12thxd")
                .setAddress("quang tri")
                .build();
        Assert.assertEquals(st.getId(), 1);
        Assert.assertEquals(st.getFirstName(), "ha");
        Assert.assertEquals(st.getLastName(), "nguyen");
        Assert.assertEquals(st.getClassName(), "12thxd");
        Assert.assertEquals(st.getAddress(), "quang tri");
    }

    @Test
    public void test_addStudent() throws IOException {
        StudentController sc = new StudentController();
        Student.StudentBuilder st = Student
                .StudentBuilder
                .newStudenBuilder()
                .setId(1)
                .setFirstName("ha")
                .setLastName("nguyen")
                .setClassName("12thxd")
                .setAddress("quang tri");
        sc.addStudent(st.build());
        sc.addStudent(st
                .setId(2)
                .setFirstName("na")
                .setLastName("vo")
                .setClassName("18k16")
                .setAddress("quang binh")
                .build());
        Assert.assertEquals(sc.getStudents().size(), 2);
        sc.saveToFile("student.json");
    }

    @Test
    public void test_deleteStudent() throws IOException {
        StudentController sc = new StudentController();
        sc.loadFromFile("student.json");
        sc.deleteStudent(15);
        Assert.assertEquals(sc.getStudents().size(), 2);
        sc.deleteStudent(1);
        Assert.assertEquals(sc.getStudents().size(), 1);
        sc.deleteStudent(2);
        Assert.assertEquals(sc.getStudents().size(), 0);
    }

    @Test
    public void test_loadFile() throws IOException {
        StudentController sc = new StudentController();
        sc.loadFromFile("student.json");
        Assert.assertEquals(sc.getStudents().size(), 2);
    }

    @Test
    public void test_getById() throws IOException {
        StudentController sc = new StudentController();
        sc.loadFromFile("student.json");
        Assert.assertNotNull(sc.getById(1));
        Assert.assertNull(sc.getById(4));
    }

    @Test
    public void test_getfindByName() throws IOException {
        StudentController sc = new StudentController();
        sc.loadFromFile("student.json");
        Assert.assertNotNull(sc.findByName("na"));
        List<Student> result = new ArrayList<>();
        Assert.assertEquals(sc.findByName("anh"), result);
    }

    @Test
    public void test_getfindByClassName() throws IOException {
        StudentController sc = new StudentController();
        sc.loadFromFile("student.json");
        Assert.assertNotNull(sc.findByClassName("12thxd"));
        List<Student> result = new ArrayList<>();
        Assert.assertEquals(sc.findByName("12x2"), result);
    }
}
