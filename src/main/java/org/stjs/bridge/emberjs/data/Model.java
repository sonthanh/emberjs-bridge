package org.stjs.bridge.emberjs.data;

import org.stjs.bridge.emberjs.mixin.EmberEvented;
import org.stjs.bridge.emberjs.system.EmberObject;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback;
import org.stjs.javascript.functions.Function;

@SyntheticType
public class Model extends EmberObject implements EmberEvented {

	public native void adapterDidCommit();

	public native Object changedAttributesObject();

	public native void deleteRecord();

	public native <T> Promise<T> destroyRecord();

	public native static void eachAttribute(Callback callback, Object target);

	public native static void eachRelatedType(Callback callback, Object binding);

	public native void eachRelationship(Callback callback, Object binding);

	public native static void eachTransformedAttribute(Callback callback, Object target);

	public native <T> Promise<T> reload();

	public native void rollback();

	public native Object serialize(Object options);

	public native Object toJSON(Object options);

	public native static <T extends Model> T typeForRelationship(String name);

	public native <T> Promise<T> save();

	@Override
	public boolean has(String name) {
		return false;
	}

	@Override
	public EmberEvented off(String name, Object target, Function method) {
		return null;
	}

	@Override
	public EmberEvented on(String name, Object target, Function method) {
		return null;
	}

	@Override
	public EmberEvented one(String name, Object target, Function method) {
		return null;
	}

	@Override
	public void trigger(String name) {
	}

	@Override
	public void trigger(String name, Object... args) {
	}

}
