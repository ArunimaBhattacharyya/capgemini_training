package operators.conditionalOperator;

public class Program1 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// syntax = ternary(op1?op2:op3)
		
		System.out.println(true?10:20);
		System.out.println(false?"A":65);
		
		System.out.println(10>'A'?true:false);
		
		System.out.println("hello"!="Hello"?'A':'B');
		
		System.out.println(30>40?'A':'B');
		
		String res = 40>30?"A":"true"; // type of the operands should be same as we are storing the value in a variable
		System.out.println(res);
	}

}
