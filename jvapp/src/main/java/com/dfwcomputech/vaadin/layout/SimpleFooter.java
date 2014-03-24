package com.dfwcomputech.vaadin.layout;

import java.util.Date;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

@SuppressWarnings("serial")
public class SimpleFooter extends CustomComponent{
	private HorizontalLayout layout = new HorizontalLayout();
	private Label copyRight = new Label();
	private String companyName="DFW Computech Marketing";
	
	public SimpleFooter(){
		setCompositionRoot(layout);		
		layout.addComponent(copyRight);
		copyRight.setValue(getCopyRightLabel());
		copyRight.setWidth(null);
	}
	
	public SimpleFooter(String companyName){
		this();
		if((companyName!=null)&&(!companyName.isEmpty()))
			this.companyName=companyName;
		copyRight.setValue(getCopyRightLabel());
	}
	
	private String getCopyRightLabel(){
		Date today = new Date();
		String crStr = String.format("Copyright 2011 - %tY  %s | All Rights Reserved ", today,companyName); 				
		return crStr;
	}
}
