package com.revtekk.compilers

/**
 * Leaf expression
 */
interface Leaf: Expression

/**
 * Constant expression
 */
data class Constant<T>(val value: T): Leaf

/**
 * Variable expression -- references a variable by name within
 * the context symbol table
 */
data class Variable(val name: String): Leaf
