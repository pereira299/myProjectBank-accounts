package br.edu.utfpr.td.tsi.mybankprojectaccounts.models;

import br.edu.utfpr.td.tsi.mybankprojectaccounts.domains.Conta;

import java.util.ArrayList;
import java.util.List;

public interface IContaDAO {
    Conta criar(Conta conta);
    void atualizarSaldo(int numero, double saldo);
    ArrayList<Conta> buscar();
    List<Conta> buscarIdCliente(int idCliente);
    void remover(int id);
}
