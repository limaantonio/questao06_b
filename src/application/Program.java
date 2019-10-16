package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
	public static void selectionSort(Funcionario[] v, int n, int o) {
		Funcionario aux = new Funcionario();
		if (o == 1) {
			int min;
			for (int i = 0; i < n - 1; i++) {
				min = i;
				for (int j = i + 1; j < n; j++) {
					if (v[j].getSalario() < v[min].getSalario()) {
						min = j;
					}
				}
				aux = v[i];
				v[i] = v[min];
				v[min] = aux;
			}
		}
		if (o == 2) {
			int min;
			for (int i = 0; i < n - 1; i++) {
				min = i;
				for (int j = i + 1; j < n; j++) {
					if (v[j].getNome().charAt(1) < v[min].getNome().charAt(1)) {
						min = j;
					}
				}
				aux = v[i];
				v[i] = v[min];
				v[min] = aux;
			}
		}
	}

	public static void insertionSort(Funcionario[] v, int n, int o) {
		Funcionario x = new Funcionario();
		int j = 0;

		if (o == 1) {
			for (int i = 1; i < n; i++) {
				x = v[i];
				j = i - 1;
				while (j >= 0 && v[j].getSalario() > x.getSalario()) {
					v[j + 1] = v[j];
					j--;
				}
				v[j + 1] = x;
			}
		}
		if (o == 2) {
			for (int i = 1; i < n; i++) {
				x = v[i];
				j = i - 1;
				while (j >= 0 && v[j].getNome().charAt(0) > x.getNome().charAt(0)) {
					v[j + 1] = v[j];
					j--;
				}
				v[j + 1] = x;
			}
		}

	}

	public static void main(String[] args) {

		int n = 2;
		Scanner sc = new Scanner(System.in);
		Funcionario[] v = new Funcionario[n];
		Funcionario f = new Funcionario();

		for (int i = 0; i < n; i++) {
			System.out.print("Digite o nome do funcionario: ");
			String nome = sc.next();
			System.out.print("Digite o salario: ");
			double salario = sc.nextDouble();

			v[i] = new Funcionario(nome, salario);
		}

		for (Funcionario fun : v) {
			fun.toString();
		}

		System.out.println(".......Selection BubbleSort........");
		selectionSort(v, n, 1);
		System.out.println("Funcionarios por ordem crescente de salario:");
		for (Funcionario fun : v) {
			System.out.println(fun.toString());
		}
		selectionSort(v, n, 2);
		System.out.println();
		System.out.println("Funcionarios com nomes em ordem crescente:");
		for (Funcionario fun : v) {
			System.out.println(fun.toString());
		}

		System.out.println();

		System.out.println(".......Ordenação InsertionSort........");
		insertionSort(v, n, 1);
		System.out.println("Funcionarios por ordem crescente de salario:");
		for (Funcionario fun : v) {
			System.out.println(fun.toString());
		}
		System.out.println();
		insertionSort(v, n, 2);
		System.out.println("Funcionarios com nomes em ordem crescente:");
		for (Funcionario fun : v) {
			System.out.println(fun.toString());
		}
	}
}
