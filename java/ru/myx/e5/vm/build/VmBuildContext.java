package ru.myx.e5.vm.build;

import ru.myx.e5.vm.VmBasicContext;
import ru.myx.e5.vm.VmEngine;

/** @author myx
 *
 * @param <V> */
public interface VmBuildContext<V> extends VmBasicContext<V> {

	/** @return */
	VmEngine<V> contextEngine();
}
