package org.stjs.bridge.emberjs.data;

import org.stjs.bridge.emberjs.system.EmberObject;
import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Function;

@SyntheticType
public class Store extends EmberObject {

	public native RecordArray all(Object type);

	public native Model createRecord(String type, Object properties);

	public native void deleteRecord(Model record);

	public native void didUpdateAll(Model type);

	public native <T> PromiseArray<T> filter(Object type, Object query, Function filter);

	public native <T> PromiseArray<T> filter(Object type, Function filter);

	public native <T> Array<Promise<T>> find(Object type);

	public native <T> Promise<T> find(Object type, Object id);

	public native Model getById(Object type, Object id);

	public native boolean hasRecordForId(Object type, Object id);

	public native void metaForType(Object type, Object metadata);

	public native Object metadataFor(Object type);

	public native <T extends Model> T modelFor(Object key);

	public native Model push(Object type, Object data);

	public native Array pushMany(Object type, Array datas);

	public native void pushPayload(String type, Object payload);

	public native boolean recordIsLoaded(Object type, String id);

	public native void unloadAll(Object type);

	public native void unloadRecord(Model record);

	public native Model update(String type, Object data);
}
