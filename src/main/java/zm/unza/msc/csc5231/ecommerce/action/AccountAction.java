package zm.unza.msc.csc5231.ecommerce.action;

import com.opensymphony.xwork2.ActionSupport;
import zm.unza.msc.csc5231.ecommerce.model.Account;
import zm.unza.msc.csc5231.ecommerce.service.AccountService;
import zm.unza.msc.csc5231.ecommerce.utils.CalendarUtility;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: david
 * Date: 14/08/2019
 * Time: 2:13 PM
 **/
public class AccountAction extends ActionSupport {
    private static final long serialVersionUID = 1L;


    private AccountService accountService = new AccountService();
    Account account;
    List<Account> accountList = AccountService.getAccounts();

    private long id;

    public String execute() throws Exception{

        //Persist the information in the database

        return SUCCESS;
    }

    public String create(){
        account = new Account();

        return INPUT;
    }

    public String edit(){
        account = accountService.getAccount(id);

        return INPUT;
    }

    public String saveOrUpdate(){

        if(account.getId() > 0){
            accountService.update(account);
        }else{
            accountService.save(account);
        }

        accountList = AccountService.getAccounts();
        return SUCCESS;
    }

    public String delete() {
        accountService.deletePerson(id);

        accountList = AccountService.getAccounts();

        return SUCCESS;
    }
/*
    public void validate(){
        if(account.getFirstName() == null || account.getFirstName().trim().length()==0){
            addFieldError("account.firstName","First name is required");
        }
        if(account.getLastName() == null || account.getLastName().trim().length()==0){
            addFieldError("account.lastName","Last name is required");
        }
        if(account.getUsername() == null || account.getUsername().trim().length()==0){
            addFieldError("account.username","Username is required");
        }
        if(account.getEmail() == null || account.getEmail().trim().length()==0){
            addFieldError("account.email","Email is required");
        }
        if(CalendarUtility.calculateAge(account.getDateOfBirth())<18){
            addFieldError("account.dateOfBirth","Age is required and must be 18 or above");
        }
    }*/

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
}
