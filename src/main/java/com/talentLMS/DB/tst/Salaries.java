package com.talentLMS.DB.tst;

import com.talentLMS.DB.utils.DBConnection;
import com.talentLMS.UI.dataProviders.ConfigReader;
import lombok.*;
import org.apache.commons.dbutils.BeanProcessor;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Salaries {

    private int emp_no;
    private int salary;
    private String from_date;
    private String to_date;

    public static List<Salaries> getAll() throws SQLException {
        String query = "select * from employees;";
        try (ResultSet resultSet = DBConnection.query(query)) {
            return new BeanProcessor().toBeanList(resultSet, Salaries.class);
        }
    }

    public static Salaries getBy(String column, String value) throws SQLException {
        String query = "Select * from salaries where " + column + " = ?;";
        ResultSet rs = DBConnection.query(query, value);
        if (!rs.next()) return null;
        return new BeanProcessor().toBean(rs, Salaries.class);
    }


    public static int getCount() throws SQLException {
        String query = "select max(salary) from salaries ";
        ResultSet rs = DBConnection.query(query);
        rs.next();
        int count = rs.getInt(1);
        return count;
    }

//    public static List<String> getColumnsNames(String tableName) throws SQLException {
//        String query = "select column_name from information_schema.columns where table_name = '" + tableName + "';";
//        ResultSet rs = DBConnection.query(query);
//        ResultSetMetaData rsmd = rs.getMetaData();
//        int columnCount = rsmd.getColumnCount();
//        List<String> columnsNamesList = new ArrayList<>();
//        for (int i = 1; i <= columnCount; i++) {
//            String columnName = rsmd.getColumnName(i);
//            columnsNamesList.add(columnName);
//        }
//        return columnsNamesList;
//    }


    public static List<String> getColumnNames(String dbName, String tableName) throws SQLException {
        String query = "select * from " + dbName + "." + tableName + ";";
        ResultSet rs = DBConnection.query(query);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();
        List<String> columnsNamesList = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rsmd.getColumnName(i);
            columnsNamesList.add(columnName);
        }
        return columnsNamesList;
    }

    public static List<String > getColumnNamesTable(String tableName) throws SQLException {
        String query = "select column_name from information_schema.columns where table_name = '" + tableName + "';";
        ResultSet rs = DBConnection.query(query);
        List<String> columnData = new ArrayList<>();

        while (rs.next()) {
            String data = rs.getString("COLUMN_NAME");
            columnData.add(data);
        }
        rs.close();
        return columnData;
    }

}
