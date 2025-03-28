package _1_learn._1_8_database._1_8_2_jdbc._1_8_2_1_mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(final String[] ARGUMENTS) throws SQLException {
        final DatabaseConnection DATABASE_CONNECTION = new DatabaseConnection(
                "jdbc:mysql://127.0.0.1:3306",
                "root",
                "root"
        );
        final Connection CONNECTION = DATABASE_CONNECTION.connect();
        final QueryExecutor QUERY_EXECUTOR = new QueryExecutor(CONNECTION);
        final String SQL_QUERY = "SELECT * FROM schema_example.table_example";
        QUERY_EXECUTOR.executePrintTable(SQL_QUERY);
    }
}