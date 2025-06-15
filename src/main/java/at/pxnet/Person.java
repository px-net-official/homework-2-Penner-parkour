package at.pxnet;

//import org.junit.jupiter.api.test;
import java.util.Arrays;


public class Person {
    private final String id;
    private String name;
    private int age;
    private int[] grades;

    public Person(String ID, String name, int age, int[] grades) {
        this.id = ID;
        this.name = name;
        this.age = age;
        setGrades(grades);
    }

    public void setGrades(int[] grades) {
        if (grades == null || grades.length == 0) {
            this.grades = new int[0];
            return;
        }

        for (int grade : grades) {
            if (grade < 1 || grade > 5) {
                throw new IllegalArgumentException("Grade must be between 1 and 5");
            }
        }
        this.grades = Arrays.copyOf(grades, grades.length);
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int[] getGrades(){
        return Arrays.copyOf(grades, grades.length);
    }
}