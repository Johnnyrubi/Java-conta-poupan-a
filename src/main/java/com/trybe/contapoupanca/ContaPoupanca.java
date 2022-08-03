package com.trybe.contapoupanca;

public class ContaPoupanca {
  private double saldo;
  private String titularConta;

  ContaPoupanca(String nome, int dinheiro) {
    this.saldo = dinheiro;
    this.titularConta = nome;
  }

  public void depositar(double dinheiro) {
    this.saldo += dinheiro;
  }

  public double mostrarSaldo() {
    return this.saldo;
  }

  public void sacar(double dinheiro) {
    this.saldo -= dinheiro;
  }

  public String mostrarTitularConta() {
    return this.titularConta;
  }
}
