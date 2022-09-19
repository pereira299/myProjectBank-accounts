package br.edu.utfpr.td.tsi.mybankprojectaccounts.domains;

import java.util.Calendar;

public class Conta {
    private int id;
    private int idCliente;
    private int numero;
    private int agencia;
    private double saldo;
    private int senha;
    private Calendar aberturaConta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Calendar getAberturaConta() {
        return aberturaConta;
    }

    public void setAberturaConta(Calendar aberturaConta) {
        this.aberturaConta = aberturaConta;
    }
}
