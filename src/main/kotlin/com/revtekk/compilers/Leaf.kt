package com.revtekk.compilers

/**
 * Leaf expression
 */
interface Leaf: Expression

/**
 * Constant expression
 */
data class Constant<T>(val value: T): Leaf {
    private val hashCode = value.hashCode()

    override fun hashCode(): Int {
        return hashCode
    }
}

/**
 * Variable expression -- references a variable by name within
 * the context symbol table
 */
data class Variable(val name: String): Leaf {
    private val hashCode = name.hashCode()

    override fun hashCode(): Int {
        return hashCode
    }
}
