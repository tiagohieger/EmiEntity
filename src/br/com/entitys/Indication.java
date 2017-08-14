package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Fk;
import br.com.annotations.Table;
import br.com.constants.HasAddress;
import br.com.constants.HasClient;
import br.com.constants.HasDocument;
import br.com.constants.HasEmail;
import br.com.constants.HasName;
import br.com.constants.HasNote;
import br.com.constants.HasPaymentVoucher;
import br.com.constants.HasPersonType;
import br.com.constants.HasPhone;
import br.com.constants.HasIndicationStatus;
import br.com.constants.HasUser;
import br.com.constants.IndicationStatus;
import br.com.constants.PersonType;

@Table(name = Indication.TABLE_NAME)
public class Indication extends Entity implements HasUser, HasAddress, HasPaymentVoucher, HasClient, HasDocument,
        HasName, HasPersonType, HasPhone, HasEmail, HasIndicationStatus, HasNote {

    private static final long serialVersionUID = -7488500782593964146L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "indications";

    public interface Columns extends Entity.Columns {

        public static final String USER = "user_";
        public static final String ADDRESS = "address";
        public static final String PAYMENT_VOUCHER = "payment_voucher";
        public static final String CLIENT = "client";
        public static final String DOCUMENT = "document_";
        public static final String NAME = "name_";
        public static final String PERSON_TYPE = "person_type";
        public static final String PHONE = "phone";
        public static final String EMAIL = "email";
        public static final String STATUS = "status";
        public static final String NOTE = "note";
    }

    @Fk(table = User.TABLE_NAME, id = User.Columns.ID, name = Indication.Columns.USER, notNull = true)
    private User user;

    @Fk(table = Address.TABLE_NAME, id = Address.Columns.ID, name = Indication.Columns.ADDRESS, notNull = true)
    private Address address;

    @Fk(table = PaymentVoucher.TABLE_NAME, id = PaymentVoucher.Columns.ID, name = Indication.Columns.PAYMENT_VOUCHER, notNull = true)
    private PaymentVoucher paymentVoucher;

    @Fk(table = Client.TABLE_NAME, id = Client.Columns.ID, name = Indication.Columns.CLIENT, notNull = true)
    private Client client;

    @Column(isBigInt = true, name = Indication.Columns.DOCUMENT)
    private Long document;

    @Column(name = Indication.Columns.NAME, isText = true)
    private String name;

    @Column(name = Indication.Columns.PERSON_TYPE, isText = true)
    private PersonType personType;

    @Column(name = Indication.Columns.PHONE, isBigInt = true)
    private Long phone;

    @Column(name = Indication.Columns.EMAIL, isText = true)
    private String email;

    @Column(name = Indication.Columns.STATUS, isText = true)
    private IndicationStatus status;

    @Column(name = Indication.Columns.NOTE, isText = true)
    private String note;

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
    public PaymentVoucher getPaymentVoucher() {
        return paymentVoucher;
    }

    @Override
    public void setPaymentVoucher(PaymentVoucher paymentVoucher) {
        this.paymentVoucher = paymentVoucher;
    }

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public void setClient(Client client) {
        this.client = client;
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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
    public Long getPhone() {
        return phone;
    }

    @Override
    public void setPhone(Long phone) {
        this.phone = phone;
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
    public IndicationStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(IndicationStatus status) {
        this.status = status;
    }

    @Override
    public String getNote() {
        return note;
    }

    @Override
    public void setNote(String note) {
        this.note = note;
    }

}
