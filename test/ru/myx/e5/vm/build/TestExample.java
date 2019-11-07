package ru.myx.e5.vm.build;

import ru.myx.e5.vm.VmEngine;
import ru.myx.e5.vm.build.VmProgramBuilder;

/** @author myx */
public final class TestExample {
	
	/**
	 *
	 */
	public static void test() {

		final VmEngine<Object> engine = VmEngine.SIMPLE_JAVA_NATIVE;
		final VmProgramBuilder<Object> b = engine.programBuilder();
		b//
				.setArgumentCount(2)//
				.setExecutableName("test.js")//
				.startIf().expressionConstantTrue()//
				.then()//
				.next()//
				.startWhile().expressionConstantFalse()//
				.buildProgram()//
		;
	}
}
