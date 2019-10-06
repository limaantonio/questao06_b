package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
	public static void bubbleSort(Funcionario[] v, int n, int o) {
		Funcionario aux = new Funcionario();
		if(o == 1) {
			for (int i=0; i<n; i++) {
				for(int j=0; j<n-i-1; j++) {
					if(v[j].getSalario() >  v[j+1].getSalario()) {
						aux = v[j];
						v[j] = v[j+1];
						v[j+1] = aux;
					}
				}
			}
		}
		if(o == 2) {
			for (int i=0; i<n; i++) {
				for(int j=0; j<n-i-1; j++) {
					if(v[j].getNome().charAt(0) >  v[j+1].getNome().charAt(0)) {
						aux = v[j];
						v[j] = v[j+1];
						v[j+1] = aux;
					}
				}
			}
		}
	}
	
	public static void insertionSort(Funcionario[] v, int n, int o) {
		Funcionario x = new Funcionario();
		int j=0;
		
		if(o == 1) {
			for(int i=1; i<n; i++) {
				x = v[i];
				j = i-1;
				while(j >=0 && v[j].getSalario() > x.getSalario()) {
					v[j+1] = v[j];
					j--;
				}
				v[j+1] = x;
			}
		}
		if(o == 2) {
			for(int i=1; i<n; i++) {
				x = v[i];
				j = i-1;
				while(j >=0 && v[j].getNome().charAt(0) > x.getNome().charAt(0)) {
					v[j+1] = v[j];
					j--;
				}
				v[j+1] = x;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int n=2;
		Scanner sc = new Scanner(System.in);
		Funcionario[] v = new Funcionario[n];
		Funcionario f = new Funcionario();
		
		
		for (int i=0; i<n; i++){
			System.out.print("Digite o nome do funcionario: ");
			String nome = sc.next();
			System.out.print("Digite o salario: ");
			double salario = sc.nextDouble();
			
			v[i] = new Funcionario(nome, salario);
		}
		
		for(Funcionario  fun : v) {
			 fun.toString();
		}
		
		System.out.println(".......Ordenação BubbleSort........");
		bubbleSort(v, n, 1);
		System.out.println("Funcionarios por ordem crescente de salario:");
		for(Funcionario  fun : v) {
			 System.out.println(fun.toString());
		}
		bubbleSort(v, n, 2);
		System.out.println();
		System.out.println("Funcionarios com nomes em ordem crescente:");
		for(Funcionario  fun : v) {
			 System.out.println(fun.toString());
		}
		
		System.out.println();
		
		System.out.println(".......Ordenação InsertionSort........");
		insertionSort(v, n, 1);
		System.out.println("Funcionarios por ordem crescente de salario:");
		for(Funcionario  fun : v) {
			 System.out.println(fun.toString());
		}
		System.out.println();
		insertionSort(v, n, 2);
		System.out.println("Funcionarios com nomes em ordem crescente:");
		for(Funcionario  fun : v) {
			 System.out.println(fun.toString());
		}	
	}
}
