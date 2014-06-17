package org.stjs.bridge.emberjs.controller;

import org.stjs.bridge.emberjs.mixin.EmberArrayProxy;
import org.stjs.bridge.emberjs.mixin.EmberControllerMixin;
import org.stjs.bridge.emberjs.mixin.EmberSortableMixin;
import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public class EmberArrayController extends EmberArrayProxy implements EmberSortableMixin, EmberControllerMixin {

	@Override
	public void send(String actionName, Object context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void send(String actionName) {
		// TODO Auto-generated method stub

	}

}
