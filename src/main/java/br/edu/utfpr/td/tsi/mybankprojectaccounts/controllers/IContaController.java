package br.edu.utfpr.td.tsi.mybankprojectaccounts.controllers;

import br.edu.utfpr.td.tsi.mybankprojectaccounts.domains.Conta;

import java.util.List;

public interface IContaController {
    Conta criar(Conta conta);
    double atualizarSaldo(int numero, double saldo);
    List<Conta> buscar();
    List<Conta> buscarIdCliente(int idCliente);
    int remover(int id);
}
