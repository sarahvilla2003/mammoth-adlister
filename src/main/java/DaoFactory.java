/**
 * Created by Fer on 6/7/17.
 */
public class DaoFactory {
    private static Users usersDao;

    public static Users getUsersDao(){
        // To check if the object of Users is being created already
        if(usersDao == null){
            usersDao = new ListUsersDao();
        }
        return usersDao;
    }

}
