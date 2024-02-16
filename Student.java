package assignment3;

public class Student {
    private int PRN;
    private String name;
    private String dob;
    private float marks;

    public Student(int PRN, String name, String dob, float marks) {
        this.PRN = PRN;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    public int getPRN() {
        return PRN;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }
    public float getMarks() {
        return marks;
    }

    public void setPRN(int PRN) {
        this.PRN = PRN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    public void setMarks(float marks) {
        this.dob = dob;
    }
}
