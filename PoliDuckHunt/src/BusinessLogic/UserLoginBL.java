package BusinessLogic;

import java.util.List;

import DataAccess.UserLoginDAO;
import DataAccess.DTO.UserLoginDTO;

public class UserLoginBL {
    private UserLoginDTO user;
    private UserLoginDAO uDAO = new UserLoginDAO();

    public UserLoginBL(){}

    public List<UserLoginDTO> getAll() throws Exception{
        List<UserLoginDTO> lst = uDAO.readAll();
        for (UserLoginDTO userLoginDTO : lst) 
            userLoginDTO.setNombre(userLoginDTO.getNombre().toUpperCase());
        return lst;
    }
    public UserLoginDTO getBy(int idUserLogin) throws Exception{
        user = uDAO.readBy(idUserLogin);
        return user;
    }
    public boolean add(UserLoginDTO userLoginDTO) throws Exception{   
        return uDAO.create(userLoginDTO);
    }
    public boolean update(UserLoginDTO userLoginDTO) throws Exception{
        return uDAO.update(userLoginDTO);
    }
    public boolean delete(int idUserLogin) throws Exception{
        return uDAO.delete(idUserLogin);
    }
    public Integer getRowCount() throws Exception{
        return uDAO.getRowCount();
    }
}
