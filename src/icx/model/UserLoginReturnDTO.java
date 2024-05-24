/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icx.model;

/**
 *
 * @author 94701
 */
public class UserLoginReturnDTO {

    private UserDTO userData;
    private boolean login;
    private String msg;

    public UserLoginReturnDTO() {

    }

    public UserLoginReturnDTO(UserDTO userDTO, boolean login,String msg) {
        this.userData = userDTO;
        this.login = login;
        this.msg = msg;
    }

    /**
     * @return the userData
     */
    public UserDTO getUserData() {
        return userData;
    }

    /**
     * @param userData the userData to set
     */
    public void setUserData(UserDTO userData) {
        this.userData = userData;
    }

    /**
     * @return the login
     */
    public boolean isLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(boolean login) {
        this.login = login;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

  
}
