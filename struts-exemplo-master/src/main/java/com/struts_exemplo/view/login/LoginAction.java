package com.struts_exemplo.view.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
	HttpServletRequest request, HttpServletResponse response) 
	throws Exception {
		LoginForm loginForm = (LoginForm) form;
		if(loginForm.getUsername() == null || loginForm.getPassword() == null	||
				!loginForm.getUsername().equalsIgnoreCase("admin") || 
				!loginForm.getPassword().equalsIgnoreCase("admin")) {
			return mapping.findForward("failure");
		}
		else {
			return mapping.findForward("abrir_body");
		}
	}
	
	public ActionForward direct(ActionMapping mapping, ActionForm form,
	HttpServletRequest request, HttpServletResponse response){
		return mapping.findForward("abrir_body");
	}
}
