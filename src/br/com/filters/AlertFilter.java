package br.com.filters;

import br.com.entitys.Alert;
import br.com.entitys.Entity;
import java.util.Date;

public class AlertFilter extends EntityFilter {

    private static final long serialVersionUID = 1891978872888328717L;

    public static class OrderBy {

        public static final String REGISTRATION_DATE = Entity.fullColumn(Alert.TABLE_NAME, Alert.Columns.REGISTRATION_DATE);
    }

    private Date minRegistrationDate, maxRegistrationDate;
    private Integer user;

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

}
