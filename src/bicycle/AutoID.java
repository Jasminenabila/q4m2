/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

import static bicycle.sql_connect.sqlConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Abdullah Fawwaz Q
 */
public class AutoID {
    public static String Akun()
    {
        try
        {
            //Connection to Database
            
            sql_connect.Koneksi();
            String sql = "select top 1 id_pegawai from pegawai order by id_pegawai desc";
            Statement state = sql_connect.sqlConnect.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            String id_pegawai = null;
            if (rs.next()) {
                id_pegawai = rs.getString("id_pegawai");
                int nextNumber = Integer.parseInt(id_pegawai.substring(3)) +1;
                if (nextNumber <10) {
                    id_pegawai = "A00" + nextNumber;
                }
                else if (nextNumber <100)
                {
                    id_pegawai = "A0" + nextNumber;
                }
                else 
                {
                    id_pegawai= "A" + nextNumber;
                }
            }
            else
            {
                id_pegawai = "A001";
            }
            return id_pegawai;
        }
        catch(Exception e)
        {
            System.err.println(e);
            return null;
        }
    }
    
     public static String Return()
    {
        try
        {
            //Connection to Database
            
            sql_connect.Koneksi();
            String sql = "select top 1 id_pengembalian from pengembalian order by id_pengembalian desc";
            Statement state = sql_connect.sqlConnect.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            String id_pengembalian = null;
            if (rs.next()) {
                id_pengembalian = rs.getString("id_pengembalian");
                int nextNumber = Integer.parseInt(id_pengembalian.substring(3)) +1;
                if (nextNumber <10) {
                    id_pengembalian = "R00" + nextNumber;
                }
                else if (nextNumber <100)
                {
                    id_pengembalian = "R0" + nextNumber;
                }
                else 
                {
                    id_pengembalian = "R" + nextNumber;
                }
            }
            else
            {
                id_pengembalian = "R001";
            }
            return id_pengembalian;
        }
        catch(Exception e)
        {
            System.err.println(e);
            return null;
        }
    }
    
    public static String CustomerID()
    {
        try
        {
            //Connection to Database
            
            sql_connect.Koneksi();
            String sql = "select top 1 id_cus from customer order by id_cus desc";
            Statement state = sql_connect.sqlConnect.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            String id_cus = null;
            if (rs.next()) {
                id_cus = rs.getString("id_cus");
                int nextNumber = Integer.parseInt(id_cus.substring(3)) +1;
                if (nextNumber <10) {
                    id_cus = "C00" + nextNumber;
                }
                else if (nextNumber <100)
                {
                    id_cus = "C0" + nextNumber;
                }
                else
                {
                    id_cus = "C" + nextNumber;
                }
            }
            else
            {
                id_cus = "C001";
            }
            return id_cus;
        }
        catch(Exception e)
        {
            System.err.println(e);
            return null;
        }
    }
    
    public static String SepedaID()
    {
        try
        {
            //Connection to Database
            
            sql_connect.Koneksi();
            String sql = "select top 1 id_sepeda from sepeda order by id_sepeda desc";
            Statement state = sql_connect.sqlConnect.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            String id_sepeda = null;
            if (rs.next()) {
                id_sepeda = rs.getString("id_sepeda");
                int nextNumber = Integer.parseInt(id_sepeda.substring(3)) +1;
                if (nextNumber <10) {
                    id_sepeda = "B00" + nextNumber;
                }
                else if (nextNumber <100)
                {
                    id_sepeda = "B0" + nextNumber;
                }
                else
                {
                    id_sepeda = "B" + nextNumber;
                }
            }
            else
            {
                id_sepeda = "B001";
            }
            return id_sepeda;
        }
        catch(Exception e)
        {
            System.err.println(e);
            return null;
        }
    }
    public static String TransaksiID()
    {
        try
        {
            //Connection to Database
            
            sql_connect.Koneksi();
            String sql = "select top 1 id_transaksi from transaksi order by id_transaksi desc";
            Statement state = sql_connect.sqlConnect.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            String id_transaksi = null;
            if (rs.next()) {
                id_transaksi = rs.getString("id_transaksi");
                int nextNumber = Integer.parseInt(id_transaksi.substring(3)) +1;
                if (nextNumber <10) {
                    id_transaksi = "T00" + nextNumber;
                }
                else if (nextNumber <100)
                {
                    id_transaksi = "T0" + nextNumber;
                }
                else
                {
                    id_transaksi = "T" + nextNumber;
                }
            }
            else
            {
                id_transaksi = "T001";
            }
            return id_transaksi;
        }
        catch(Exception e)
        {
            System.err.println(e);
            return null;
        }
    }
}
