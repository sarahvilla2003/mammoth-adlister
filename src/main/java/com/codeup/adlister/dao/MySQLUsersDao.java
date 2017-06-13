/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.List;

public class MySQLUsersDao implements Users {
    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        try {
            // write SQL
            // prepare a statement
            // bind the parameters
            // execute the query
            // take the result set row/rows and convert it in a User/List<User>
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery(); // is only for select
            if (resultSet.next()) {
                return new User(
                    resultSet.getLong("id"),
                    resultSet.getString("username"),
                    resultSet.getString("username"),
                    resultSet.getString("password")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Long insert(User user) {
        String insert = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(
                insert, Statement.RETURN_GENERATED_KEYS
            );
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.executeUpdate(); // insert, update, delete
            // you can copy/paste the following 3 lines for other insert methods
            ResultSet keys = statement.getGeneratedKeys();
            keys.next();
            return keys.getLong(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> all() {
        return null;
    }
}
