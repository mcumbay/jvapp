package com.dfwcomputech.vaadin.components;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;

@SuppressWarnings("serial")
public class NavigatorButton extends Button{
	private Navigator navigator;
	private String destination;	
	
	public NavigatorButton(String caption,String destination,Navigator navigator){
		super(caption);
		addClickListener(new MyButtonListener());
		this.navigator=navigator;
		this.destination=destination;
		
	}
	
	//Button Listener
	class MyButtonListener implements Button.ClickListener{
		@Override
		public void buttonClick(ClickEvent event) {
			navigator.navigateTo(destination);			
		}		
	}
}
