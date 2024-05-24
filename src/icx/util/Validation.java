/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icx.util;

/**
 *
 * @author Yasith Sandesh
 */
public class Validation {

    public static boolean mobile(String mobile) {
        return !mobile.matches("^07[01245678]{1}[0-9]{7}$");
    }

    public static boolean email(String email) {
        return !email.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@\"\n\"[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$");
    }

    public static boolean password(String password) {
        if (password.length() < 5 || password.length() > 10) {
            return true;
        }
        return false;
    }
}
