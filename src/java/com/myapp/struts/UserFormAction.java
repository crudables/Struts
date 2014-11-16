/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author ables
 */
public class UserFormAction extends org.apache.struts.action.ActionForm {

  
    
   private String username;
   private String password;
   private String usertype;
   
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


   
   

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if(username == null||username.length()<6){
        errors.add("username error", new ActionMessage("username.error"));
        }
        if(password==null||password.length()<5)
            errors.add("password error", new ActionMessage("password error"));
        if(usertype.equals("0"))
            errors.add("select type", new ActionMessage("select type"));
       
        return errors;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getdefault(){
    return "User";
    }
}
