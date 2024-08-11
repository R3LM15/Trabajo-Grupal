

import BusinessLogic.UserLoginBL;
import DataAccess.DTO.UserLoginDTO;
import DuckHunt.DuckHunt;

public class App {
    public static void main(String[] args) throws Exception {
        UserLoginBL uBl = new UserLoginBL();
        for (UserLoginDTO u : uBl.getAll()) {
            System.out.println(u.toString());
        }
        DuckHunt.main(args);
    }
}
