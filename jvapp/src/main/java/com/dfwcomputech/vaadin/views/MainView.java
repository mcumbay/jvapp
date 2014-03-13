package com.dfwcomputech.vaadin.views;

import com.dfwcomputech.vaadin.components.NavigatorButton;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class MainView extends VerticalLayout implements View {	
	
	public MainView(final Navigator navigator){				
		setSizeFull();			
		NavigatorButton button = new NavigatorButton("Go to Start View", ViewConstants.STARTVIEW, navigator);
		addComponent(button);		
		setComponentAlignment(button, Alignment.MIDDLE_CENTER);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		Notification.show("This is the Main View");
	}

}
