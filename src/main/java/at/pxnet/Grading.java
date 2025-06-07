package at.pxnet;

public final class Grading {
    public Grading() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public static boolean isFailing(Person person) {
        int[] grades = person.getGrades();

        if(grades.length < 2) {
            throw new IllegalStateException("Grading requires at least two students");
        }

        int countFours = 0;
        for(int grade : grades) {
            if(grade == 5) {
                return true;
            }
            if(grade == 4) {
                countFours++;
            }
        }
        if(countFours >= 3) {
            throw new IllegalStateException("Failed Test");
        }
        return false;
    }
}
