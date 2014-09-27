/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Muistilista.Tietokanta;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Yhteys {
    private Connection yhteys;
    
    public Yhteys() throws NamingException, SQLException{
        InitialContext cxt = new InitialContext();
        DataSource yhteysVarasto = (DataSource) cxt.lookup("java:/comp/env/jdbc/viukari");
        
        this.yhteys = yhteysVarasto.getConnection();
    }
    public Connection getYhteys() throws NamingException, SQLException{
        return this.yhteys;
    }
}
