package org.stjs.bridge.emberjs.data;

import org.stjs.bridge.emberjs.mixin.EmberArrayProxy;
import org.stjs.bridge.emberjs.mixin.EmberPromiseProxyMixin;
import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public class PromiseArray<T> extends EmberArrayProxy<T> implements EmberPromiseProxyMixin {

}
