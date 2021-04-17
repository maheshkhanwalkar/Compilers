package com.revtekk.compilers

/**
 * Value-Number DAG Construction
 */
class ValueNumber {
    private val map: MutableMap<Expression, Expression> = mutableMapOf()

    fun <T> newConstant(value: T): Constant<T> {
        val const = Constant(value)
        return map.getOrPut(const) {const} as Constant<T>
    }

    fun newVariable(name: String): Variable {
        val variable = Variable(name)
        return map.getOrPut(variable) {variable} as Variable
    }

    fun newBinaryExpression(op: BinaryOp, lhs: Expression, rhs: Expression): BinaryExpression {
        val exp = BinaryExpression(op, lhs, rhs)
        return map.getOrPut(exp) {exp} as BinaryExpression
    }

    fun newUnaryExpression(op: UnaryOp, lhs: Expression): UnaryExpression {
        val exp = UnaryExpression(op, lhs)
        return map.getOrPut(exp) {exp} as UnaryExpression
    }

    /**
     * Reset the construction
     */
    fun reset() {
        map.clear()
    }
}
