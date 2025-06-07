package at.pxnet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Create a class "Person" in the at.pxnet package
        // Make sure it has a constructor to take the following parameters in order:
        // * id (string)
        // * name
        // * age (int)
        // * array of grades (int)
        //
        // A grade can be any number from 1 to 5. If a number outside this range is passed as a grade, an
        // IllegalArgumentException should be thrown.
        //
        // Make sure the principles of data encapsulation are followed
        // A Person's id can never change
        // A person's age can change
        //
        Person Patrick = new Person("E001","Patrick",35, new int[]{1, 2, 3, 2, 1});
        Person Jesus = new Person("E002","Jesus",2025, new int[]{3, 4, 3, 4, 1});
        Person Michael = new Person("E003","Michael",20, new int[]{4, 4, 4, 4, 1});
        Person Gabriel = new Person("E004","Gabriel",21, new int[]{4, 4, 4, 4, 4});
        Person Abaddon = new Person("E005","Abaddon",28, new int[]{3, 3, 3, 4, 3});
        //
        // Create a class "Grading" in the at.pxnet package
        // Since it is a utility class, it should not expose any constructors
        //
        // This class provides a public method "isFailing" that takes a Person as a parameter. A person is failing if
        // they have at least one "5" or at least three "4" in their grades. If a person does not have at least two
        // grades, the method throws an IllegalStateException, regardless of the grades
        //
        University University = new University();
        University.addStudent(Patrick);
        University.addStudent(Jesus);
        University.addStudent(Michael);
        University.addStudent(Gabriel);
        University.addStudent(Abaddon);

        System.out.println("\nAll students in University");
        for (Person person : University.getStudents()) {
            System.out.println(person.getName() + " (" + person.getAge() + ")");
        }
        System.out.println("\nstudents in risk of failing:");
        for (Person person : University.getFailingStudents()){
            System.out.println(person.getName());
        }
        System.out.printf("\nAverageAge: %.2f\n", University.getAverageAge());
        //
        // Create a class "University" in the at.pxnet package.
        // It should only have the default constructor
        // The class provides three Methods:
        // * "addStudent" takes a Person as a parameter and add them as a new student to the university
        // * "removeStudent" takes a Person as a parameter and removes them from the list
        // * "getStudents" returns a List of Persons. The list must be unmodifiable
        // * "getFailingStudents" returns a List of Persons. The list must be unmodifiable
        //
        // An additional method "getAverageAge" does not take any parameters and returns the average age of the
        // students (double). If no students are enlisted in the university, "0" is returned.
    }
}