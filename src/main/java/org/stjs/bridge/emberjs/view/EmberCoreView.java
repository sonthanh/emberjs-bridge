package org.stjs.bridge.emberjs.view;

import org.stjs.bridge.emberjs.mixin.EmberActionHandler;
import org.stjs.bridge.emberjs.mixin.EmberEvented;
import org.stjs.bridge.emberjs.system.EmberObject;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Function;

@SyntheticType
public class EmberCoreView extends EmberObject implements EmberEvented, EmberActionHandler {
	public EmberView parentView;

	@Override
	public boolean has(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmberEvented off(String name, Object target, Function method) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmberEvented on(String name, Object target, Function method) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmberEvented one(String name, Object target, Function method) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void trigger(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trigger(String name, Object... args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void send(String actionName, Object context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void send(String actionName) {
		// TODO Auto-generated method stub

	}

}
