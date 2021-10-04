package CS201.MockExam;

public class Student {
    private String stdName;
    private int stdId;
     private  double gpa;
     private Course course;

    public Student(String stdName, int stdId, double gpa, Course course) {
        this.stdName = stdName;
        this.stdId = stdId;
        this.gpa = gpa;
        this.course = course;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        return "Student" + "stdName='" + stdName + '\'' + ", stdId=" + stdId + ", gpa=" + gpa + " course : " + this.course.getCourseName() ;
    }
}
