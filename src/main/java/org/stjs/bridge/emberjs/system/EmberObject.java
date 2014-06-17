package org.stjs.bridge.emberjs.system;

import org.stjs.bridge.emberjs.data.Store;
import org.stjs.bridge.emberjs.mixin.EmberObservable;
import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback;

@SyntheticType
public class EmberObject extends EmberCoreObject implements EmberObservable {
	public Store store;

	@Override
	public native EmberObject addObserver(String key, Object target, Callback method);

	@Override
	public native EmberObservable beginPropertyChanges();

	@Override
	public Object cacheFor(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Number decrementProperty(String keyName, Number decrement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmberObservable endPropertyChanges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(String keyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, ? extends Object> getProperties(String... list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, ? extends Object> getProperties(Array<String> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getWithDefault(String keyName, Object defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasObserverFor(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Number incrementProperty(String keyName, Number increment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmberObservable notifyPropertyChange(String keyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmberObservable propertyDidChange(String keyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmberObservable propertyWillChange(String keyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmberObservable removeObserver(String key, Object target, Callback method) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmberObservable set(String keyName, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmberObservable setProperties(Map<String, ? extends Object> properties) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object toggleProperty(String keyName) {
		// TODO Auto-generated method stub
		return null;
	}
}
