package com.mycompany.jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jdbctest {
    public static void main(String[] args) {
       String usuario="root";
       String password="";
       String url="jdbc:mysql://localhost:3306/cvmi";
        Connection conexion;  
        Statement statement;
        ResultSet rs;
        
               
        try {
            conexion=DriverManager.getConnection(url, usuario,password);
            statement =conexion.createStatement();
            rs = statement.executeQuery("SELECT * FROM usuarios");
            while(rs.next()){
                System.out.println(rs.getString("usuario")); 
            }

            //insercion de datos
        statement.execute("INSERT INTO `usuarios` (`ID`, `usuario`, `contraseña`) VALUES (NULL, 'lmon', '46');");
        System.out.println("");
        rs = statement.executeQuery("SELECT * FROM usuarios");
            while(rs.next()){
                 System.out.println(rs.getString("usuario"));
              }  
            
            //Actualizacion de datos
            statement.execute("UPDATE `usuarios` SET `usuario` = 'NROJAS' WHERE `usuarios`.`ID` = 7;");
        System.out.println("");
        rs = statement.executeQuery("SELECT * FROM usuarios");
            while(rs.next()){
                 System.out.println(rs.getString("usuario"));
              }  
            
            //Eliminar datos
            statement.execute("DELETE FROM usuarios WHERE `usuarios`.`ID` = 9");
        System.out.println("");
        rs = statement.executeQuery("SELECT * FROM usuarios");
            while(rs.next()){
                 System.out.println(rs.getString("usuario"));
              } 
            
        } catch (SQLException ex) {
            Logger.getLogger(Jdbctest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
