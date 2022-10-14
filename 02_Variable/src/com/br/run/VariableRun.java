package com.br.run;

//import com.br.variable.A_Variable;
//import com.br.variable.B_KeyboardInput;
import com.br.variable.*;

public class VariableRun {
	
	public static void main(String[] args) {
		
		// A_Variable 클래스안에 있는 printValue 메소드 호출
		A_Variable a = new A_Variable();
		//a.printValue();
		//a.declareVariable();
		
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputScanner1();
		//b.inputScanner2();
		//b.inputScanner3();
		//b.charAtTest();
		//b.practice();
		
		C_Printf c = new C_Printf();
		//c.printfTest();
		
		D_Cast d = new D_Cast();
		//d.autoCasting();
		d.forceCasting();
			
	}
	
}
