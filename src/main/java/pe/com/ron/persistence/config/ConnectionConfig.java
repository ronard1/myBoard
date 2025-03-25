package pe.com.ron.persistence.config;

import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public final class ConnectionConfig {

    public static Connection getConnection() throws SQLException {
        var url ="jdbc:mysql://localhost:3306/jdbc-sample";
        var user = "jdbc-sample";
        var password = "jdbc-sample";
        var connection = DriverManager.getConnection(url, user,password);
        connection.setAutoCommit(false);
        return  connection;
    }
}
