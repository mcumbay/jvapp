package com.dfwcomputech.vaadin.views;

import com.dfwcomputech.vaadin.components.NavigatorButton;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Resource;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Image;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class MainView extends VerticalLayout implements View {	
	
	public static final String FRAGMENTID = "main";
	
	public MainView(final Navigator navigator){				
		setSizeFull();	
		Resource res = new ThemeResource("img/family.jpg");
		Image image = new Image("I <3 U",res);			
		image.setHeight("400px");
		image.setWidth("300px");
		NavigatorButton button = new NavigatorButton("Otra vez :)", StartView.FRAGMENTID, navigator);
		addComponent(image);
		addComponent(button);		
		setComponentAlignment(button, Alignment.MIDDLE_CENTER);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		Notification.show("Remember your family!!");
	}

}
