package com.hangum.db.browser.rap.core.actions.connections;

import org.eclipse.jface.action.IAction;

import com.hangum.db.browser.rap.core.util.QueryTemplateUtils;
import com.hangum.db.dao.system.UserDBDAO;
import com.hangum.db.define.Define;

/**
 * function 생성 action
 * 
 * @author hangumNote
 *
 */
public class CreateFunctionAction extends AbstractQueryAction {

	public CreateFunctionAction() {
		super();
	}

	@Override
	public void run(IAction action) {
		UserDBDAO userDB = (UserDBDAO)sel.getFirstElement();
		
		run(userDB, QueryTemplateUtils.getQuery(userDB, Define.DB_ACTION.FUNCTIONS));
	}

}
