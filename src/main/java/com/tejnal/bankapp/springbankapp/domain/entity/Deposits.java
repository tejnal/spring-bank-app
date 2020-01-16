package com.tejnal.bankapp.springbankapp.domain.entity;

import com.tejnal.bankapp.springbankapp.enums.Currency;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;

/**
 * @project spring-bank-app
 * @autor tejnal on 2020-01-16
 */
@Entity
@Table(name= "deposits")
@Getter
@Setter
@ToString
public class Deposits {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "deposit_id")
    private long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "customer_account_id", nullable = false)
    private CustomerAccount customerAccount;

    //it is attribute for enum mapping in hibernate
    @Enumerated(EnumType.STRING)
    @Column(name = "currency", nullable = false)
    private com.tejnal.bankapp.springbankapp.enums.Currency currency;

    @Column(name = "amount", nullable = false)
    private Double amount;

    public Deposits()  {

    }

    public Deposits(CustomerAccount customerAccount, Currency currency, Double amount) {
        this.customerAccount = customerAccount;
        this.currency = currency;
        this.amount = amount;
    }
}
