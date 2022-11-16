/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomTag;

import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *CustomTag.CustomTags
 * @author ASUS
 */
public class CustomTags extends TagSupport{
    int number;
    @Override
    public int doStartTag() throws JspException {
        try {
            Date date= new Date();
            JspWriter out = pageContext.getOut();
            out.println("<h1>This is my custom tags</h1>");
            out.println("<h2>The date is"+date+" </h>");
        } catch (Exception e) {
        }
        return SKIP_PAGE; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
