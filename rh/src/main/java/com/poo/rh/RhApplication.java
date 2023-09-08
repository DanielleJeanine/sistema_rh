package com.poo.rh;

import java.text.DecimalFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.rh.classes.Atendente;
import com.poo.rh.classes.Gerente;
import com.poo.rh.classes.Supervisor;
import com.poo.rh.enums.Turno;

@SpringBootApplication
public class RhApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhApplication.class, args);

		DecimalFormat formatarCasaDecimal = new DecimalFormat("#,##0.00");


		Atendente at1 = new Atendente("Danielle", "12345-07", "249886702554", "Ru dos Bobos, nº0", "123456987", 1000,
				Turno.MANHÃ, 0, 0);
		Gerente g1 = new Gerente("Jéssica", "123654-07", "249888888", "Rua Qualuqer, nº10", "12654", 2000.85,
				Turno.TARDE, 0, 0);
		Supervisor sup1 = new Supervisor("Henrique", "456997-08", "24-999999", "Rua Inventada, nº85", "456987", 2800,
				Turno.NOITE, 0, 0);

		System.out.println("-----------------------------------------------------------");

		System.out.println("Funcionário: " + at1.getNome());
		System.out.println("Salário Bruto: R$ " + formatarCasaDecimal.format(at1.getSalarioBruto()) );
		System.out.println("Salário Líquido: R$ " + formatarCasaDecimal.format(at1.getSalarioLiquidoMensal()));
		System.out.println("Décimo Terceiro: R$ " + formatarCasaDecimal.format(at1.getSalarioLiquidoDecimo()));

		System.out.println("-----------------------------------------------------------");

		System.out.println("Funcionário: " + g1.getNome());
		System.out.println("Salário Bruto: R$ " + formatarCasaDecimal.format(g1.getSalarioBruto()) );
		System.out.println("Salário Líquido: R$ " + formatarCasaDecimal.format(g1.getSalarioLiquidoMensal()));
		System.out.println("Décimo Terceiro: R$ " + formatarCasaDecimal.format(g1.getSalarioLiquidoDecimo()));

		System.out.println("-----------------------------------------------------------");

		System.out.println("Funcionário: " + sup1.getNome());
		System.out.println("Salário Bruto: R$ " + formatarCasaDecimal.format(sup1.getSalarioBruto()) );
		System.out.println("Salário Líquido: R$ " + formatarCasaDecimal.format(sup1.getSalarioLiquidoMensal()));
		System.out.println("Décimo Terceiro: R$ " + formatarCasaDecimal.format(sup1.getSalarioLiquidoDecimo()));
	}

}
