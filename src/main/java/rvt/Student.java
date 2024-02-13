package rvt;

public class Student extends Person {

    private String students;
    private String adress2;
    private int credits;

    public Student(String students, String adress2, int credits) {
        super(students, adress2); 
        this.students = students;
        this.adress2 = adress2;
        this.credits = credits;
    }


    private int studyCredits;


    public Student(String name, String address) {
        super(name, address);
        this.studyCredits = 0;
    }


    public void study() {
        studyCredits++;
    }


    public int credits() {
        return studyCredits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + studyCredits;
    }
}
