package com.tejnal.bankapp.springbankapp.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * @project spring-bank-app
 * @autor tejnal on 2020-01-16
 */
@Entity
@Table(name= "withdrawals")
@Getter
@Setter
@ToString
public class Withdrawals {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "withdrawal_id")
    private long id;


    @ManyToOne(optional = false)
    @JoinColumn(name = "customer_account_id", nullable = false)
    private CustomerAccount customerAccount;

    @Column(name = "iban", nullable = false )
    private String iban;

    @Column(name = "total")
    private Double totalBalanceSum;

    @Column(name = "purpose", nullable = false )
    private String purpose;

    public Withdrawals() {

    }

    public Withdrawals(CustomerAccount customerAccount, String iban, Double totalBalanceSum, String purpose) {
        this.customerAccount = customerAccount;
        this.iban = iban;
        this.totalBalanceSum = totalBalanceSum;
        this.purpose = purpose;
    }
}
