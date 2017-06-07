import java.util.List;

/**
 * Created by Fer on 6/7/17.
 */
public interface Users {
    List<User> all();
    User getUserById(long id);
    User getUserByEmail(String email);
}
