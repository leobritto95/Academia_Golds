/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiagolds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Not
 */
public class BancoDeDados {

    private static String user = "root";
    private static String password = "";

    public static Connection getConexao() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //cria uma conexão com banco de dados
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/academia", user, password);
            return con;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha ao conectar com banco de dados!");
            return null;
        }
    }
}
