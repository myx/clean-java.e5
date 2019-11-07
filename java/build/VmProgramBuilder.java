package ru.myx.e5.vm.build;

/** @author myx
 *
 * @param <V> */
public interface VmProgramBuilder<V> extends VmBasicBuilder {
	
	/** @param count
	 * @return */
	VmProgramBuilder<V> setArgumentCount(int count);
	
	/** @param count
	 * @return */
	VmProgramBuilder<V> setDebugDescription(int count);
	
	/** @param name
	 * @return */
	VmProgramBuilder<V> setExecutableName(String name);
	
	/** @param name
	 * @return */
	VmStatementBuilder<V> startErrorHandler();
	
	/** @param name
	 * @return */
	VmStatementBuilder<V> startProgramCode();
	
	/** @param name
	 * @return */
	VmStatementBuilder<V> startStaticInitializer();
}
