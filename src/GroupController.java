import java.util.ArrayList;
import java.util.List;

public class GroupController {
    private final List<User> userList = new ArrayList<>();
    private final GroupService groupService = new GroupService();

    public void creaStudent(String firstName, String secondName, String lastName) {
        int id = 0;
        for (User user : userList) {
            if (user instanceof Student) {
                id = ((Student) user).getStudentID() + 1;
            }
        }
        userList.add(new Student( firstName, secondName, lastName, id));
    }

    public void creaTeacher(String firstName, String secondName, String lastName) {
        int id=1 ;
        for (User user : userList) {
            if (user instanceof Teacher) {
                id = ((Teacher) user).getTeacherID() + 1;
            }
        }
        userList.add(new Teacher(firstName, secondName, lastName, id));
    }

    public void creaGroup() {
        User teacherGroup = getGroupTeacher();
        List<User> students = studentsInGroup();
        Group group = groupService.createGroup(teacherGroup, students);
        System.out.println(group.toString());
    }



    public User getGroupTeacher() {
        int id=1;

           while(true){
           for (User user : userList) {
                if (user instanceof Teacher && ((Teacher) user).getTeacherID() == id) {
                    return user;
                }
            }
           }
    }

    public List<User> studentsInGroup() {
        List<User> studentsGroup = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                studentsGroup.add(user);
            }
        }
        return studentsGroup;

    }
}
