package org.stjs.bridge.emberjs;

public interface ComputedProperty {
	public <T extends Object> T property(String... args);
}
