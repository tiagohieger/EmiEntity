package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Fk;
import br.com.annotations.Table;
import br.com.annotations.Transient;
import br.com.constants.HasAddress;
import br.com.constants.HasContact;
import br.com.constants.HasDocument;
import br.com.constants.HasEmail;
import br.com.constants.HasFantasy;
import br.com.constants.HasActive;
import br.com.constants.HasName;
import br.com.constants.HasPersonType;
import br.com.constants.HasPhone;
import br.com.constants.HasPhoneType;
import br.com.constants.HasProducts;
import br.com.constants.HasUser;
import br.com.constants.PersonType;
import br.com.constants.PhoneType;
import java.util.LinkedList;
import java.util.List;

@Table(name = Client.TABLE_NAME)
public class Client extends Entity implements HasAddress, HasUser, HasContact, HasFantasy, HasEmail, HasPhone,
        HasPhoneType, HasPersonType, HasDocument, HasActive, HasName, HasProducts {

    private static final long serialVersionUID = -2177127966298746615L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "clients";

    public interface Columns extends Entity.Columns {

        public static final String ADDRESS = "address";
        public static final String USER = "user_";
        public static final String CONTACT = "contact";
        public static final String NAME = "name";
        public static final String FANTASY = "fantasy";
        public static final String EMAIL = "email";
        public static final String PHONE = "phone";
        public static final String PHONE_TYPE = "phone_type";
        public static final String PERSON_TYPE = "person_type";
        public static final String DOCUMENT = "document_";
        public static final String IS_ACTIVE = "is_active";
    }

    @Fk(table = Address.TABLE_NAME, id = Address.Columns.ID, name = Client.Columns.ADDRESS, notNull = true)
    private Address address;

    @Fk(table = User.TABLE_NAME, id = User.Columns.ID, name = Client.Columns.USER, notNull = true)
    private User user;

    @Column(name = Client.Columns.NAME, isText = true)
    private String name;

    @Column(name = Client.Columns.CONTACT, isText = true)
    private String contact;

    @Column(name = Client.Columns.FANTASY, isText = true, unique = true)
    private String fantasy;

    @Column(name = Client.Columns.EMAIL, isText = true, unique = true)
    private String email;

    @Column(name = Client.Columns.PHONE, isBigInt = true, unique = true)
    private Long phone;

    @Column(name = Client.Columns.PHONE_TYPE, isText = true)
    private PhoneType phoneType;

    @Column(name = Client.Columns.PERSON_TYPE, isText = true)
    private PersonType personType;

    @Column(name = Client.Columns.DOCUMENT, isBigInt = true, unique = true)
    private Long document;

    @Column(name = Client.Columns.IS_ACTIVE, notNull = true, defaultValue = "true")
    private Boolean isActive;

    @Transient
    private List<Product> products = new LinkedList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String getContact() {
        return contact;
    }

    @Override
    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String getFantasy() {
        return fantasy;
    }

    @Override
    public void setFantasy(String fantasy) {
        this.fantasy = fantasy;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
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
    public PhoneType getPhoneType() {
        return phoneType;
    }

    @Override
    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
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
    public Long getDocument() {
        return document;
    }

    @Override
    public void setDocument(Long document) {
        this.document = document;
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
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
