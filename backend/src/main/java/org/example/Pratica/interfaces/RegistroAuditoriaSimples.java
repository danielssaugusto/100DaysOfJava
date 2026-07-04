package org.example.Pratica.interfaces;

public class RegistroAuditoriaSimples implements RegistroAuditoria {

    @Override
    public void registrarDeposito(double valor) {
        System.out.println("Registrando depósito de R$" + valor + " COD: " + COD_OPERACAO_AUDITORIA);
    }

    @Override
    public void registrarSaque(double valor) {
        System.out.println("Registrando saque de R$" + valor + " COD: " + COD_OPERACAO_AUDITORIA);
    }

    @Override
    public void registrarTransferencia(double valor, String contaDestino) {
        System.out.println("Registrando transferência de R$" + valor +
                " para conta: " + contaDestino +
                " COD: " + COD_OPERACAO_AUDITORIA);
    }
}
