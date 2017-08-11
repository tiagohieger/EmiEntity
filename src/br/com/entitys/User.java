package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Fk;
import br.com.annotations.Table;
import br.com.constants.HasAddress;
import br.com.constants.HasBank;
import br.com.constants.HasDocument;
import br.com.constants.HasActive;
import br.com.constants.HasLogin;
import br.com.constants.HasName;
import br.com.constants.HasPassword;
import br.com.constants.HasPersonType;
import br.com.constants.HasPhone;
import br.com.constants.PersonType;

@Table(name = User.TABLE_NAME)
public class User extends Entity implements HasBank, HasAddress, HasName, HasLogin, HasPassword,
        HasPhone, HasDocument, HasPersonType, HasActive {

    private static final long serialVersionUID = 7034854585695742021L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "users";

    public interface Columns extends Entity.Columns {

        public static final String BANK = "bank";
        public static final String ADDRESS = "address";
        public static final String NAME = "name_";
        public static final String LOGIN = "login";
        public static final String PASSWORD = "password_";
        public static final String PHONE = "phone";
        public static final String DOCUMENT = "document_";
        public static final String PERSON_TYPE = "person_type";
        public static final String IS_ACTIVE = "is_active";
    }

    @Fk(table = Bank.TABLE_NAME, id = Bank.Columns.ID, name = User.Columns.BANK, notNull = true)
    private Bank bank;

    @Fk(table = Address.TABLE_NAME, id = Address.Columns.ID, name = User.Columns.ADDRESS, notNull = true)
    private Address address;

    @Column(name = User.Columns.NAME, isText = true)
    private String name;

    @Column(name = User.Columns.LOGIN, isText = true, unique = true)
    private String login;

    @Column(name = User.Columns.PASSWORD, isText = true)
    private String password;

    @Column(name = User.Columns.PHONE, isBigInt = true, unique = true)
    private Integer phone;

    @Column(name = User.Columns.DOCUMENT, isBigInt = true, unique = true)
    private Integer document;

    @Column(name = User.Columns.PERSON_TYPE, isText = true)
    private PersonType personType;

    @Column(name = User.Columns.IS_ACTIVE, notNull = true, defaultValue = "true")
    private Boolean isActive;

    @Override
    public Bank getBank() {
        return bank;
    }

    @Override
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public void setAddress(Address address) {
        this.address = address;
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
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Integer getPhone() {
        return phone;
    }

    @Override
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public Integer getDocument() {
        return document;
    }

    @Override
    public void setDocument(Integer document) {
        this.document = document;
    }

    @Override
    public PersonType getPersonType() {
        return personType;
    }

    @Override
    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    @Override
    public Boolean getIsActive() {
        return isActive;
    }

    @Override
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
