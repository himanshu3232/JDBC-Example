package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

class DbConnection{
    static void loadDriver(){
        try{
            Class.forName("org.postgresql.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    static Optional<Connection> establishConnection() {
        loadDriver();
        try {
            Connection con = DriverManager.getConnection(DbDetails.URL,DbDetails.USER_NAME,DbDetails.PASSWORD);
            return Optional.ofNullable(con);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }
}
