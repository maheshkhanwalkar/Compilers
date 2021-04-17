package com.revtekk.compilers


/**
 * "Combining" expression
 *
 * This interface represents all expressions which are
 * made up of combinations of other expressions
 */
interface Expression

/**
 * Binary operation types
 */
enum class BinaryOp {
    PLUS, MINUS, MULTIPLY, DIVIDE
}

/**
 * Binary operand expression
 */
data class BinaryExpression(val op: BinaryOp, val lhs: Expression, val rhs: Expression): Expression

/**
 * Unary operand types
 */
enum class UnaryOp {
    NEGATIVE
}

/**
 * Unary operand expression
 */
data class UnaryExpression(val op: UnaryOp, val target: Expression): Expression
