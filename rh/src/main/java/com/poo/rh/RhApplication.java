package com.poo.rh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.rh.classes.Atendente;
import com.poo.rh.enums.Turno;

@SpringBootApplication
public class RhApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhApplication.class, args);

		Atendente at1 = new Atendente("Danielle", "145-07", String telefone, String endereco, String ctps, double salarioBruto,
		Turno turno, double sal, double salarioLiquidoDecimo, String atndimento);

	 System.out.println(at1.getNome());
	 System.out.println(at1.getCpf());
	 System.out.println(at1.getSalarioBruto());
	 System.out.println(at1.getSalarioLiquidoMensal());
	}

	



}
