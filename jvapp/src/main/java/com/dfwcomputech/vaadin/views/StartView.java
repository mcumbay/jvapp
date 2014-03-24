package com.dfwcomputech.vaadin.views;

import com.dfwcomputech.vaadin.components.TagLineBox;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Image;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class StartView  extends VerticalLayout implements View{
	public static final String FRAGMENTID = "";
		
	private Image banner = new Image(null,new ThemeResource("img/slider01.png"));	
	private TagLineBox tagline;
	
	public StartView(final Navigator navigator ) {
		setBanner();		
		setTagLine(navigator);
		addComponent(banner);		
		addComponent(tagline);
		
	}
	
	@Override
	public void enter(ViewChangeEvent event) {	
		
	}
	
	public void setBanner(){								
		banner.setWidth("100%");		
	}	
	
	public void setTagLine(Navigator navigator){
		tagline = new TagLineBox("Set an appointment Now!!!",MainView.FRAGMENTID,navigator);
		tagline.setButtonCaption("CREATE");
		tagline.setWidth("100%");
	}
	
}
