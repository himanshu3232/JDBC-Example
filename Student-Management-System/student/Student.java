package student;

public class Student {
    private String name;
    private int rollNumber;
    private float grade;

    public Student(String name, int rollNumber, float grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    public Student(){}
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public float getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "[Name: " + name + "       Roll_Number: " + rollNumber + "         Grade: " + grade + "]";
    }
}
