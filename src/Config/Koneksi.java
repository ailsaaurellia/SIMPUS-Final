/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import Simpus.GUIBuku;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import persisten.Buku;

/**
 *
 * @author Ailsa
 */
public class Koneksi {

    static final String dbURL = "jdbc:postgresql://localhost:5432/Simpus";
    static final String USER = "postgres";
    static final String PASS = "Chanhee98";

    public static void main(String[] args) {

        try ( Connection conn = DriverManager.getConnection(dbURL, USER, PASS)) {
            if (conn != null) {
                System.out.println("Koneksi sukses!");
                System.out.println(" ");
            }
        } catch (SQLException e) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
    }

        }
