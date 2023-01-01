package com.cleo.webapp.domain;

import java.util.List;
import java.util.Map;

public class BalanceSheet {

    private Long id;
    private User balance_sheet_of_user;
    private Map<User,Expense> expenses_for_each_user;

}
