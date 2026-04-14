package Tehtava11.task3;

import java.io.Serializable;

public class Enrollment implements Serializable {
     Student student;
     Course course;
     String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }
    public Course getCourse() {
        return course;
    }
    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public String toString() {
        return "Enrollment{student=" + student + ", course=" + course + ", date='" + enrollmentDate + "'}";
    }
}
