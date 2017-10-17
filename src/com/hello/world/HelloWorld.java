/**
 * 
 */
package com.hello.world;

import com.hello.git.HelloGit;
import com.hello.singlton.SingltonClass;

/**
 * @author Sathish
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		HelloGit helloGit = new HelloGit();
		helloGit.sayHelloGit();
		
		SingltonClass singltonClass = SingltonClass.getInstance();
		
		singltonClass.saySingltonClass();
	}

}
