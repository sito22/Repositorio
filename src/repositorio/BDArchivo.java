/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Cristian, José Ignacio, Carlos
 */
public class BDArchivo {
    private static final File FILE_NAME = new File("bdusuarios.txt");
    /*private FileReader fr;
    private BufferedReader br = new BufferedReader(fr);
    private FileWriter fw;
    private BufferedWriter bw = new BufferedWriter(fw);*/
    private RandomAccessFile BDFile;

    public BDArchivo() throws FileNotFoundException
    {
        BDFile = new RandomAccessFile(FILE_NAME, "rw");
    }
    
    private void abrir() throws FileNotFoundException
    {
        this.BDFile = new RandomAccessFile(FILE_NAME, "rw");
    }

            
    public void nuevoUsuario(Usuario user) throws IOException
    {
        String linea = user.toString();
        abrir();
        BDFile.

    }
    
    /*
    if encontrado && correctPw -> return 0;
    if !encontrado -> return 1;
    if encontrado && !correctPw -> return 2;
    */
    public int buscarUsuario(String name, String password) throws IOException
    {
        boolean encontrado = false, correctPw = false;
        String linea = br.readLine();
        String pw = "";
        while ((linea = br.readLine())!=null && !encontrado)
        {
            int firstComma = linea.indexOf(",");
            int secondComma = linea.indexOf(",", firstComma);
            String usuario = linea.substring(0, firstComma);            
            if (usuario.equals(name))
            {
                pw = linea.substring(firstComma, secondComma);
                break;
            }
        }
        if (!encontrado)
        {
            return 1;
        }
        else if (pw.equals(password))
        {
            return 0;
        }
        else 
        {
            return 2;
        }
    } 
   
    
    public int getNumber() throws IOException
    {
        br.close();
        br = new BufferedReader(fr);
        int n = br.read();
        br.close();
        bw.close();
        bw = new BufferedWriter(fw);
        bw.write(n+1);
        return n;
    }
    
    
}
