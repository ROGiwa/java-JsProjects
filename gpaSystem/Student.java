package gpaSystem;
import java.util.ArrayList;

public class Student {
    String name;
    private ArrayList<String> subjects;
    private ArrayList<Character> grade;

    public Student(String name){
        this.name = name;
        this.subjects = new ArrayList<String>();
        this.grade = new ArrayList<Character>();
    }
    //public String getName(){
      //  return name;
    //}
    public void add(String sub, char gr){
        subjects.add(sub) ;
        grade.add(gr);
    }
    public ArrayList<String> getSubjects(){
        return subjects;
    }
    public double getGPA(){
        double totalPoint = 0.0;
        for (char gr : grade) {
            switch (gr){
                case 'A':
                    totalPoint += 5.0;
                    break;
                case 'B':
                    totalPoint += 4.0;
                    break;
                case 'C':
                    totalPoint += 3.0;
                    break;
                case 'D':
                    totalPoint += 2.0;
                    break;
            }
        }
        return totalPoint / grade.size();
    }


}
