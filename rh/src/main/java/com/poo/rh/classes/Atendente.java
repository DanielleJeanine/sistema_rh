package com.poo.rh.classes;

import com.poo.rh.enums.Turno;

public class Atendente extends Funcionario {
    public Atendente(String nome, String cpf, String telefone, String endereco, String ctps, double salarioBruto,
            Turno turno, double salarioLiquidoMensal, double salarioLiquidoDecimo, String atndimento) {
        super(nome, cpf, telefone, endereco, ctps, salarioBruto, turno, salarioLiquidoMensal, salarioLiquidoDecimo);
        
    }

    @Override
    public double calcularFgts() {
       final double taxaFgts = 0.06;
       double valorFgts = getSalarioBruto()*taxaFgts;
      
       return valorFgts;
    }

    @Override
    public double calcularInss() {
        final double taxaInss = 0.08;
       double valorInss = getSalarioBruto()*taxaInss;
      
       return valorInss;
    }

    @Override
    public double calcularDecimoTerceiro() {
        final double taxaDecimo = 0.12;
       double valorDecimo = getSalarioBruto()*taxaDecimo;
      
       return valorDecimo;
    }

    @Override
    public void calcularSalarioLiquido() {
        setSalarioLiquidoMensal(getSalarioBruto()-calcularFgts()-calcularInss());
       
    }

    @Override
    public void calcularSalarioDecimoTerceiro() {

        setSalarioLiquidoDecimo(getSalarioBruto() - calcularFgts() - calcularInss() + calcularDecimoTerceiro());
        
    }

   

    

    



    
}
