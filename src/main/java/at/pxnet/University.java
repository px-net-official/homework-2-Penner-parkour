package at.pxnet;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class University {
    private final List<Person> students = new ArrayList<>();

    public University() {
    }
    public void addStudent(Person person) {
        if (person != null && !students.contains(person)){
        students.add(person);
        }
    }

    public void removeStudent(Person person) {
        students.remove(person);
    }
    public List<Person> getStudents() {
        return Collections.unmodifiableList(students);
    }

    public List<Person> getFailingStudents() {
        List<Person> failing = new ArrayList<>();
        for (Person person : students) {
            try {
                if(Grading.isFailing(person)) {
                    failing.add(person);
                }
            }
            catch (IllegalStateException e) {}
        }
        return Collections.unmodifiableList(failing);
    }
    public double getAverageAge() {
        if(students.isEmpty()) {
            return 0;
        }
        int totalage = 0;
        for (Person person : students) {
            totalage += person.getAge();
        }
        return (double) totalage / students.size();
    }
}
