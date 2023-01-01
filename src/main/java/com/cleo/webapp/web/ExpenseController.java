package com.cleo.webapp.web;

import com.cleo.webapp.domain.BalanceSheet;
import com.cleo.webapp.domain.Expense;
import com.cleo.webapp.domain.Group;
import com.cleo.webapp.domain.User;
import com.cleo.webapp.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Controller
public class ExpenseController {

    @Autowired
   private ExpenseService expenseService;


}
