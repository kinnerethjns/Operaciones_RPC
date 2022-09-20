package modal;

import server.methods;
import server.MySQLConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoAuth {
    Connection conn;

    PreparedStatement pstm;
    CallableStatement cstn;
    ResultSet rs;

    private final String INSERT_OPERATION = "INSERT INTO operation(type,first_number,second_number,result)values (?,?,?,?)";

   /* public boolean saveOperation(methods operation){
        try{
            conn = new MySQLConection().getConnection();
            String query =INSERT_OPERATION;
            pstm = conn.prepareStatement(query);
            pstm.setDouble(1,operation.getFirstNumber());
            pstm.setDouble(2,operation.getSecondNumber());
            pstm.setString(3,operation.getTypeOperation());
            pstm.setString(4,operation.getResponse());
            return pstm.executeUpdate()==1;
        }catch (SQLException e){
            Logger.getLogger(DaoCalculadora.class.getName()).log(Level.SEVERE, "Error saveOperation->"+e);
            return false;
        }finally {
            closeConnection();
        }
    } */


    public void closeConnection(){
        try{
            if(conn != null){
                conn.close();
            }
            if(pstm != null){
                pstm.close();
            }
            if(cstn != null){
                cstn.close();
            }
            if(rs != null){
                rs.close();
            }
        }catch (SQLException e){

        }
    }



}

