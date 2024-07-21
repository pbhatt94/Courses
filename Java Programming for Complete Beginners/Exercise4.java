
public class Exercise4 {

    public boolean isPass(int marks) {
        return marks > 50;
    }

    public static void main(String[] args) {
        Exercise4 s1 = new Exercise4();
        Exercise4 s2 = new Exercise4();
        System.out.println("Student with 88 marks is " + (s1.isPass(55) ? "PASS" : "FAIL"));
        System.out.println("Student with 13 marks is " + (s2.isPass(33) ? "PASS" : "FAIL"));
    }
}
