/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
            config.getUrl(), config.getUser(), config.getPassword()
        );
    }

    @Override
    public List<Ad> all() {
        Statement statement = null;
        List<Ad> ads = new ArrayList<>();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ads");
            while (resultSet.next()) {
                ads.add(new Ad(
                    resultSet.getLong("id"),
                    resultSet.getLong("user_id"),
                    resultSet.getString("title"),
                    resultSet.getString("description")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
