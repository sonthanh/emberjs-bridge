package org.stjs.bridge.emberjs.view;

import org.stjs.bridge.emberjs.mixin.EmberMixin;
import org.stjs.bridge.emberjs.system.EmberRenderBuffer;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.jquery.JQueryAndPlugins;
import org.stjs.javascript.jquery.JQueryUINamespace;

@SyntheticType
public class EmberView extends EmberCoreView {
	public JQueryUINamespace $;

	public native <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $();

	public native <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(String path);

	public native <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(String path, Object context);

	public native <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(Object path);

	public native EmberView append();

	public native EmberView appendTo(Object A);

	public native EmberView createChildView(String viewClass, Map<String, ? extends Object> attrs);

	public native EmberView createElement();

	public native EmberView destroyElement();

	public native Element findElementInParentElement(Element parentElement);

	public native <T extends EmberView> EmberView nearestChildOf(T klass);

	public native <T extends EmberView> EmberView nearestOfType(T klass);

	public native <T extends EmberMixin> EmberView nearestOfType(T klass);

	public native EmberView nearestWithProperty(String property);

	public native EmberView remove();

	public native EmberView removeAllChildrenEmber();

	public native EmberView removeChild(EmberView view);

	public native EmberView removeFromParent();

	public native void render(EmberRenderBuffer buffer);

	public native EmberView replaceIn(Object target);

	public native void rerender();
}
