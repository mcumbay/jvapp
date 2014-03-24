package com.dfwcomputech.vaadin.layout.simple;

import com.dfwcomputech.vaadin.layout.SimpleFooter;
import com.dfwcomputech.vaadin.layout.SimpleHeader;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.Panel;
/**
 * Simple Layout example
 * CustomLayout for a basic Web Application
 * @author mcumbay
 */
@SuppressWarnings("serial")
public class SimpleLayout extends CustomLayout{
	private SimpleHeader header = new SimpleHeader();
	private Panel body = new Panel();
	private SimpleFooter footer = new SimpleFooter();
	
	public SimpleLayout(){
		//VAADIN/themes/bookatme/layouts/simple.html
		super("simple");			
		addComponent(header,"simpleHeader");
		addComponent(body,"simpleBody");
		addComponent(footer,"simpleFooter");		
	}

	public Panel getBody() {
		return body;
	}	
}
