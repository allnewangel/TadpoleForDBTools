package com.hangum.db.browser.rap.core.viewers.object;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.widgets.Table;

/**
 * table의 컬럼의 0번째 값을 소스로 설정합니다. 
 * 
 * @author hangumNote
 *
 */
public class DragListener implements DragSourceListener {
	TableViewer viewer;
	
	public DragListener(TableViewer viewer) {
		this.viewer = viewer;
	}

	@Override
	public void dragStart(DragSourceEvent event) {
	}

	@Override
	public void dragSetData(DragSourceEvent event) {
		Table table = viewer.getTable();
		if( table.getSelectionCount() == 0) return;
		
//		StringBuffer sbTableName = new StringBuffer();
//		IStructuredSelection is = (IStructuredSelection)viewer.getSelection();
//		for(Object obj : is.toArray()) {
//			sbTableName.append(obj.toString()).append(":");
//		}
		
		event.data = table.getSelection()[0].getText();
	}

	@Override
	public void dragFinished(DragSourceEvent event) {
	}

}
