package ru.myx.e5.vm.build;

/** @author myx
 * @param <V> */
public interface VmBasicBuilder<V> {
	
	/** @return */
	VmExpressionBuilder expression();

	/** @return */
	VmExpressionBuilder expressionConstantFalse();

	/** @return */
	VmExpressionBuilder expressionConstantTrue();

	/** @return */
	VmConditionalBuilder startIf();

	/** @return */
	VmConditionalBuilder startWhile();

	/** @return */
	VmStatementBuilder<V> statement();
}
