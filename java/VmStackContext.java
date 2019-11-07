package ru.myx.e5.vm;

/** @author myx
 *
 * @param <V>
 *            - Value class */
public interface VmStackContext<V> extends VmBasicContext<V> {
	
	/** @return */
	V stackPeek();
	
	/** @param more
	 * @return */
	V stackPeek(int more);
	
	/** @return */
	V stackPop();
	
	/** @param value */
	void stackPush(V value);
	
	/** @param value */
	void stackPushDouble(double value);
	
	/** @param value */
	void stackPushInteger(int value);
	
	/** @param value */
	void stackPushLong(long value);
	
	/** @param value */
	@Deprecated
	void stackPushObject(Object value);
	
	/** @param value */
	void stackPushString(String value);
	
	/** @return */
	V[] stackRaw();
}
