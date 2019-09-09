package calculadora;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RealizaCalculos {
	
	public String calcula(String exp) {
		List<Character> operadores = listarOperadores(exp);
		List<Double> numeros = listarNumeros(exp);
		return calculaValor(numeros, operadores);
	}

	private double realizaConta(double num1, double num2, char operador) {
		if (operador == '+')
			return num1 + num2;
		else if (operador == '-')
			return num1 - num2;
		else if (operador == '*')
			return num1 * num2;
		else if (operador == '/')
			return (num1/num2);
		return 0;
	}
	
	private boolean eOperador(char operador) {
		if (operador == '+' || operador == '-' || operador == '*' || operador == '/')
			return true;
		return false;
	}
	
	private List<Character> listarOperadores(String expressao){
		List<Character> temp = new ArrayList<Character>();
		
		for (int i =0; i < expressao.length(); i++) {
			if(eOperador(expressao.charAt(i)))
				temp.add(expressao.charAt(i));
		}
		
		return temp;
	}
	
	private List<Double> listarNumeros(String exp){
		List<Double> temp = new ArrayList<Double>();
		String numero = "";
		
		for (int i = 0; i < exp.length(); i++) {
			if(!eOperador(exp.charAt(i))) {
				numero += exp.charAt(i);
			}
			else {
				temp.add(Double.parseDouble(numero));
				numero = "";
			}
		}
		if (numero != "")
			temp.add(Double.valueOf(numero));
		
		return temp;
	}
	
	private String calculaValor(List<Double> numeros, List<Character> operadores) {
		double total = 0;
		int j = 0;
		
		for (int i = 0; i < numeros.size() - 1; i++) {
			if (total == 0) {
				double n1 = numeros.get(i).doubleValue();
				double n2 = numeros.get(i + 1).doubleValue();
				total += realizaConta(n1, n2, operadores.get(i).charValue());
				j ++;
			}
			else {
				double n2 = numeros.get(i + i).doubleValue();
				total = realizaConta(total, n2, operadores.get(j).charValue());
				j++;
			}
		}
		return String.valueOf(total);
	}
}
