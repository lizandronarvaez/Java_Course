package com.pruebas_con_junit_testing.models;

import java.math.BigDecimal;

import com.pruebas_con_junit_testing.exceptions.DineroInsuficienteException;

/**
 * Cuenta
 */
public class Cuenta {

    private String persona;
    private BigDecimal saldo;
    private Banco banco;

    public Cuenta() {
    }

    public Cuenta(String persona, BigDecimal saldo) {
        this.persona = persona;
        this.saldo = saldo;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void debito(BigDecimal monto) {
        BigDecimal nuevoSaldo = this.saldo.subtract(monto);
        if (nuevoSaldo.compareTo(BigDecimal.ZERO) < 0) {
            throw new DineroInsuficienteException("Dinero insuficiente");
        }
        this.saldo = nuevoSaldo;
    }

    public void credito(BigDecimal monto) {
        this.saldo = this.saldo.add(monto);
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Cuenta))
            return false;

        final Cuenta c = (Cuenta) obj;
        if (this.persona == null || this.saldo == null)
            return false;

        return this.persona.equals(c.getPersona()) && this.saldo.equals(c.getSaldo());
    }

    @Override
    public String toString() {
        return "Cuenta [persona=" + persona + ", saldo=" + saldo + "]";
    }

}