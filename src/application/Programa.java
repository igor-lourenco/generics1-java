/*Uma empresa de consultoria deseja avaliar a performance de produtos,
funcionários, dentre outras coisas. Um dos cálculos que ela precisa é encontrar
o maior dentre um conjunto de elementos. Fazer um programa que leia um
conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
mostre o mais caro deles.*/

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Produtos;
import servicos.CalcularServico;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Produtos> lista = new ArrayList<>();
		
		String path = "C:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String linha = br.readLine();
			while(linha != null) {
				String[] campo = linha.split(",");
				lista.add(new Produtos(campo[0], Double.parseDouble(campo[1])));
				linha = br.readLine();
			}
			
			Produtos x = CalcularServico.max(lista);
			System.out.println("Máximo: ");
			System.out.println(x);
		}catch(IOException e) {
			System.out.println("Erro : " + e.getMessage());
		}

	}

}
