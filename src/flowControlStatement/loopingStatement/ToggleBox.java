package flowControlStatement.loopingStatement;

public class ToggleBox {
	
	public static void main(String[] args) {
		int n = 100;
        int i = 1;

        while (i * i <= n) {
            System.out.println("Box " + (i * i) + " is OPEN");
            i++;
        }
	}

}
