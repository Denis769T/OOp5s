import java.util.List;

public class Group {
    private User teacherGroup;
    private List<User> students;

    public Group(User teacherGroup, List<User> students) {
        this.teacherGroup = teacherGroup;
        this.students = students;
    }

    public User getTeacherGroup() {
        return teacherGroup;
    }

    public void setTeacherGroup(User teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "    " +
                teacherGroup.toString() + students.toString()
                ;
    }
}
