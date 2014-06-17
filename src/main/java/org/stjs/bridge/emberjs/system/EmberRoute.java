package org.stjs.bridge.emberjs.system;

import org.stjs.bridge.emberjs.controller.EmberController;
import org.stjs.bridge.emberjs.data.Promise;
import org.stjs.bridge.emberjs.mixin.EmberActionHandler;
import org.stjs.bridge.emberjs.mixin.EmberControllerMixin;
import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public class EmberRoute extends EmberObject implements EmberActionHandler {
	public native void activate();

	public native <T> Promise<T> afterModel(Object resolvedModel, Object transition, Object queryParams);

	public native <T> Promise<T> beforeModel(Object transition, Object queryParams);

	public native EmberController controllerFor(String name);

	public native void deactivate();

	public native void disconnectOutlet(Object options);

	public native void findModel(String model, Object value);

	public native void generateController(String name, Object model);

	public native void intermediateTransitionTo(String name, Object... models);

	public native Object model(Object params, Object transition, Object queryParams);

	public native Object modelFor(String name);

	public native void redirect(Object model);

	public native Object refresh();

	public native void render(String name, Object options);

	public native void renderTemplate(Object controller, Object model);

	public native Object replaceWith(String name, Object... models);

	public native Object serialize(Object model, Array params);

	public native void setupController(EmberControllerMixin controller, Object model);

	public native void store(Object store);

	public native Object transitionTo(String name);

	public native Object transitionTo(String name, Object... models);

	@Override
	public void send(String actionName) {
	}

	@Override
	public void send(String actionName, Object context) {
	}
}
