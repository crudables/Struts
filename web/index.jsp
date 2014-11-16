<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib  uri="/struts-tags" prefix="s" %>
<html:html>
    <head>
        
    </head>
    <body>
        <html:form action="UserAction">
            <table>
                <tr>
                    <td><bean:message key="label.message"/><br></td>
                </tr>
                <tr>
                    <td>select user type:  &nbsp;&nbsp;&nbsp;</td> <td><html:select property="usertype">
                            <html:option value="0">Select type</html:option>
                            <html:option value="1">Administrator</html:option>
                            <html:option value="2">Poll Owner</html:option>
                            <html:option value="3">Poll Participant</html:option>
                        </html:select>
                        </td>
                        
                </tr>
                
                <tr>
                    <td><bean:message key="label.username"/></td><td><html:text property="username" size="20"/></td>
                </tr>
                <tr>
                    <td><bean:message key="label.password"/></td><td><html:password property="password" size="20"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td> 
                        <html:submit value="Submit"/>
            </td>
                </tr>
            </table>
        </html:form>
    </body>
</html:html>