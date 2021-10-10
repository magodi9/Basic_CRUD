/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;


/**
 *
 * @author USER
 */
public class asistenteModel {
    private String login;
    private String nombre;
    private String apellido;
    private String email;
    private Long celular;
    private String clave;
    private Date fecha_nto;
    
    
  public asistenteModel(String login,String nombre,String apellido,String email,Long celular,String clave,Date fecha_nto ){
        this.login = login;
        this.nombre = nombre;
        this.apellido=apellido;
        this.email = email;
        this.celular = celular;
        this.clave = clave;
        this.fecha_nto = fecha_nto;


}
    public asistenteModel(String login,String nombre,String apellido,String email,Long celular,Date fecha_nto ){
        this.login = login;
        this.nombre = nombre;
        this.apellido=apellido;
        this.email = email;
        this.celular = celular;
  
        this.fecha_nto = fecha_nto;


}

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the celular
     */
    public Long getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the fecha_nto
     */
    public Date getFecha_nto() {
        return fecha_nto;
    }

    /**
     * @param fecha_nto the fecha_nto to set
     */
    public void setFecha_nto(Date fecha_nto) {
        this.fecha_nto = fecha_nto;
    }

    
    public Object[] toArray() {
       Object[] data = {login, nombre, apellido, email, celular, fecha_nto};
       return data;
    }
    
}
