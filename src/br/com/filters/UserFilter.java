package br.com.filters;

import br.com.constants.PersonType;
import br.com.entitys.Entity;
import br.com.entitys.User;
import java.util.Date;

public class UserFilter extends EntityFilter {

    private static final long serialVersionUID = -9084066040065871497L;

    public static class OrderBy {

        public static final String NAME = Entity.fullColumn(User.TABLE_NAME, User.Columns.NAME);
        public static final String LOGIN = Entity.fullColumn(User.TABLE_NAME, User.Columns.LOGIN);
        public static final String REGISTRATION_DATE = Entity.fullColumn(User.TABLE_NAME, User.Columns.REGISTRATION_DATE);
        public static final String PERSON_TYPE = Entity.fullColumn(User.TABLE_NAME, User.Columns.PERSON_TYPE);
    }

    private Date minRegistrationDate, maxRegistrationDate;
    private Long phone;
    private PersonType type;
    private Boolean isActive;
    private String login, password, document;

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

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

}
