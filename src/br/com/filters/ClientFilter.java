package br.com.filters;

import br.com.constants.PersonType;
import br.com.entitys.Client;
import br.com.entitys.Entity;
import java.util.Date;

public class ClientFilter extends EntityFilter {

    private static final long serialVersionUID = 5252310219434246698L;

    public static class OrderBy {

        public static final String NAME = Entity.fullColumn(Client.TABLE_NAME, Client.Columns.NAME);
        public static final String REGISTRATION_DATE = Entity.fullColumn(Client.TABLE_NAME, Client.Columns.REGISTRATION_DATE);
        public static final String PERSON_TYPE = Entity.fullColumn(Client.TABLE_NAME, Client.Columns.PERSON_TYPE);
    }

    private Date minRegistrationDate, maxRegistrationDate;
    private Integer document;
    private PersonType type;
    private Boolean isActive;

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

    public Integer getDocument() {
        return document;
    }

    public void setDocument(Integer document) {
        this.document = document;
    }

    public PersonType getType() {
        return type;
    }

    public void setType(PersonType type) {
        this.type = type;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
