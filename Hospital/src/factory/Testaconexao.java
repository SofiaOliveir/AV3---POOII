
package factory;

import java.sql.Connection;
import java.sql.SQLException;


public class Testaconexao {
    
    public static void main(String[] args) throws SQLException {
        
        Connection connection= new Conexao().getConnection();
        System.out.println("Conexao Aberta");
        connection.close();
        
    }
    
}
