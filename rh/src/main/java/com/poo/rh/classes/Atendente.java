package com.poo.rh.classes;

import com.poo.rh.enums.Turno;

public class Atendente extends Funcionario {
    private double comissao;

    public Atendente(String nome, String cpf, String telefone, String endereco, String ctps, double salario,
            Turno turno, double comissao) {
        super(nome, cpf, telefone, endereco, ctps, salario, turno);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    
}
