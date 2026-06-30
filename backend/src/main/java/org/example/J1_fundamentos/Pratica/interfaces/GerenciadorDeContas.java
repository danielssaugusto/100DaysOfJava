package org.example.J1_fundamentos.Pratica.interfaces;

import org.example.J1_fundamentos.Pratica.ContaBancaria.heranca.ContaBancaria;

public class GerenciadorDeContas {
    private RegistroAuditoria auditoria;

    public GerenciadorDeContas(RegistroAuditoria auditoria) {
        this.auditoria = auditoria;
    }

    public void depositar(ContaBancaria conta, double valor) {
        conta.depositar(valor);
        auditoria.registrarDeposito(valor);
    }
}
