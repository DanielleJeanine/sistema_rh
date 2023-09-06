package com.poo.rh.classes;

import com.poo.rh.enums.Turno;

public abstract class Funcionario extends Pessoa {
    private String ctps;
    private double salario;
    private Turno turno;
    public Funcionario(String nome, String cpf, String telefone, String endereco, String ctps, double salario,
            Turno turno) {
        super(nome, cpf, telefone, endereco);
        this.ctps = ctps;
        this.salario = salario;
        this.turno = turno;
    }
    public String getCtps() {
        return ctps;
    }
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Turno getTurno() {
        return turno;
    }
    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
}
