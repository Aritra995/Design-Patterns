package main;

import Singleton.DbSingleton;
import logging.ConsoleLogger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonMain {
    public static void main(String[] args) {
        DbSingleton dbSingleton = DbSingleton.getInstance();
        Connection conn = dbSingleton.getConnection();
        Statement statement;

        try {
            statement = conn.createStatement();
            int count = statement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20)," + " City VARCHAR(20))");
            ConsoleLogger.writeInfo("Table created");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from Address");
            ConsoleLogger.writeQueryResults(resultSet);
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
