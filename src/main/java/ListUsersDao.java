import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fer on 6/7/17.
 */
public class ListUsersDao implements Users{

    List<User> users;

    @Override
    public List<User> all()
    {
        if(users == null){
            users = generateDummyUsers();
        }

        return users;
    }

    @Override
    public User getUserById(long id) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    public List<User> generateDummyUsers(){

        List<User> list = new ArrayList<>();

        User fer = new User();
        fer.setId(1);
        fer.setUsername("fernando");
        fer.setEmail("fer@mail.com");
        fer.setPassword("pass");

        list.add(fer);
        list.add(new User(2,"luis","luis@mail.com", "pass"));
        list.add(new User(3,"zach","zach@mail.com", "pass"));

        return list;
    }

}
