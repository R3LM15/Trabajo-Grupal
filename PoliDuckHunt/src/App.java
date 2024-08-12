

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;

import BusinessLogic.UserLoginBL;
import DataAccess.DTO.UserLoginDTO;
import UserInterfaceD.Forms.MainForm;
import UserInterfaceD.Forms.RegisterForm;
import UserInterfaceD.Forms.SplashForm;

public class App {
    public static void main(String[] args) throws Exception {
        //UserLoginBL uBl = new UserLoginBL();
        //for (UserLoginDTO u : uBl.getAll()) {
        //    System.out.println(u.toString());
        //}
        //DuckHunt.main(args);
        System.out.println(System.currentTimeMillis());
        FlatLightLaf.setup();
        FlatLightLaf.supportsNativeWindowDecorations();
        try {
                UIManager.setLookAndFeel(new FlatAtomOneDarkIJTheme());
            } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        SplashForm.show();
        RegisterForm frmRegisterForm = new RegisterForm();
    }
}
