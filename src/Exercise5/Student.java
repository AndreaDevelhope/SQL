package Exercise5;

public class Student {
    private String name;
    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname;
    }
}
