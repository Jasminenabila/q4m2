/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Abdullah Fawwaz Q
 */
public class sql_connect {
    public static Connection sqlConnect = null;
    public static void Koneksi()
    {
            try
            {
             String url ="jdbc:sqlserver://localhost\\DESKTOP-UEHMCCQ\\FAWWAZ:1433;databaseName=Bicycle";
               sqlConnect = DriverManager.getConnection(url,"fawwaz","fawwaz09");
            }
            catch(Exception ex)
            {
                        
            }
    }
}
