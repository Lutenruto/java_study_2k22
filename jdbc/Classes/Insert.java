package Classes;

import java.sql.*;

public class Insert {
    
    public static void insert(String name_table) {
        try {
            String strClassName = "com.mysql.jdbc.Driver";
            String dbName = "java_school";
            String login = "root";
            String motdepasse = "";
            String strUrl = "jdbc:mysql://localhost:3306/" + dbName;
            String strInsert = "INSERT INTO "
                    + name_table
                    + " (prenom, login, password, statut, age)"
                    + "VALUES ('Toto', 'Titi', 'yiyorop12', 'Etudiant', 24);";
            Class.forName(strClassName);
            Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
            Statement stAddAccess = conn.createStatement();
            stAddAccess.executeUpdate(strInsert);

            conn.close();
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver non chargé !");
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
