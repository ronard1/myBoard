package pe.com.ron;

import pe.com.ron.persistence.migration.MigrationStrategy;
import pe.com.ron.ui.MainMenu;

import java.sql.SQLException;

import static pe.com.ron.persistence.config.ConnectionConfig.getConnection;


public class Main {
    public  static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        //System.out.println("hola");
        new MainMenu().execute();
    }
}
