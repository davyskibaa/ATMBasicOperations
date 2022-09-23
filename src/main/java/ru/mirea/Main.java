package ru.mirea;

import ru.mirea.entities.Account;
import ru.mirea.entities.LimitedAccount;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("helen", 1000, "regular");
        Account withLimit = new LimitedAccount("alena-d", 300, "limit", 500);
    }
}