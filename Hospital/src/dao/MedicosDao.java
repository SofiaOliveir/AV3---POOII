package dao;

import com.mysql.cj.xdevapi.PreparableStatement;
import factory.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Medicos;


public class MedicosDao {
    
        private Connection connection;
        int id_medicos;
        String nome_medicos;
        String crm_medicos; 
        String especialidade_medicos;
        double salario_medicos;
        
        public MedicosDao(){
       
            this.connection = new Conexao().getConnection();
        
        }
        
        public void inserir(Medicos medicos){
        
        String sql = "INSERT INTO medicos(nome_medicos, crm_medicos,"
                + "especialidade_medicos, salario_medicos)" + "VALUES(?,?,?,?)";
                
            try {
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, medicos.getNome_medicos());
                stmt.setString(2, medicos.getCrm_medicos());
                stmt.setString(3, medicos.getEspecialidade_medicos());
                stmt.setDouble(4, medicos.getSalario_medicos());
                stmt.execute();
                stmt.close();
                
            } catch (SQLException u) {
                
                throw new RuntimeException(u);
                
            }
        
        }
   
}
