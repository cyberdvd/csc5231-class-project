package zm.unza.msc.csc5231.ecommerce.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import zm.unza.msc.csc5231.ecommerce.model.Account;

import java.sql.Date;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: david
 * Date: 14/08/2019
 * Time: 2:44 PM
 **/
public class AccountService {
    private static final Logger log = LogManager.getLogger(AccountService.class);


    private static SortedMap<Long, Account> accounts = new TreeMap<>();
    private static List<Account> accountList = new ArrayList<>();


    static {
        accounts.put(0L, new Account("Administrator", "secret", "System", "Administrator", "info@weeken-market.co.zm", new Date(System.currentTimeMillis())));
    }

    static {
        for (Long id : accounts.keySet()) {
            accountList.add(accounts.get(id));
        }
    }

    public static List<Account> getAccounts() {
        return accountList;
    }

    public void save(Account account) {
        long newId = getNewId();
        System.out.println("ACCOUNT ID: "+newId);
        account.setId(newId);
        accounts.put(newId, account);
        rebuildAccountList();
    }


    private long getNewId() {
        long newId = 0;

        try {
            newId = accounts.lastKey() + 1;
        } catch (NoSuchElementException ex) {
            log.info("Id value set to 0");
        }

        return newId;
    }


    public void update(Account account) {
        Account tempAccount = accounts.get(account.getId());

        tempAccount.setFirstName(account.getFirstName());
        tempAccount.setLastName(account.getLastName());
        tempAccount.setUsername(account.getUsername());
        tempAccount.setPassword(account.getPassword());
        tempAccount.setEmail(account.getEmail());
        tempAccount.setDateOfBirth(account.getDateOfBirth());

        rebuildAccountList();
    }


    public void deletePerson(long ID) {
        accounts.remove(ID);

        rebuildAccountList();
    }


    public Account getAccount(long id) {
        return accounts.get(id);
    }


    public static void rebuildAccountList() {
        accountList = new ArrayList<>();

        for (Long id : accounts.keySet()) {
            System.out.println("ID: "+id+" a/c: "+accounts.get(id).getUsername());
            accountList.add(accounts.get(id));
        }
    }




}
