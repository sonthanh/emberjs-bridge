package org.stjs.bridge.emberjs.mixin;

import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public interface EmberActionHandler {

	public void send(String actionName);

	public void send(String actionName, Object context);
}
