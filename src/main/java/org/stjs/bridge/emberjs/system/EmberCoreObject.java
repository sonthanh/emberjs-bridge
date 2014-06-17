package org.stjs.bridge.emberjs.system;

import org.stjs.bridge.emberjs.mixin.EmberMixin;
import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback;

@SyntheticType
public class EmberCoreObject {
	public native <T extends EmberObject> T create(Object... arguments);

	public native <T extends EmberObject> T createWithMixins(Object... arguments);

	public native <T extends EmberObject> T extend();

	public native <T extends EmberObject> T extend(Object... arguments);

	public native <T extends EmberObject> T extend(EmberMixin mixins, Object arguments);

	public native <T extends EmberObject> T extend(Array<EmberMixin> mixins, Object arguments);

	public native <T extends EmberObject> T destroy();

	public native void eachComputedProperty(Callback callback, Object binding);

	public native <T extends EmberObject> T repoen(Object arguments);

}
