package com.talentLMS.DB.utils;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.talentLMS.UI.dataProviders.ConfigReader;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.*;

public class DBConnection {

    private static Connection connection;
    private static Statement statement;
    private static QueryRunner queryRunner;


    public static void open(String databaseName) throws SQLException {
        if (connection == null) {
            queryRunner = new QueryRunner(getBaseDataSource(databaseName));
            connection = getBaseDataSource(databaseName).getConnection();
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        }
    }


    public static void close() {
        try {
            if (statement != null) {
                statement.close();
                statement = null;
            }
            if (connection != null) {
                connection.close();
                connection = null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static ResultSet query(String query, Object... params) throws SQLException {
        if (params.length == 0) {
            return statement.executeQuery(query);
        } else {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            return preparedStatement.executeQuery();
        }
    }




    private static MysqlDataSource getBaseDataSource(String database) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName(ConfigReader.getProperty("server"));
        dataSource.setPortNumber(Integer.parseInt(ConfigReader.getProperty("port")));
        dataSource.setUser(ConfigReader.getProperty("user"));
        dataSource.setPassword(ConfigReader.getProperty("passwordDB"));
        dataSource.setDatabaseName(database);
        return dataSource;
    }

}
