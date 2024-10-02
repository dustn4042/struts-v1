package com.data;

import org.apache.struts.action.*;
import javax.servlet.http.*;

public class DataTest1 extends Action {
	public ActionForward execute(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String s_name = req.getParameter("name");
		String s_id = req.getParameter("id");
		String s_pwd = req.getParameter("pwd");
		ActionForward forward = null;
		if (s_name != null && s_id != null && s_pwd != null) {
			HttpSession session = req.getSession();
			session.setAttribute("s_name", s_name);
			session.setAttribute("s_id", s_id);
			session.setAttribute("s_pwd", s_pwd);
			forward = m.findForward("result"); // ActionMapping객체에서 Forward검색
		}
		return forward;
	}
}