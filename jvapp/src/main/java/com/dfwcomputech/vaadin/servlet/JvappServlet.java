package com.dfwcomputech.vaadin.servlet;

import javax.servlet.annotation.WebServlet;

import com.dfwcomputech.vaadin.ui.MainUI;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

@SuppressWarnings("serial")
@WebServlet(value = "/home/*", asyncSupported = true)
@VaadinServletConfiguration(productionMode= false, ui= MainUI.class, widgetset = "com.dfwcomputech.vaadin.widgetset.MainWidgetSet")
public class JvappServlet extends VaadinServlet {

}
