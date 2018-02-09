package com.design.structural.bridgeDesignPattern;

/**
 * Created by hemantkumar on 2/7/2018.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class EveryDayUsage {
        public static void main(String args[]) {

            try {
                //JDBC is an API
                DriverManager.registerDriver(new OracleDriver()); // <- Driver

                String url = "jdbc:oracle:thin:@10.151.9.123:1521:orcl1";

                Connection conn = getConnection(url);

                Statement sta = conn.createStatement();

                //This client is an abstraction and can work with any database that has a driver
                sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20),"
                        + " City VARCHAR(20))");

                System.out.println("Table created");

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }


