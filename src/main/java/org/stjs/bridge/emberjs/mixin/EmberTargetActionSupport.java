package org.stjs.bridge.emberjs.mixin;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public interface EmberTargetActionSupport extends EmberMixin {
	public boolean triggerAction(Map<String, ? extends Object> opts);
}
