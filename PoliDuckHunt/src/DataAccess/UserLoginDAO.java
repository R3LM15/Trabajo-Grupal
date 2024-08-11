package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import DataAccess.DTO.UserLoginDTO;
import Framework.ScoreException;

public class UserLoginDAO extends SQLiteDataHelper implements IDAO<UserLoginDTO>{

    @Override
    public boolean create(UserLoginDTO entity) throws Exception {
        //  3            ,'asdhas sad'   ,'1241', '12:12:!2'
        String query = " INSERT INTO UserLogin (IdNivel ,Nombre ,Puntaje ,Tiempo ) VALUES (?,?,?,?)";
        try {
            Connection        conn  = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, entity.getIdNivel());   //
            pstmt.setString(2, entity.getNombre());
            pstmt.setString(3, entity.getPuntaje());
            pstmt.setString(4, entity.getTiempo());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw new ScoreException(e.getMessage(), getClass().getName(), "create()");
        }
    }

    @Override
    public List<UserLoginDTO> readAll() throws Exception {
        List <UserLoginDTO> lst = new ArrayList<>();
        String query =" SELECT ROW_NUMBER () OVER ( ORDER BY IdUserLogin ) RowNum "
                     +" ,IdUserLogin        "
                     +" ,IdNivel            "
                     +" ,Nombre             "
                     +" ,Puntaje            "
                     +" ,Tiempo             "
                     +" ,Estado             "
                     +" ,FechaCreacion      "
                     +" ,FechaModifica      "
                     +" FROM    UserLogin   "
                     +" WHERE   Estado ='A' ";  
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet  rs   = stmt.executeQuery(query);    // ejecutar la
            while (rs.next()) {
                UserLoginDTO u = new UserLoginDTO( 
                                        rs.getInt(1)     // RowNum
                                        ,rs.getInt(2)     // IdUserLogin
                                        ,rs.getInt(3)     // IdNivel             
                                        ,rs.getString(4)  // Nombre         
                                        ,rs.getString(5)  // Puntaje      
                                        ,rs.getString(6)  // Tiempo      
                                        ,rs.getString(7)  // Estado
                                        ,rs.getString(8)  // FechaCreacion
                                        ,rs.getString(9));// FechaModifica
                lst.add(u);
            }
        } 
        catch (SQLException e) {
            throw new ScoreException(e.getMessage(), getClass().getName(), "readAll()");
        }
        return lst; 
    }

    @Override
    public boolean update(UserLoginDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String query = "UPDATE UserLogin SET Nombre = ?, Puntaje = ?, Tiempo = ?, FechaModifica = ? WHERE IdUserLogin = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());
            pstmt.setString(2, entity.getPuntaje());
            pstmt.setString(3, entity.getTiempo());
            pstmt.setString(4, dtf.format(now).toString());
            pstmt.setInt(5, entity.getIdUserLogin());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw new ScoreException(e.getMessage(), getClass().getName(), "update()");
        }
    }

    @Override
    public boolean delete(int id) throws Exception {
        String query = " UPDATE UserLogin SET Estado = ? WHERE IdUserLogin = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement  pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "X");
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw new ScoreException(e.getMessage(), getClass().getName(), "delete()");
        }
    }

    @Override
    public UserLoginDTO readBy(Integer id) throws Exception {
        UserLoginDTO u = new UserLoginDTO();
        String query = 
         " SELECT RowNum            "
        +"     ,IdCatalogo          "
        +"     ,IdCatalogoTipo      "
        +"     ,Nombre              "
        +"     ,Descripcion         "
        +"     ,Estado              "
        +"     ,FechaCreacion       "
        +"     ,FechaModifica       "
        +" FROM (                   "
        +"     SELECT ROW_NUMBER() OVER (ORDER BY IdCatalogo) AS RowNum "
        +"         ,IdCatalogo      "
        +"         ,IdCatalogoTipo  "   
        +"         ,Nombre          "
        +"         ,Descripcion     "   
        +"         ,Estado          "
        +"         ,FechaCreacion   "       
        +"         ,FechaModifica   "   
        +"     FROM Catalogo        "
        +"     WHERE Estado = 'A'   "
        +"     AND IdCatalogoTipo = 2 "
        +" ) sub                    "
        +" WHERE RowNum = " + id.toString();  
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet  rs   = stmt.executeQuery(query);    // ejecutar la
            System.out.println(query);
            while (rs.next()) {
                u = new UserLoginDTO( 
                                rs.getInt(1)     // RowNum
                                ,rs.getInt(2)     // IdCatalogo
                                ,rs.getInt(3)     // IdCatalogoTipo             
                                ,rs.getString(4)  // Nombre         
                                ,rs.getString(5)  // Puntaje      
                                ,rs.getString(6)  // Tiempo      
                                ,rs.getString(7)  // Estado
                                ,rs.getString(8)  // FechaCreacion
                                ,rs.getString(9));// FechaModifica
            }
        } 
        catch (SQLException e) {
            throw new ScoreException(e.getMessage(), getClass().getName(), "readBy()");
        }
        return u; 
    }

    public Integer getRowCount()  throws Exception  {
        String query =" SELECT COUNT(*) TotalReg "
                     +" FROM    UserLogin         "
                     +" WHERE   Estado ='A'      ";
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                return rs.getInt(1);                    // TotalReg
            }
        } 
        catch (SQLException e) {
            throw new ScoreException(e.getMessage(), getClass().getName(), "getRowCount()");
        }
        return 0;
    }
}
