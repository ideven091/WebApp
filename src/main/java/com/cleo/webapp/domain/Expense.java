package com.cleo.webapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor

public class Expense {


    private Long expense_id;
    private ExpenseType expenseType;
    private User owner;
    private long amount;




}
