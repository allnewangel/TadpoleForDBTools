package com.hangum.tadpole.erd.core.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class DBFigure extends Figure {
	private Label labelURL		= new Label();
	
	private Label labelDBType 	= new Label();
	private Label labelID 		= new Label();
	
	private XYLayout layout;
	
	public DBFigure() {
		layout = new XYLayout();
		setLayoutManager(layout);
		
		labelDBType.setForegroundColor(ColorConstants.lightBlue);
		add(labelDBType);
		setConstraint(labelDBType, new Rectangle(2, 2, -1, -1));
		
//		labelID.setForegroundColor(ColorConstants.lightBlue);
//		add(labelID);
//		setConstraint(labelID, new Rectangle(5, 17, -1, -1));
//		
//		labelURL.setForegroundColor(ColorConstants.blue);
//		add(labelURL);
//		setConstraint(labelURL, new Rectangle(5, 29, -1, -1));
		
		setForegroundColor(ColorConstants.black);
		setBorder(new LineBorder(1));
		
	}
	
	public void setLayout(Rectangle rect) {
		setBounds(rect);
	}

	public void setLabelDBType(String dbType) {
		this.labelDBType.setText(dbType);
	}
	
	public void setLabelID(String id) {
		this.labelID.setText(id);
	}
	
	public void setLabelURL(String labelURL) {
		this.labelURL.setText(labelURL);
	}
}
