package _1_learn._1_8_database._1_8_2_jdbc._1_8_2_2_postgresql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(final String[] PARAMETERS) throws SQLException {
        final DatabaseConnection DATABASE_CONNECTION = new DatabaseConnection(
                "jdbc:postgresql://localhost:5432/DatabaseExample",
                "postgres",
                "Mstx_0952?"
        );
        final Connection CONNECTION = DATABASE_CONNECTION.connect();
        final QueryExecutor QUERY_EXECUTOR = new QueryExecutor(CONNECTION);
        final String SQL_QUERY = "SELECT * FROM schema_example.table_example";
        QUERY_EXECUTOR.executePrintTable(SQL_QUERY);
    }
}