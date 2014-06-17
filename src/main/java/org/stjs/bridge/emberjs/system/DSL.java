package org.stjs.bridge.emberjs.system;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback;

@SyntheticType
public interface DSL {

	public void resource(String name, Map<String, ? extends Object> options);

	public void resource(String name, Map<String, ? extends Object> options, Callback callback);

	public void push(String url, String name);

	public void push(String url, String name, Callback callback);

	public void route(String name);

	public void route(String name, Map<String, ? extends Object> options);

	public void generate();

	public void map(Callback callback);
}
