package org.stjs.bridge.emberjs;

import org.stjs.bridge.emberjs.control.EmberTextField;
import org.stjs.bridge.emberjs.controller.EmberArrayController;
import org.stjs.bridge.emberjs.controller.EmberController;
import org.stjs.bridge.emberjs.controller.EmberObjectController;
import org.stjs.bridge.emberjs.handlebars.Handlebars;
import org.stjs.bridge.emberjs.system.EmberObject;
import org.stjs.bridge.emberjs.system.EmberRoute;
import org.stjs.javascript.jquery.JQueryAndPlugins;
import org.stjs.javascript.jquery.JQueryUINamespace;

public class EmberNamespace {
	public Application Application;
	public EmberRoute Route;
	public EmberController Controller;

	public EmberArrayController ArrayController;
	public EmberObjectController ObjectController;
	public EmberTextField TextField;

	public EmberObject Object;

	public Handlebars Handlebars;

	//	public static class Handlebars extends org.stjs.bridge.emberjs.handlebars.Handlebars {
	//		public native void helper(String name, Object value);
	//	}

	public native <T> T extend(T destination, Object... sources);

	public JQueryUINamespace $;

	public native <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $();

	public native <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(String path);

	public native <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(String path, Object context);

	public native <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(Object path);

	public native boolean isEmpty(Object obj);

}
