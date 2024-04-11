import java.util.ArrayList;

public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents = new ArrayList<>();

        public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents) {
                this.topic = topic;
                this.instructor = instructor;
                this.enrolledStudents = enrolledStudents;
        }
        public ArrayList<Student> getEnrolledStudents() {
                return enrolledStudents;
        }
}
