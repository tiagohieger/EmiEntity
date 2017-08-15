package br.com.filters;

import br.com.constants.IndicationStatus;
import br.com.constants.PersonType;
import br.com.entitys.Entity;
import br.com.entitys.Indication;
import java.util.Date;

public class IndicationFilter extends EntityFilter {

    private static final long serialVersionUID = 9064518292957390688L;

    public static class OrderBy {

        public static final String NAME = Entity.fullColumn(Indication.TABLE_NAME, Indication.Columns.NAME);
        public static final String STATUS = Entity.fullColumn(Indication.TABLE_NAME, Indication.Columns.STATUS);
        public static final String REGISTRATION_DATE = Entity.fullColumn(Indication.TABLE_NAME, Indication.Columns.REGISTRATION_DATE);
        public static final String PERSON_TYPE = Entity.fullColumn(Indication.TABLE_NAME, Indication.Columns.PERSON_TYPE);
    }

    private Date minRegistrationDate, maxRegistrationDate;
    private Integer user, client;
    private IndicationStatus status;
    private PersonType type;
    private Long  phone;
    private String document;

    public Date getMinRegistrationDate() {
        return minRegistrationDate;
    }

    public void setMinRegistrationDate(Date minRegistrationDate) {
        this.minRegistrationDate = minRegistrationDate;
    }

    public Date getMaxRegistrationDate() {
        return maxRegistrationDate;
    }

    public void setMaxRegistrationDate(Date maxRegistrationDate) {
        this.maxRegistrationDate = maxRegistrationDate;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

    public IndicationStatus getStatus() {
        return status;
    }

    public void setStatus(IndicationStatus status) {
        this.status = status;
    }

    public PersonType getType() {
        return type;
    }

    public void setType(PersonType type) {
        this.type = type;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

}
