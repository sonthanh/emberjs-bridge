package org.stjs.bridge.emberjs.mixin;
import org.stjs.bridge.emberjs.system.EmberObject;
import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Callback;

public interface EmberObservable {
	public EmberObject addObserver(String key, Object target, Callback method);

	public EmberObservable beginPropertyChanges();

	public Object cacheFor(String key);

	public Number decrementProperty(String keyName, Number decrement);

	public EmberObservable endPropertyChanges();

	public Object get(String keyName);

	public Map<String, ? extends Object> getProperties(String... list);

	public Map<String, ? extends Object> getProperties(Array<String> list);

	public Object getWithDefault(String keyName, Object defaultValue);

	public boolean hasObserverFor(String key);

	public Number incrementProperty(String keyName, Number increment);

	public EmberObservable notifyPropertyChange(String keyName);

	public EmberObservable propertyDidChange(String keyName);

	public EmberObservable propertyWillChange(String keyName);

	public EmberObservable removeObserver(String key, Object target, Callback method);

	public EmberObservable set(String keyName, Object value);

	public EmberObservable setProperties(Map<String, ? extends Object> properties);

	public Object toggleProperty(String keyName);

}
