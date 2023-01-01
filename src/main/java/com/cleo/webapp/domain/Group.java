package com.cleo.webapp.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

enum GroupType{
    COLLEGE,FRIENDS,FAMILY
}

@Getter
@Setter
public class Group {

    private Long id;
    private GroupType groupType;
    private User admin;
    private Set<User> users;
    private List<Expense> expenses;
    private ExpenseType expenseType;

    public void addFriends(Set<User> users){
        admin.setFriends(users);

    }

}
