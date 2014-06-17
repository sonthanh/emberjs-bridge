package org.stjs.bridge.emberjs.data;

import org.stjs.bridge.emberjs.adapter.Adapter;
import org.stjs.javascript.Map;
import org.stjs.javascript.jquery.JQueryAndPlugins;
import org.stjs.javascript.jquery.JQueryUINamespace;

public class DSNameSpace {

	public Model Model;
	public Adapter LSAdapter;
	public Adapter FixtureAdapter;

	public JQueryUINamespace $;

	public native <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $();

	public native <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(String path);

	public native <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(String path, Object context);

	public native <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(Object path);

	public native <T extends Object> T attr(String type);

	public native <T extends Object> T attr(String type, Map<String, ? extends Object> options);

}
