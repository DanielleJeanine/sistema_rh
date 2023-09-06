package com.poo.rh.classes;

import com.poo.rh.enums.Turno;

public class Supervisor extends Funcionario {
    private String supervisionar;

    public Supervisor(String nome, String cpf, String telefone, String endereco, String ctps, double salarioBruto,
            Turno turno, double salarioLiquidoMensal, double salarioLiquidoDecimo, String supervisionar) {
        super(nome, cpf, telefone, endereco, ctps, salarioBruto, turno, salarioLiquidoMensal, salarioLiquidoDecimo);
        this.supervisionar = supervisionar;
    }

    public String getSupervisionar() {
        return supervisionar;
    }

    public void setSupervisionar(String supervisionar) {
        this.supervisionar = supervisionar;
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
    public void calcularSalarioLiquido() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalarioLiquido'");
    }

    @Override
    public void calcularSalarioDecimoTerceiro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalarioDecimoTerceiro'");
    }

        
}
