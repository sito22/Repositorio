/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Cristian
 */
public class BDArchivo {
    private static String FILE_NAME = "bdusuarios.txt";
    private FileReader fr;
    private BufferedReader br = new BufferedReader(fr);
    private FileWriter fw;
    private BufferedWriter bw = new BufferedWriter(fw);
    
    /**
     *
     * @param args
     */
    public static void main(String args[])
    {
        
    }

    public BDArchivo() throws FileNotFoundException, IOException {
        this.fr = new FileReader(FILE_NAME);
        this.fw = new FileWriter(FILE_NAME, true);
    }
    
    public void nuevoUsuario(Usuario user) throws IOException
    {
        String linea = user.toString();
        bw.write(linea);
        bw.newLine();
    }
    
    public void buscarUsuario(String name, String password) throws IOException
    {
        boolean encontrado = false;
        String linea;
        while ((linea = br.readLine())!=null)
        {
            
        }
        Reader r = new Reader();
        r.
    }
    
    
}
