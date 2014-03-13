package com.dfwcomputech.vaadin.views;

import com.dfwcomputech.vaadin.components.NavigatorButton;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class StartView  extends VerticalLayout implements View{
		
	public StartView(final Navigator navigator ) {	
		setSizeFull();
		NavigatorButton button = new NavigatorButton("Go to Main View", ViewConstants.MAINVIEW, navigator);
		//Button button = new Button("Go to Main View",new MyButtonListener());
		addComponent(button);
		setComponentAlignment(button, Alignment.MIDDLE_CENTER);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		Notification.show("This is the Start View");
		
	}
	
}
