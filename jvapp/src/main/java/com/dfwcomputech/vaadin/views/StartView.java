package com.dfwcomputech.vaadin.views;

import com.dfwcomputech.vaadin.components.NavigatorButton;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Image;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class StartView  extends VerticalLayout implements View{
	public static final String FRAGMENTID = "";
		
	private Image banner = new Image(null,new ThemeResource("img/slider01.png"));
	private NavigatorButton button; 
	
	public StartView(final Navigator navigator ) {
		setBanner();
		setButton(navigator);
		addComponent(banner);
		addComponent(button);
		setComponentAlignment(button, Alignment.MIDDLE_CENTER);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {	
		
	}
	
	public void setBanner(){								
		banner.setWidth("100%");		
	}
	
	public void setButton(final Navigator navigator){
		button = new NavigatorButton("CREATE", MainView.FRAGMENTID, navigator);
	}
	
}
