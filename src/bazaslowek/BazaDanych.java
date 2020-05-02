package bazaslowek;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joann
 */
public class BazaDanych {
    public void losLekarz(JTextArea tSlowko, JTextField tTlumacz) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection polaczenie = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost\\MSSQLSERVER01;databaseName=Slownik",
                    "sa", "student"
            );
            PreparedStatement ps = 
                    polaczenie.prepareStatement("{call dbo.slownikLekarz}");
            ResultSet rezultat = ps.executeQuery();
            while (rezultat.next()) {
                tSlowko.append(rezultat.getString("niemiecki") + "\n" );
                tTlumacz.setText(rezultat.getString("polski"));
            }
            polaczenie.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd " + e.getMessage(), 
                    "Błąd", JOptionPane.ERROR_MESSAGE);
            
        }
    }
        public void sprawdzLekarz(JTextField tTlumacz) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection polaczenie = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost\\MSSQLSERVER01;databaseName=Slownik",
                    "sa", "student"
            );
            PreparedStatement ps = 
                    polaczenie.prepareStatement("{call dbo.slownikLekarz}");
            ResultSet rezultat = ps.executeQuery();
            while (rezultat.next()) {
                tTlumacz.setText(rezultat.getString("polski") + "\n");
            }
            polaczenie.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd " + e.getMessage(), 
                    "Błąd", JOptionPane.ERROR_MESSAGE);
            
        }
    }
        public void losUbrania(JTextArea tSlowko, JTextField tTlumacz) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection polaczenie = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost\\MSSQLSERVER01;databaseName=Slownik",
                    "sa", "student"
            );
            PreparedStatement ps = 
                    polaczenie.prepareStatement("{call dbo.slownikUbrania}");
            ResultSet rezultat = ps.executeQuery();
            while (rezultat.next()) {
                tSlowko.append(rezultat.getString("niemiecki"));
                tTlumacz.setText(rezultat.getString("polski"));
            }
            polaczenie.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd " + e.getMessage(), 
                    "Błąd", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    public void losCharakter(JTextArea tSlowko, JTextField tTlumacz) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection polaczenie = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost\\MSSQLSERVER01;databaseName=Slownik",
                    "sa", "student"
            );
            PreparedStatement ps = 
                    polaczenie.prepareStatement("{call dbo.slownikCharakter}");
            ResultSet rezultat = ps.executeQuery();
            while (rezultat.next()) {
                tSlowko.append(rezultat.getString("niemiecki"));
                tTlumacz.setText(rezultat.getString("polski"));
            }
            polaczenie.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd " + e.getMessage(), 
                    "Błąd", JOptionPane.ERROR_MESSAGE);
            
        }
    }
        public void losZwroty(JTextArea tSlowko, JTextField tTlumacz) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection polaczenie = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost\\MSSQLSERVER01;databaseName=Slownik",
                    "sa", "student"
            );
            PreparedStatement ps = 
                    polaczenie.prepareStatement("{call dbo.slownikZwroty}");
            ResultSet rezultat = ps.executeQuery();
            while (rezultat.next()) {
                tSlowko.append(rezultat.getString("niemiecki"));
                tTlumacz.setText(rezultat.getString("polski"));
            }
            polaczenie.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd " + e.getMessage(), 
                    "Błąd", JOptionPane.ERROR_MESSAGE);
            
        }
    }
}
