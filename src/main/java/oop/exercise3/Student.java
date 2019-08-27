package oop.exercise3;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String className;
    private String address;

    protected Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.firstName = studentBuilder.firstName;
        this.lastName = studentBuilder.lastName;
        this.className = studentBuilder.className;
        this.address = studentBuilder.address;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getClassName() {
        return className;
    }

    public String getAddress() {
        return address;
    }

    public static class StudentBuilder {

        public int id;
        public String firstName;
        public String lastName;
        public String className;
        public String address;

        public static StudentBuilder newStudenBuilder() {
            return new StudentBuilder();
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder setClassName(String className) {
            this.className = className;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
