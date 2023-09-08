package com.poo.rh.classes;

import com.poo.rh.enums.Turno;

public class Supervisor extends Funcionario {

    public Supervisor(String nome, String cpf, String telefone, String endereco, String ctps, double salarioBruto,
            Turno turno, double salarioLiquidoMensal, double salarioLiquidoDecimo) {
        super(nome, cpf, telefone, endereco, ctps, salarioBruto, turno, salarioLiquidoMensal, salarioLiquidoDecimo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calcularFgts() {
       final double taxaFgts = 0.08;
       double valorFgts = getSalarioBruto()*taxaFgts;
      
       return valorFgts;
    }

    @Override
    public double calcularInss() {
        final double taxaInss = 0.10;
       double valorInss = getSalarioBruto()*taxaInss;
      
       return valorInss;
    }

    @Override
    public double calcularDecimoTerceiro() {
        final double taxaDecimo = 0.15;
       double valorDecimo = getSalarioBruto()*taxaDecimo;
      
       return valorDecimo;
    }

    @Override
    public double calcularSalarioLiquido() {

        double salarioLiquidoMensal = getSalarioBruto()-calcularFgts()-calcularInss();
        return salarioLiquidoMensal ;
       
    }

    @Override
    public double calcularSalarioDecimoTerceiro() {

       double salarioLiquidoDecimo = getSalarioBruto() - calcularFgts() - calcularInss() + calcularDecimoTerceiro();
       return salarioLiquidoDecimo;
        
    }

        
}
