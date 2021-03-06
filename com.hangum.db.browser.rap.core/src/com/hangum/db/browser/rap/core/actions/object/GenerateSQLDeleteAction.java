package com.hangum.db.browser.rap.core.actions.object;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IWorkbenchWindow;

import com.hangum.db.browser.rap.core.Activator;
import com.hangum.db.browser.rap.core.Messages;
import com.hangum.db.browser.rap.core.actions.connections.QueryEditorAction;
import com.hangum.db.commons.sql.TadpoleSQLManager;
import com.hangum.db.dao.mysql.TableColumnDAO;
import com.hangum.db.define.Define;
import com.hangum.db.define.Define.DB_ACTION;
import com.hangum.db.exception.dialog.ExceptionDetailsErrorDialog;
import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * generate sql statement     
 * 
 * @author hangumNote
 *
 */
public class GenerateSQLDeleteAction extends GenerateSQLSelectAction {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(GenerateSQLDeleteAction.class);
	public final static String ID = "com.hangum.db.browser.rap.core.actions.object.GenerateSQLDeleteAction"; //$NON-NLS-1$
	
	public GenerateSQLDeleteAction(IWorkbenchWindow window, DB_ACTION actionType, String title) {
		super(window, actionType, title);
	}
	
	@Override
	public void run() {
		StringBuffer sbSQL = new StringBuffer();
		try {
			Object strTBName = sel.getFirstElement();
			
			SqlMapClient sqlClient = TadpoleSQLManager.getInstance(userDB);
			List<TableColumnDAO> showTableColumns = sqlClient.queryForList("tableColumnList", strTBName); //$NON-NLS-1$
			
			sbSQL.append(" DELETE FROM " + strTBName + " "); //$NON-NLS-1$ //$NON-NLS-2$
			sbSQL.append("\r\n WHERE \r\n "); //$NON-NLS-1$
			int cnt = 0;
			for (int i=0; i<showTableColumns.size(); i++) {
				TableColumnDAO dao = showTableColumns.get(i);
				if(Define.isKEY(dao.getKey())) {
					if(cnt == 0) sbSQL.append("\t" + dao.getField() + " = ? \r\n"); //$NON-NLS-1$ //$NON-NLS-2$
					else sbSQL.append("\tAND " + dao.getField() + " = ?"); //$NON-NLS-1$ //$NON-NLS-2$
					cnt++;
				}				
			}
			sbSQL.append(Define.SQL_DILIMITER); //$NON-NLS-1$
			
			//
			QueryEditorAction qea = new QueryEditorAction();
			qea.run(userDB, sbSQL.toString());
		} catch(Exception e) {
			logger.error(Messages.GenerateSQLDeleteAction_10, e);
			
			Status errStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e); //$NON-NLS-1$
			ExceptionDetailsErrorDialog.openError(null, "Error", Messages.GenerateSQLDeleteAction_0, errStatus); //$NON-NLS-1$
		}
	}

}
