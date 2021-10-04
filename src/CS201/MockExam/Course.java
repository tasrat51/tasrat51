package CS201.MockExam;

public class Course {
    private String courseId;
    private String courseName;
    private int creditHr;

    public Course(String courseId, String courseName, int creditHr) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHr = creditHr;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditHr() {
        return creditHr;
    }

    public void setCreditHr(int creditHr) {
        this.creditHr = creditHr;
    }
}
