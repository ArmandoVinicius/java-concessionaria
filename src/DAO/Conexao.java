package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    public static Connection AbrirConexao() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_concessionaria";
            con = DriverManager.getConnection(url, "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar se conectar ao banco de dados", "Concessionária Hope", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
        return con;
    }
    
    public static void FecharConexao(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
