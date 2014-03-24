package com.dfwcomputech.vaadin.ui;

import com.vaadin.addon.responsive.Responsive;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("responsive")
public class ResponsiveUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		final CssLayout root = new CssLayout();
		setContent(root);
		root.setWidth("100%");

		CssLayout topbar = new CssLayout();
		root.addComponent(topbar);
		topbar.addStyleName("top");

		topbar.addComponent(createTitle());
		root.addComponent(createMenu());
		root.addComponent(createContent());

	}

	public VerticalLayout createContent() {
		VerticalLayout content = new VerticalLayout();
		content.addStyleName("content");
		content.setSpacing(true);
		content.setMargin(true);

		Label header = new Label("Lorem Ipsum");
		header.addStyleName("h2");
		content.addComponent(header);

		Label text = new Label(
				"<p>Mauris iaculis porttitor posuere. Praesent id metus massa, ut blandit odio. Proin quis tortor orci. Etiam at risus et justo dignissim congue. Donec congue lacinia dui, a porttitor lectus condimentum laoreet. Nunc eu ullamcorper orci. Quisque eget odio ac lectus vestibulum faucibus eget in metus. In pellentesque faucibus vestibulum. Nulla at nulla justo, eget luctus tortor. Nulla facilisi. Duis aliquet egestas purus in blandit.</p>",
				ContentMode.HTML);
		content.addComponent(text);
		content.addComponent(createForm());
		return content;
	}

	public FormLayout createForm() {
		FormLayout form = new FormLayout();
		form.setWidth("100%");
		form.addStyleName("form");
		form.setSpacing(true);
		
		new Responsive(form);		
		TextField firstname = new TextField("First name");
		form.addComponent(firstname);
		firstname.setWidth("20em");

		TextField lastname = new TextField("Last name");
		form.addComponent(lastname);
		lastname.setWidth("20em");

		TextField email = new TextField("Email");
		form.addComponent(email);
		email.setWidth("20em");

		Button submit = new Button("Submit");
		form.addComponent(submit);
		
		return form;
	}

	public Label createTitle() {
		Label title = new Label("Workshop");
		title.addStyleName("h1");
		return title;
	}

	public VerticalLayout createMenu() {
		VerticalLayout menu = new VerticalLayout();
		menu.setSizeUndefined();
		menu.addStyleName("menu");

		Button section = new Button("Start");
		menu.addComponent(section);
		section.addStyleName("icon-home");
		section.addStyleName("selected");

		section = new Button("Projects");
		menu.addComponent(section);
		section.addStyleName("icon-folder-open");

		section = new Button("Settings");
		menu.addComponent(section);
		section.addStyleName("icon-cog");

		return menu;
	}

}
