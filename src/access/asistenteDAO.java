/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import model.asistenteModel;
import utils.ConnectionDB;
/**
 *
 * @author USER
 */

public class asistenteDAO {
    private Connection conn = null; 
    
    public void postAsistent(asistenteModel asistent){
       
        try{
          if(conn == null)
              conn = ConnectionDB.getConnection();
          String sql = "INSERT INTO asistente VALUES(?,?,?,?,?,?,?);";
          PreparedStatement statement = conn.prepareStatement(sql); //PreparedStatement = Listar creacion del query
          statement.setString(1,asistent.getLogin()); //statement = inyección de datos
          statement.setString(2,asistent.getNombre());
          statement.setString(3,asistent.getApellido());
          statement.setString(4,asistent.getEmail());
          statement.setLong(5,asistent.getCelular());
          statement.setString(6,asistent.getClave());
          statement.setDate(7,asistent.getFecha_nto());
          int rowsInserted = statement.executeUpdate();
           if (rowsInserted > 0)
               JOptionPane.showMessageDialog(null,"El registro fue agregado exitosamente");
          else{
                   JOptionPane.showMessageDialog(null,"Ingrese todos los campos");}}
        catch (SQLException ex){
               if(ex.getErrorCode() == 1062){
                   JOptionPane.showMessageDialog(null, "Ya existe un usuario con ese nickname");
               }
               else{
               JOptionPane.showMessageDialog(null, "Codigo :" + ex.getErrorCode() + "\nError : " + ex.getMessage());
         }}
        
    
    
    }
    public asistenteModel getAsistentByLogin(String login){
        asistenteModel asistente = null;
        
        try{  
        if(conn == null)
              conn = ConnectionDB.getConnection();
       String sql = "Select asi_login,asi_nombre,asi_apellido,asi_email,asi_celular,asi_fecha_nto From asistente Where asi_login = ?;";     
       
       PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, login);
        ResultSet result = statement.executeQuery();
       ;
       while(result.next()){
         asistente = new asistenteModel(result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getLong(5),result.getDate(6));
         break;         
       }
          
     }
    catch(SQLException ex){
               JOptionPane.showMessageDialog(null, "Codigo :" + ex.getErrorCode() + "\nError : " + ex.getMessage());}
    
         
                     
        return asistente;
    }
    
    public ArrayList<asistenteModel> getAllAsistents(){
          ArrayList<asistenteModel> asistentes = new ArrayList<>() ;
        try{
      
        if(conn == null)
              conn = ConnectionDB.getConnection();
        
       String sql = "Select asi_login,asi_nombre,asi_apellido,asi_email,asi_celular,asi_fecha_nto From asistente;";     
       Statement statement = conn.prepareStatement(sql);  
       ResultSet result = statement.executeQuery(sql);
       
       
     
       while(result.next()){
         asistenteModel asis = new asistenteModel(result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getLong(5),result.getDate(6));
         asistentes.add(asis)  ;     

       }
   
     }
    catch(SQLException ex){
               JOptionPane.showMessageDialog(null, "Codigo :" + ex.getErrorCode() + "\nError : " + ex.getMessage());}
     return asistentes ;
    }
     public void updateAsistente(String tipo,String update,String login){
     try{
       if(conn == null)
              conn = ConnectionDB.getConnection();
       
         String sql = "UPDATE asistente SET "+tipo+"  = ? WHERE asi_login = ? ;";
         PreparedStatement statement = conn.prepareStatement(sql);
         //statement.setString(1, tipo);
         statement.setString(1, update);
         statement.setString(2, login); 
         int rowsInserted = statement.executeUpdate();
         if (rowsInserted > 0)
               JOptionPane.showMessageDialog(null,"Se actualizo la informacion correctamente");
         else{
            JOptionPane.showMessageDialog(null,"No se encontro al usuario @"+login);
         }
     
     }
     catch(SQLException ex ){
      JOptionPane.showMessageDialog(null, "Codigo :" + ex.getErrorCode() + "\nError : " + ex.getMessage());}
     
     }
     public void deleteAsistentByLogin(String login,String password){
     try{
       if(conn == null)
              conn = ConnectionDB.getConnection();
        String sql = "DELETE FROM asistente WHERE asi_login = ? and asi_clave=?;";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1,login);
        statement.setString(2,password);
      int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue borrado exitosamente !");
            }else{JOptionPane.showMessageDialog(null,"No existe registro con  "+ login +",porfavor ingrese el login correctamente");}
     } catch(SQLException ex ){
      JOptionPane.showMessageDialog(null, "Codigo :" + ex.getErrorCode() + "\nError : " + ex.getMessage());}
     
}
}
   

   
