package _1_learn._1_8_database._1_8_2_jdbc._1_8_2_4_hsqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {
    private final String URL;

    DatabaseConnection(final String URL) {
        this.URL = URL;
    }

    Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}