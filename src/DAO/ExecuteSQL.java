package DAO;

import java.sql.*;

class ExecuteSQL {
    private Connection con;

    public Connection getCon() {
        return con;
    }
    
    public void setCon(Connection con) {
        this.con = con;
    }
    
    public ExecuteSQL(Connection con) {
        setCon(con);
    }
}
