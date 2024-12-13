package _1_learn._1_8_database._1_8_2_jdbc._1_8_2_1_mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

class QueryExecutor {
    private final Connection CONNECTION;

    QueryExecutor(final Connection CONNECTION) {
        this.CONNECTION = CONNECTION;
    }

    void executePrintTable(final String SQL_QUERY) throws SQLException {
        final Statement STATEMENT = CONNECTION.createStatement();
        final ResultSet RESULT_SET = STATEMENT.executeQuery(SQL_QUERY);
        final ResultSetMetaData RESULT_SET_META_DATA = RESULT_SET.getMetaData();
        final int COLUMN_COUNT = RESULT_SET_META_DATA.getColumnCount();
        for (int index = 1; index <= COLUMN_COUNT; index++) {
            System.out.printf("%35s", RESULT_SET_META_DATA.getColumnName(index));
            if (index < COLUMN_COUNT)
                System.out.print(" | ");
            else
                System.out.println();
        }
        System.out.println("-".repeat(225));
        while (RESULT_SET.next()) {
            for (int index = 1; index <= COLUMN_COUNT; index++) {
                System.out.printf("%35s", RESULT_SET.getString(index));
                if (index < COLUMN_COUNT)
                    System.out.print(" | ");
            }
            System.out.println();
        }
    }
}