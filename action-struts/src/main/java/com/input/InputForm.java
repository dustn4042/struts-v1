package com.input;

import org.apache.struts.action.*;
import javax.servlet.http.*;
import org.apache.struts.action.ActionForm;

public class InputForm extends ActionForm {

	private static final long serialVersionUID = 1L;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private String userId;
	private String userPwd;
	private String userName;

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		userName = "";
		userPwd = "";
		userId = "";
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors err = null;

		if ((userName == null) || (userName.length() < 1) || (userId == null) || (userId.length() < 1)
				|| (userPwd == null) || (userPwd.length() < 1)) {
			err = new ActionErrors();
			err.add("ERROR!!", new ActionMessage("Error.required"));
		}
		return err;
	}
}
