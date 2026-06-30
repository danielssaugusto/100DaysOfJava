package org.example.J1_fundamentos.Pratica.interfaces;

import org.example.J1_fundamentos.Pratica.ContaBancaria.heranca.ContaBancaria;
import org.example.J1_fundamentos.Pratica.ContaBancaria.heranca.ContaCorrente;

public class ContaTeste {
    public static void main (String[] args) {
        RegistroAuditoriaSimples rs = new RegistroAuditoriaSimples();
        RegistroAuditoriaCompleta rc = new RegistroAuditoriaCompleta();
        GerenciadorDeContas gc = new GerenciadorDeContas(rs);

        ContaBancaria cb = new ContaCorrente("Jhon", 15.6, 5.0);

        gc.depositar(cb, 200);
    }
}
