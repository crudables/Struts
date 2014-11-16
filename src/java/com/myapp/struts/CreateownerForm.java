/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

/**
 *
 * @author ables
 */
public class CreateownerForm extends org.apache.struts.action.ActionForm {
    private String OwnerName;
    private String OwnerId;
    private String password;
    
    

    /**
     * @return
     */
  
    /**
     *
     */
    public CreateownerForm() {
        super();
        // TODO Auto-generated constructor stub
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
        if(OwnerId==null)
            errors.add(OwnerId, new ActionMessage("errors.struts.ownerid"));
        if(OwnerName == null || OwnerName.length()<10)
            errors.add("ownername error", new ActionMessage("errors.struts.username"));
        if(password == null || password.length()<8)
            errors.add("owner password", new ActionMessage("errors.struts.password"));
        
        return errors;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public String getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
