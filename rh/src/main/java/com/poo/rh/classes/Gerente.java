package com.poo.rh.classes;

import com.poo.rh.enums.Turno;

public class Gerente extends Funcionario {
    private String Gerenciar;

    public Gerente(String nome, String cpf, String telefone, String endereco, String ctps, double salario, Turno turno,
            String gerenciar) {
        super(nome, cpf, telefone, endereco, ctps, salario, turno);
        Gerenciar = gerenciar;
    }

    public String getGerenciar() {
        return Gerenciar;
    }

    public void setGerenciar(String gerenciar) {
        Gerenciar = gerenciar;
    }

    

    
}
