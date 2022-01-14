package Classes;

import java.sql.*;

public class Select {

    public static void select(String name_table) {
        try {
            String strClassName = "com.mysql.jdbc.Driver";
            String dbName = "java_school";
            String login = "root";
            String motdepasse = "";
            String strUrl = "jdbc:mysql://localhost:3306/" + dbName;
            Class.forName(strClassName);
            Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
            Statement stSelectAccess = conn.createStatement();
            String strSelect = "SELECT * FROM " + name_table + ";";
            ResultSet rsSelect = stSelectAccess.executeQuery(strSelect);
            while(rsSelect.next()){
                String name = rsSelect.getString("prenom");
                String identifiant = rsSelect.getString("login");
                String statut = rsSelect.getString("statut");
                int age = rsSelect.getInt("age");
                System.out.println("- " + name + " / " + identifiant + " / " + statut + " / " + age);
            }
            rsSelect.close();

            conn.close();
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver non chargé !");
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
