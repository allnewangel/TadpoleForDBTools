package com.hangum.db.browser.rap.action;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IWorkbenchWindow;

import com.hangum.db.browser.rap.Messages;
import com.hangum.db.browser.rap.dialog.about.AboutDialog;
import com.swtdesigner.ResourceManager;

/**
 * Opens an &quot;About RAP&quot; message dialog.
 */
public class AboutAction extends Action {
	
	private final IWorkbenchWindow window;
	
	public AboutAction(IWorkbenchWindow window) {
		super(Messages.AboutAction_0);
		setId(this.getClass().getName());
		setImageDescriptor( ResourceManager.getPluginImageDescriptor("com.hangum.db.browser.rap.core", "resources/icons/about.png"));
		
		this.window = window;
	}
	
	public void run() {
		if(window != null) {	
//			String title = Messages.AboutAction_1;
//			
//			String msg =   Messages.AboutAction_2
//						 + Messages.AboutAction_3
//			             + Messages.AboutAction_4 
//			             + Messages.AboutAction_5;
//			MessageDialog.openInformation( window.getShell(), title, msg );
			AboutDialog ad = new AboutDialog(window.getShell());
			ad.open();
			
		}
	}
	
}
