package ru.myx.e5.vm;

import ru.myx.e5.vm.build.VmProgramBuilder;

/** @author myx
 *
 * @param <V> */
public interface VmEngine<V> {

	/** @author myx */
	static interface SimpleJavaNative extends VmEngine<Object> {

		@Override
		default Object forBoolean(final boolean b) {

			return b
				? Boolean.TRUE
				: Boolean.FALSE;
		}

		@SuppressWarnings("boxing")
		@Override
		default Object forDouble(final double d) {

			return d;
		}

		@SuppressWarnings("boxing")
		@Override
		default Object forInteger(final int i) {

			return i;
		}

		@Override
		default Object forObject(final Object o) {

			return o;
		}

		@Override
		default Object forString(final String s) {

			return s;
		}
		
	}
	
	/**
	 *
	 */
	static SimpleJavaNative SIMPLE_JAVA_NATIVE = new SimpleJavaNative() {
		
		@Override
		default VmProgramBuilder<Object> programBuilder() {
			
			return new VmProgramBuilder<Object>() {
				//
			};
		}
	};
	
	/** @param b
	 * @return */
	V forBoolean(boolean b);

	/** @param d
	 * @return */
	V forDouble(double d);

	/** @param i
	 * @return */
	V forInteger(int i);

	/** @param o
	 * @return */
	V forObject(Object o);

	/** @param s
	 * @return */
	V forString(String s);
	
	/** @return */
	VmProgramBuilder<V> programBuilder();
}
