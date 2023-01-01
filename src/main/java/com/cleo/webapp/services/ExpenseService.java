package com.cleo.webapp.services;

import com.cleo.webapp.domain.*;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ExpenseService {

    private final Expense expense;
    private final ExpenseType expenseType;
    private final Set<Group> groups;
    private final BalanceSheet balanceSheet;
    private final User owner;

    public ExpenseService(Expense expense, ExpenseType expenseType, Set<Group> groups, BalanceSheet balanceSheet,User owner) {
        this.expense = expense;
        this.expenseType = expenseType;
        this.groups = groups;
        this.balanceSheet = balanceSheet;
        this.owner = owner;
    }


    private long amount;



    public long getExpensesForOwner(Set<User> friends){
        Set<User> friendSet = owner.getFriends();
        for(User friend:friends){
            if(friendSet.contains(friend)){
                amount+=friend.getExpense();
            }
        }
        return amount;
    }



}
