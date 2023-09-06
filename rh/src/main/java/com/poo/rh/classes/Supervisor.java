package com.poo.rh.classes;

import com.poo.rh.enums.Turno;

public class Supervisor extends Funcionario {
    private String supervisionar;

    public Supervisor(String nome, String cpf, String telefone, String endereco, String ctps, double salario,
            Turno turno, String supervisionar) {
        super(nome, cpf, telefone, endereco, ctps, salario, turno);
        this.supervisionar = supervisionar;
    }

    public String getSupervisionar() {
        return supervisionar;
    }

    public void setSupervisionar(String supervisionar) {
        this.supervisionar = supervisionar;
    }

    



    
    
}
