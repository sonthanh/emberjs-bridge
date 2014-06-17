package org.stjs.bridge.emberjs.mixin;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback;

@SyntheticType
public interface EmberEnumerable<T> {
	public void addEnumerableObserver(Object target, Map<String, ? extends Object> opts);

	public boolean any(Callback callback, Object target);

	public ArrayExtend<T> compact();

	public boolean contains(Object obj);

	public void enumerableContentDidChange(Object removing, Object adding);

	public void enumerableContentWillChange(Object removing, Object adding);

	public boolean every(Callback callback, Object target);

	public ArrayExtend<T> filter(Callback callback, Object target);

	public ArrayExtend<T> filterBy(String key);

	public ArrayExtend<T> filterBy(String key, Object value);

	public T find(Callback callback, Object target);

	public T findBy(String key, String value);

	public T forEach(Callback callback, Object target);

	public ArrayExtend<T> getEach(String key);

	public ArrayExtend<T> invoke(String methodName);

	public ArrayExtend<T> invoke(String methodName, Object... args);

	public boolean isAny(String key);

	public boolean isAny(String key, String value);

	public boolean isEvery(String key);

	public boolean isEvery(String key, String value);

	public ArrayExtend<T> map(Callback callback, Object target);

	public ArrayExtend<T> mapBy(String key);

	public T nextObject(Number index, Object previousObject, Object context);

	public T reduce(Callback callback, Object initialValue, String reducerProperty);

	public ArrayExtend<T> reject(Callback callback, Object target);

	public ArrayExtend<T> rejectBy(String key);

	public ArrayExtend<T> rejectBy(String key, String value);

	public EmberEnumerable<T> removeEnumerableObserver(Object target, Map<String, ? extends Object> opts);

	public T setEach(String key, Object value);

	public ArrayExtend<T> sortBy(String property);

	public ArrayExtend<T> toArray();

	public EmberEnumerable<T> uniq();

	public EmberEnumerable<T> without(Object value);

}
