package com.CostumTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TagHandeler  extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();
			out.println("<h1>This is a costum tag </h1>");
		} catch (Exception e) {
			e.getStackTrace();
		}
		return SKIP_BODY;
	}
	

}
