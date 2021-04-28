/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import Model.Gerente;
import java.util.*;
import javax.swing.JOptionPane;

public class FuncionarioDAO extends ExecuteSQL {
    
    public FuncionarioDAO(Connection con) {
        super(con);
    }
    
    public boolean Logar(String user, String passw) {
        boolean finalResult = false;
        try {
            String query = "SELECT * FROM gerente WHERE login = '" + user + "' AND senha = '" + passw + "'"; 
            PreparedStatement ps = getCon().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Gerente func = new Gerente();
                    func.setUsuario(rs.getString(1));
                    func.setSenha(rs.getString(2));
                    System.out.println("Gerente logou com sucesso");
                    finalResult = true;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar logar");
            ex.getMessage();
        }
        return finalResult;
    }
    
    public String Inserir_Gerente(Gerente ger) {
        String query = "INSERT INTO gerente(nome, usuario, senha) VALUES(?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(query);
            
            ps.setString(1, ger.getNome());
            ps.setString(2, ger.getUsuario());
            ps.setString(3, ger.getSenha());
            
            if(ps.executeUpdate() > 0) {
                return "Gerente inserido com sucesso.";
            } else {
                return "Erro ao inserir gerente";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
}
