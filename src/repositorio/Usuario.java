/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import javax.swing.ImageIcon;

/**
 *
 * @author sito
 */
public class Usuario {
    private String username;
    private String password;
    private String correo="";
    private ImageIcon perfilImage;
    private int id;
    
    public Usuario(String un, String pw)
    {
        username = un;
        password = pw;
    }
    
    //Getters & setters
    
    public void setCorreo(String email)
    {
        correo = email;
    }
    
    public void setPerfilImage(ImageIcon img)
    {
        perfilImage = img;
    }
    
    public void setPassword(String pw)
    {
        password = pw;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getCorreo()
    {
        return correo;
    }
    
    public ImageIcon getPerfilImage()
    {
        return perfilImage;
    }
    
    public String toString()
    {
        return (this.username + "," + this.password + "," + this.correo + ".");
    }
}
