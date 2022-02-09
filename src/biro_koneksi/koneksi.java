/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biro_koneksi;

/**
 *
 * @author febri
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        login pindah = new login();
//        pindah.setVisible(true);
    }
    
    public static Connection konek(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection konekDB = DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","1234");
            return konekDB;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;       
        }
    }
    
}
