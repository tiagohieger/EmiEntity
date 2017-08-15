package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Fk;
import br.com.annotations.Table;
import br.com.constants.AccountType;
import br.com.constants.HasAccount;
import br.com.constants.HasAccountType;
import br.com.constants.HasAgency;
import br.com.constants.HasName;
import br.com.constants.HasUser;

@Table(name = Bank.TABLE_NAME)
public class Bank extends Entity implements HasName, HasAgency, HasAccount, HasAccountType, HasUser {

    private static final long serialVersionUID = -3078200761833319383L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "banks";

    public interface Columns extends Entity.Columns {

        public static final String NAME = "name_";
        public static final String USER = "user_";
        public static final String AGENCY = "agency";
        public static final String ACCOUNT = "account";
        public static final String ACCOUNT_TYPE = "account_type";
    }

    @Fk(table = User.TABLE_NAME, id = User.Columns.ID, name = Bank.Columns.USER, notNull = true)
    private User user;

    @Column(name = Bank.Columns.NAME, isText = true)
    private String name;

    @Column(name = Bank.Columns.AGENCY, isText = true)
    private String agency;

    @Column(name = Bank.Columns.ACCOUNT, isText = true)
    private String account;

    @Column(name = Bank.Columns.ACCOUNT_TYPE, isText = true)
    private AccountType accountType;

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAgency() {
        return agency;
    }

    @Override
    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public String getAccount() {
        return account;
    }

    @Override
    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public AccountType getAccountType() {
        return accountType;
    }

    @Override
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

}
