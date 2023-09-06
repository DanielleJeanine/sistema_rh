package com.poo.rh.classes;

import com.poo.rh.enums.Turno;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, String telefone, String endereco, String ctps, double salarioBruto,
            Turno turno, double salarioLiquidoMensal, double salarioLiquidoDecimo) {
        super(nome, cpf, telefone, endereco, ctps, salarioBruto, turno, salarioLiquidoMensal, salarioLiquidoDecimo);
    }

    @Override
    public double calcularFgts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularFgts'");
    }

    @Override
    public double calcularInss() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularInss'");
    }

    @Override
    public double calcularDecimoTerceiro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularDecimoTerceiro'");
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
