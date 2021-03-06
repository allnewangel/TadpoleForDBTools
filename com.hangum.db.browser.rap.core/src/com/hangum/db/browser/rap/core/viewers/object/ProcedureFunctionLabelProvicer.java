package com.hangum.db.browser.rap.core.viewers.object;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.hangum.db.dao.mysql.ProcedureFunctionDAO;

/**
 * procedure function 의 컬럼 정보
 * 
 * @author hangumNote
 *
 */
public class ProcedureFunctionLabelProvicer extends LabelProvider implements ITableLabelProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}
	
	@Override
	public String getColumnText(Object element, int columnIndex) {
		ProcedureFunctionDAO tc = (ProcedureFunctionDAO) element;

		switch(columnIndex) {
		case 0: return tc.getName();
		case 1: return tc.getType();
		case 2: return tc.getDefiner();
		case 3: return tc.getModified();
		case 4: return tc.getCreated();
		case 5: return tc.getSecurity_type();
		
		case 6: return tc.getComment();
		case 7: return tc.getCharacter_set_client();
		case 8: return tc.getCollation_connection();
		case 9: return tc.getDatabase();
		case 10: return tc.getCollation();
		}
		
		return "** not set column **";
	}

}
