/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icx.util;

/**
 *
 * @author 94701
 */
public class Validation {

    public static boolean mobile(String mobile) {
        return mobile.matches(mobile);
    }

    public static boolean email(String email) {
        return email.matches(email);
    }
}
