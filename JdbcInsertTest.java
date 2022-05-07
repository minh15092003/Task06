package JdbcInsertTest;

import java.lang.module.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcInsertTest {
    public static void main(String[] args){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL""myuser\"jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL\"jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL""myuser","xxxx");
                Statement stmt = conn.createStatement();
                ){
            String sqlDelete = "delete from books where id >=3000 and id < 4000";
            System.out.println("The SQL stactement is:" + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + "records delete.\n");

            String sqlInset = "insert into books values ( 3001, 'Gone Fishing','Kumar',11.11,11)";
        }

    }
}
