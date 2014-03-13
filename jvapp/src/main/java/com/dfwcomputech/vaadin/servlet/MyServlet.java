package com.dfwcomputech.vaadin.servlet;

import javax.servlet.annotation.WebServlet;

import com.dfwcomputech.vaadin.MyVaadinUI;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

@SuppressWarnings("serial")
@WebServlet(value = "/*", asyncSupported = true)
@VaadinServletConfiguration(productionMode= false, ui= MyVaadinUI.class, widgetset = "com.dfwcomputech.vaadin.AppWidgetSet")
public class MyServlet extends VaadinServlet {

}
