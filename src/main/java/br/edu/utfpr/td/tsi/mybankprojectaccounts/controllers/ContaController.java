package br.edu.utfpr.td.tsi.mybankprojectaccounts.controllers;

import br.edu.utfpr.td.tsi.mybankprojectaccounts.domains.Conta;
import br.edu.utfpr.td.tsi.mybankprojectaccounts.models.ContaDAO;
import br.edu.utfpr.td.tsi.mybankprojectaccounts.models.IContaDAO;

import java.util.List;

public class ContaController implements IContaController {
    private final IContaDAO contaDAO;

    public ContaController(IContaDAO contaDAO) {
        this.contaDAO = contaDAO;
    }

    public Conta criar(Conta conta) {
        if (this.contaDAO.buscarIdCliente(conta.getIdCliente()).size() > 0) {
            System.out.println("Cliente já possui conta.");
            return null;
        }

        if (conta.getSaldo() < 0) {
            System.out.println("Cliente deve possuir saldo para abrir conta.");
            return null;
        }

        if (!(conta.getSenha() >= 1000 && conta.getSenha() <= 9999)) {
            System.out.println("A senha deve ser de 4 caractéres.");
            return null;
        }

        return this.contaDAO.criar(conta);
    }
    public double atualizarSaldo(int numero, double saldo) {
        if (saldo < 0) {
            System.out.println("A conta não pode possuir saldo negativo.");
            return -1;
        }

        this.contaDAO.atualizarSaldo(numero, saldo);

        return saldo;
    }
    public List<Conta> buscar() {
        return this.contaDAO.buscar();
    }
    public List<Conta> buscarIdCliente(int idCliente) {
        if (idCliente <= 0) {
            System.out.println("ID do cliente informado é inválido.");
            return null;
        }
        return this.contaDAO.buscarIdCliente(idCliente);
    }
    public int remover(int id) {
        if (id <= 0) {
            System.out.println("ID inválido");
            return -1;
        }

        this.contaDAO.remover(id);
        return id;
    }
}
