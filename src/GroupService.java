import java.util.List;

public class GroupService {

    public Group createGroup (User teacher, List<User> students) {
        return new Group(teacher,students);
    }
}
