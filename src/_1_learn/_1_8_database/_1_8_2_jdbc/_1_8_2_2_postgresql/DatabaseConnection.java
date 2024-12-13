package _1_learn._1_8_database._1_8_2_jdbc._1_8_2_2_postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {
    private final String URL;
    private final String USERNAME;
    private final String PASSWORD;

    DatabaseConnection(final String URL, final String USERNAME, final String PASSWORD) {
        this.URL = URL;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
    }

    Connection connect() throws SQLException {
        return DriverManager.getConnection(
                URL,
                USERNAME,
                PASSWORD
        );
    }
}