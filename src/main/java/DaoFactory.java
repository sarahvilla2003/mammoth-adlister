import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            try {
                adsDao = new MySQLAdsDao(new Config());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return adsDao;
    }

    public static Users getUsersDao() {
//        if (usersDao == null) {
//            try {
//                usersDao = new MySQLAdsDao(new Config());
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
        return usersDao;
    }
}
