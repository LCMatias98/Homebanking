package com.mindhub.homebanking.dtos;

import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.models.ClientLoan;

public class ClientLoanDTO {
    private long id;
    private String name;
    private Double amount;
    private Integer payments;
    private long loanId;
    private Double remainingAmount;
    private Integer remainingPayments;
    public ClientLoanDTO(ClientLoan clientLoan){
        this.id = clientLoan.getId();
        this.name = clientLoan.getLoan().getName();
        this.loanId = clientLoan.getLoan().getId();
        this.payments = clientLoan.getPayments();
        this.amount = clientLoan.getAmount();
        this.remainingAmount = clientLoan.getRemainingAmount();
        this.remainingPayments = clientLoan.getRemainingPayments();
    }

    public Double getRemainingAmount() {
        return remainingAmount;
    }

    public Integer getRemainingPayments() {
        return remainingPayments;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getAmount() {
        return amount;
    }

    public Integer getPayments() {
        return payments;
    }

    public long getLoanId() {
        return loanId;
    }
}
