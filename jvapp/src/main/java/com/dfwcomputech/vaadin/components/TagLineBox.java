package com.dfwcomputech.vaadin.components;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class TagLineBox extends CustomComponent{
	private Panel box= new Panel();
	private Label content = new Label();
	private NavigatorButton button;	
	
	public TagLineBox(String caption,String destination,Navigator navigator){
		VerticalLayout layout = new VerticalLayout();
		box.setContent(layout);				
		content.setValue(caption);
		button = new NavigatorButton("Submit",destination,navigator);
		
		layout.addComponent(content);
		layout.addComponent(button);
		
		setCompositionRoot(box);
	}
	
	public void setButtonCaption(String caption){
		button.setCaption(caption);
	}
		
}
