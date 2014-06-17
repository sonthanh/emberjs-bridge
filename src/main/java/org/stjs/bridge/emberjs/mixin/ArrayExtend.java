package org.stjs.bridge.emberjs.mixin;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Callback;

public class ArrayExtend<T> extends Array<T> implements EmberMutableArray<T> {

	@Override
	public void addEnumerableObserver(Object target, Map<String, ? extends Object> opts) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean any(Callback callback, Object target) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayExtend<T> compact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void enumerableContentDidChange(Object removing, Object adding) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enumerableContentWillChange(Object removing, Object adding) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean every(Callback callback, Object target) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayExtend<T> filter(Callback callback, Object target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayExtend<T> filterBy(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayExtend<T> filterBy(String key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T find(Callback callback, Object target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findBy(String key, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T forEach(Callback callback, Object target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayExtend<T> getEach(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayExtend<T> invoke(String methodName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayExtend<T> invoke(String methodName, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAny(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAny(String key, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEvery(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEvery(String key, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayExtend<T> map(Callback callback, Object target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayExtend<T> mapBy(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T nextObject(Number index, Object previousObject, Object context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T reduce(Callback callback, Object initialValue, String reducerProperty) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayExtend<T> reject(Callback callback, Object target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayExtend<T> rejectBy(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayExtend<T> rejectBy(String key, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmberEnumerable<T> removeEnumerableObserver(Object target, Map<String, ? extends Object> opts) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T setEach(String key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayExtend<T> sortBy(String property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayExtend<T> toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmberEnumerable<T> uniq() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmberEnumerable<T> without(Object value) {
		// TODO Auto-generated method stub
		return null;
	}

}
