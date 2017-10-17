/**
 * 
 */
package com.hello.singlton;

/**
 * @author Sathish
 *
 */
public class SingltonClass {

	private SingltonClass() {};
	
	public static SingltonClass getInstance() {
		
		return new SingltonClass();
	}
	
	public void saySingltonClass() {
		System.out.println("this is a singlton class");
	}
}
