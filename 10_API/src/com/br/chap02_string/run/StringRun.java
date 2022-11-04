package com.br.chap02_string.run;

import com.br.chap02_string.controller.A_StringPoolTest;
import com.br.chap02_string.controller.B_BuilderBufferTest;
import com.br.chap02_string.controller.C_StringMethodTest;
import com.br.chap02_string.controller.D_StringTokenizerTest;

public class StringRun {

	public static void main(String[] args) {
		A_StringPoolTest a = new A_StringPoolTest();
		//a.method1();
		//a.method2();
		//a.method3();
		
		B_BuilderBufferTest b = new B_BuilderBufferTest();
		//b.method1();
		//b.method2();
		
		C_StringMethodTest c = new C_StringMethodTest();
		//c.method();
		
		D_StringTokenizerTest d = new D_StringTokenizerTest();
		d.method();
	}

}
