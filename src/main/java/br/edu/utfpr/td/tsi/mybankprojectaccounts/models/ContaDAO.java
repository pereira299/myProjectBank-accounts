package br.edu.utfpr.td.tsi.mybankprojectaccounts.models;

import br.edu.utfpr.td.tsi.mybankprojectaccounts.domains.Conta;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class ContaDAO implements IContaDAO {
    private final ArrayList<Conta> lista;
    private int nextId = 0;
    private int nextNumero = 0;
    private int agencia = 0000;

    public ContaDAO() {
        lista = new ArrayList<>();
    }

    @Override
    public Conta criar(Conta conta) {
        conta.setId(this.nextId);
        conta.setNumero(nextNumero);
        conta.setAgencia(agencia);
        conta.setAberturaConta(Calendar.getInstance());
        this.lista.add(conta);
        nextId++;
        nextNumero++;
        return conta;
    }

    @Override
    public void atualizarSaldo(int numero, double saldo) {
        this.lista.stream()
                .filter(c -> c.getNumero() == numero)
                .forEach(c -> c.setSaldo(saldo));
    }

    @Override
    public ArrayList<Conta> buscar() {
        return this.lista;
    }

    @Override
    public List<Conta> buscarIdCliente(int idCliente) {
        return this.lista.stream()
                .filter(c -> c.getIdCliente() == idCliente)
                .collect(Collectors.toList());
    }

    @Override
    public void remover(int id) {
        this.lista.removeIf(c -> c.getId() == id);
    }
}
