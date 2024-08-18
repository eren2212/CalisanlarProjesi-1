
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;


public class CalisanIslemleri {
    private Connection con =null;
    private Statement statement =null;
    private PreparedStatement preparedStatement = null;
    
    public CalisanIslemleri(){
        
        String url = "jdbc:mysql://"+ DataBase.host + ":" + DataBase.port + "/" +DataBase.db_ismi+"?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadi");
        }
        
        try {
            con = DriverManager.getConnection(url, DataBase.kullanici_adi,DataBase.parola);
            System.out.println("Bağlantı başarılı");
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız");
        }
        
    }
    public static void main(String[] args) {
        CalisanIslemleri calisanIslemleri = new CalisanIslemleri();
    }
}
