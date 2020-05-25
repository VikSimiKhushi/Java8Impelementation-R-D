package org.java.FunctionalInterface.com;

/*
 * Functional Interface :
 * It contains single abstract method (SAM).
 * 
 */

/*Case:1 ===>If parent interface is functional interface then 
             child without any method becomes functional interface .
*/
@FunctionalInterface
public interface A {
	void m1();

}

@FunctionalInterface
interface B extends A{
	
}

/*Case:2 ===>If parent interface is functional interface and 
child interface overrides the same method then It also becomes functional interface .
*/
@FunctionalInterface
interface C {
void m1();

}

@FunctionalInterface
interface D extends C{
	void m1();
}