package fundamentos;

import java.text.DecimalFormat;

public class Temperatura {
	public static void main(String[] args) {
		DecimalFormat deci = new DecimalFormat("0.00");
		double F = 150;
		final int sub = 32;
		final double divi = 5/9.0;
		double C = (F - sub) * divi;
		System.out.println(F + "°F convertido em graus celcius e " + deci.format(C) +"°C");
		
		
	}
}
