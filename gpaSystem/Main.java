package gpaSystem;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jane");
        student.add("English", 'A');
        student.add("Mathematics", 'C');
        student.add("Physics", 'D');
        student.add("Chemistry", 'B');

        System.out.println(student.name + " has a GPA of " + student.getGPA());
        System.out.println();
        System.out.println("It was obtained in:");
        for (String str : student.getSubjects()) {
            System.out.println(str);
        }
        System.out.println();
        if (student.getGPA() >= 4.0) {
            System.out.println("You have a First class degree");
            }else if (student.getGPA() >= 3.0 && student.getGPA() < 4.0){
                System.out.println("You have a Second class Upper degree");
            }
            else if (student.getGPA() >= 2.0 && student.getGPA() < 3.0){
                System.out.println("You have a Second class Lower degree");
            }
            else {
            System.out.println("You have a Third class Lower degree");
        }

    }
}