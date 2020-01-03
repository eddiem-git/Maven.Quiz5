package rocks.zipcode.io.quiz4.collections;

import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    List<Student> students;
    double totalLectureTime;
    public void enroll(Student student) {
        students.add(student);

    }

    public Boolean isEnrolled(Student student) {
        return students.contains(student);
    }

    public void lecture(double numberOfHours) {
        this.totalLectureTime += numberOfHours;
    }

    public Map<Student, Double> getStudyMap() {

        return null;
    }
}
