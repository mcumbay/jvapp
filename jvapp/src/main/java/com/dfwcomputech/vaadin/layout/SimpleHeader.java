package com.dfwcomputech.vaadin.layout;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.server.Resource;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.MenuBar;

@SuppressWarnings("serial")
public class SimpleHeader extends CustomComponent{
	private Image logo;
	private MenuBar menu;
	
	public SimpleHeader(){		
		HorizontalLayout layout = new HorizontalLayout();
		setCompositionRoot(layout);
		setLogo();
		setMenu();
		layout.addComponent(logo);
		layout.addComponent(menu);
	}
	
	private List<MenuBar.MenuItem> setMenu() {
		menu = new MenuBar();
		menu.addStyleName("horizontal_menu");
		List<MenuBar.MenuItem> rootMenuList= new ArrayList<MenuBar.MenuItem>();
		rootMenuList.add(menu.addItem("Home", null));
		rootMenuList.add(menu.addItem("About Us", null));
		rootMenuList.add(menu.addItem("My Work", null));
		rootMenuList.add(menu.addItem("Contact Us", null));
		return rootMenuList;
	}

	private void setLogo(){
		Resource res = new ThemeResource("img/logo_banner.png");
		logo = new Image(null,res);					
		logo.setWidth("463px");
		logo.setHeight("106px");
	
	}
}
