package com.input;

import org.apache.struts.action.*;
import javax.servlet.http.*;

public class InputAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setAttribute("inputObj", form);
		return mapping.findForward("result");
	}
}