package com.dfwcomputech.vaadin;

import com.dfwcomputech.vaadin.views.MainView;
import com.dfwcomputech.vaadin.views.StartView;
import com.dfwcomputech.vaadin.views.ViewConstants;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
/*
 * @autor mcumbay  
 * 
 */
@Theme("bookatme")
@SuppressWarnings("serial")
public class MyVaadinUI extends UI {
	private Navigator navigator;
		
	@Override
	protected void init(VaadinRequest request) {
		getPage().setTitle("Navigation Example");
		navigator = new Navigator(this,this);
		
		navigator.addView(ViewConstants.STARTVIEW, new StartView(navigator));
		navigator.addView(ViewConstants.MAINVIEW, new MainView(navigator));
		
		navigator.navigateTo(ViewConstants.STARTVIEW);
		
	}

}
