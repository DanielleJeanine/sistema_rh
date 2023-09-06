package com.poo.rh.classes;

import com.poo.rh.enums.Turno;
import com.poo.rh.interfaces.CalcularTributos;

public abstract class Funcionario extends Pessoa implements CalcularTributos {
    private String ctps;
    private double salarioBruto;
    private Turno turno;
    private double salarioLiquidoMensal;
    private double salarioLiquidoDecimo;
    public Funcionario(String nome, String cpf, String telefone, String endereco, String ctps, double salarioBruto,
            Turno turno, double salarioLiquidoMensal, double salarioLiquidoDecimo) {
        super(nome, cpf, telefone, endereco);
        this.ctps = ctps;
        this.salarioBruto = salarioBruto;
        this.turno = turno;
        this.salarioLiquidoMensal = salarioLiquidoMensal;
        this.salarioLiquidoDecimo = salarioLiquidoDecimo;
    }
    public String getCtps() {
        return ctps;
    }
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
    public double getSalarioBruto() {
        return salarioBruto;
    }
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public Turno getTurno() {
        return turno;
    }
    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    public double getSalarioLiquidoMensal() {
        return salarioLiquidoMensal;
    }
    public void setSalarioLiquidoMensal(double salarioLiquidoMensal) {
        this.salarioLiquidoMensal = salarioLiquidoMensal;
    }
    public double getSalarioLiquidoDecimo() {
        return salarioLiquidoDecimo;
    }
    public void setSalarioLiquidoDecimo(double salarioLiquidoDecimo) {
        this.salarioLiquidoDecimo = salarioLiquidoDecimo;
    }

    
}
