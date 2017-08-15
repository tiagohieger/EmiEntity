package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Table;
import br.com.constants.HasCEP;
import br.com.constants.HasCity;
import br.com.constants.HasClientHistoric;
import br.com.constants.HasDocument;
import br.com.constants.HasEmail;
import br.com.constants.HasFile;
import br.com.constants.HasName;
import br.com.constants.HasNeighborhood;
import br.com.constants.HasNote;
import br.com.constants.HasNumber;
import br.com.constants.HasPersonType;
import br.com.constants.HasPhone;
import br.com.constants.HasState;
import br.com.constants.HasIndicationStatus;
import br.com.constants.HasStreet;
import br.com.constants.HasUserHistoric;
import br.com.constants.IndicationStatus;
import br.com.constants.PersonType;

@Table(name = IndicationHistoric.TABLE_NAME)
public class IndicationHistoric extends Entity implements HasDocument, HasName, HasPersonType, HasPhone,
        HasEmail, HasIndicationStatus, HasNote, HasCEP, HasStreet, HasNeighborhood, HasNumber, HasCity,
        HasState, HasClientHistoric, HasUserHistoric, HasFile {

    private static final long serialVersionUID = -1390516159543072505L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "indications_historic";

    public interface Columns extends Entity.Columns {

        public static final String DOCUMENT = "document_";
        public static final String NAME = "name_";
        public static final String PERSON_TYPE = "person_type";
        public static final String PHONE = "phone";
        public static final String EMAIL = "email";
        public static final String STATUS = "status";
        public static final String NOTE = "note";
        public static final String CEP = "cep";
        public static final String STREET = "street";
        public static final String NEIGHBORHOOD = "neighborhood";
        public static final String NUMBER = "number_";
        public static final String CITY = "city";
        public static final String STATE = "state";
        public static final String CLIENT = "client";
        public static final String USER = "user_";
        public static final String FILE = "file_";
    }

    @Column(length = 14, name = IndicationHistoric.Columns.DOCUMENT)
    private String document;

    @Column(name = IndicationHistoric.Columns.NAME, isText = true)
    private String name;

    @Column(name = IndicationHistoric.Columns.PERSON_TYPE, isText = true)
    private PersonType personType;

    @Column(name = IndicationHistoric.Columns.PHONE, isBigInt = true)
    private Long phone;

    @Column(name = IndicationHistoric.Columns.EMAIL, isText = true)
    private String email;

    @Column(name = IndicationHistoric.Columns.STATUS, isText = true)
    private IndicationStatus status;

    @Column(name = IndicationHistoric.Columns.NOTE, isText = true)
    private String note;

    @Column(name = IndicationHistoric.Columns.CEP)
    private Integer CEP;

    @Column(name = IndicationHistoric.Columns.STREET, isText = true)
    private String street;

    @Column(name = IndicationHistoric.Columns.NEIGHBORHOOD, isText = true)
    private String neighborhood;

    @Column(name = IndicationHistoric.Columns.NUMBER, isText = true)
    private String number;

    @Column(name = IndicationHistoric.Columns.CITY, isText = true)
    private String city;

    @Column(name = IndicationHistoric.Columns.STATE, isText = true)
    private String state;

    @Column(name = IndicationHistoric.Columns.CLIENT)
    private Integer client;

    @Column(name = IndicationHistoric.Columns.USER)
    private Integer user;

    @Column(name = IndicationHistoric.Columns.FILE, isText = true)
    private String file;

    @Override
    public String getDocument() {
        return document;
    }

    @Override
    public void setDocument(String document) {
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

    @Override
    public Integer getCEP() {
        return CEP;
    }

    @Override
    public void setCEP(Integer CEP) {
        this.CEP = CEP;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getNeighborhood() {
        return neighborhood;
    }

    @Override
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String getFile() {
        return file;
    }

    @Override
    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public Integer getClient() {
        return client;
    }

    @Override
    public void setClient(Integer client) {
        this.client = client;
    }

    @Override
    public Integer getUser() {
        return user;
    }

    @Override
    public void setUser(Integer user) {
        this.user = user;
    }

}
