package com.mindhub.demo.dtos;

import com.mindhub.demo.models.Client;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ClientDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Set<AccountDTO> accounts= new HashSet<>();
    private Set<ClientLoanDTO> loans  = new HashSet<>();
    private Set<CardDTO> cards = new HashSet<>();

    public ClientDTO(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public ClientDTO(Client client) {
            this.id = client.getId();

            this.firstName = client.getFirstName();

            this.lastName = client.getLastName();

            this.email = client.getEmail();

            this.password = client.getPassword();

            this.accounts = client.getAccounts().stream().map(AccountDTO::new).collect(Collectors.toSet());

            this.loans = client.getLoans().stream().map(ClientLoanDTO::new).collect(Collectors.toSet());

            this.cards = client.getCards().stream().map(CardDTO::new).collect(Collectors.toSet());
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<AccountDTO> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<AccountDTO> accountsDTO) {
        this.accounts = accountsDTO;
    }

    public Set<ClientLoanDTO> getLoans() {
        return loans;
    }

    public void setLoans(Set<ClientLoanDTO> loans) {
        this.loans = loans;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<CardDTO> getCards() {
        return cards;
    }

    public void setCards(Set<CardDTO> cards) {
        this.cards = cards;
    }
}