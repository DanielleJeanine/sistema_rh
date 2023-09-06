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
