package com.dfwcomputech.vaadin;

import com.dfwcomputech.vaadin.layout.simple.SimpleLayout;
import com.dfwcomputech.vaadin.views.MainView;
import com.dfwcomputech.vaadin.views.StartView;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
/**
 * @autor mcumbay  
 * 
 **/
@Theme("bookatme")
@SuppressWarnings("serial")
public class MyVaadinUI extends UI {
	private SimpleLayout mainLayout= new SimpleLayout();	
	@Override
	protected void init(VaadinRequest request) {
		getPage().setTitle("Navigation Example");
		setContent(mainLayout);
		createNavigation();
		getNavigator().navigateTo(StartView.FRAGMENTID);		
		
	}
	
	private void createNavigation(){
		Navigator navigator = new Navigator(this,mainLayout.getBody());		
		navigator.addView(StartView.FRAGMENTID, new StartView(navigator));
		navigator.addView(MainView.FRAGMENTID, new MainView(navigator));		
		setNavigator(navigator);
	}

}
