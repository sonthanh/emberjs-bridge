package org.stjs.bridge.emberjs.mixin;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Function;

@SyntheticType
public interface EmberEvented {
	public boolean has(String name);

	public EmberEvented off(String name, Object target, Function method);

	public EmberEvented on(String name, Object target, Function method);

	public EmberEvented one(String name, Object target, Function method);

	public void trigger(String name);

	public void trigger(String name, Object... args);
}
