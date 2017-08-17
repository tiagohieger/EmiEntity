package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Fk;
import br.com.annotations.Table;
import br.com.annotations.Transient;
import br.com.constants.HasAddress;
import br.com.constants.HasDocument;
import br.com.constants.HasActive;
import br.com.constants.HasBank;
import br.com.constants.HasLogin;
import br.com.constants.HasName;
import br.com.constants.HasPassword;
import br.com.constants.HasPersonType;
import br.com.constants.HasPhone;
import br.com.constants.HasType;
import br.com.constants.HasUser;
import br.com.constants.PersonType;
import java.util.LinkedList;
import java.util.List;

@Table(name = User.TABLE_NAME)
public class User extends Entity implements HasAddress, HasName, HasLogin, HasPassword,
        HasPhone, HasDocument, HasType<PersonType>, HasActive, HasBank, HasUser {

    private static final long serialVersionUID = 7034854585695742021L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "users";

    public interface Columns extends Entity.Columns {

        public static final String ADDRESS = "address";
        public static final String NAME = "name_";
        public static final String LOGIN = "login";
        public static final String PASSWORD = "password_";
        public static final String PHONE = "phone";
        public static final String DOCUMENT = "document_";
        public static final String TYPE = "type";
        public static final String IS_ACTIVE = "is_active";
        public static final String PHOTO = "photo";
        public static final String USER = "user_";
    }

    @Fk(table = User.TABLE_NAME, id = User.Columns.ID, name = User.Columns.USER)
    private User user;

    @Fk(table = Address.TABLE_NAME, id = Address.Columns.ID, name = User.Columns.ADDRESS, notNull = true)
    private Address address;

    @Column(name = User.Columns.NAME, isText = true)
    private String name;

    @Column(name = User.Columns.LOGIN, isText = true, unique = true)
    private String login;

    @Column(name = User.Columns.PASSWORD, isText = true)
    private String password;

    @Column(name = User.Columns.PHONE, isBigInt = true, unique = true)
    private Long phone;

    @Column(name = User.Columns.DOCUMENT, length = 14, unique = true)
    private String document;

    @Column(name = User.Columns.TYPE, isText = true)
    private PersonType type;

    @Column(name = User.Columns.IS_ACTIVE, notNull = true, defaultValue = "true")
    private Boolean isActive;

    @Transient
    private List<Bank> banks = new LinkedList<>();

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
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
    public Long getPhone() {
        return phone;
    }

    @Override
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public String getDocument() {
        return document;
    }

    @Override
    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public PersonType getType() {
        return type;
    }

    @Override
    public void setType(PersonType type) {
        this.type = type;
    }

    @Override
    public Boolean getIsActive() {
        return isActive;
    }

    @Override
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public List<Bank> getBanks() {
        return banks;
    }

    @Override
    public void setBanks(List<Bank> banks) {
        this.banks = banks;
    }

}
