package br.com.filters;

import br.com.entitys.Entity;
import br.com.entitys.Evaluation;
import java.util.Date;

public class EvaluationFilter extends EntityFilter {

    private static final long serialVersionUID = -6554796988241696250L;

    public static class OrderBy {

        public static final String REGISTRATION_DATE = Entity.fullColumn(Evaluation.TABLE_NAME, Evaluation.Columns.REGISTRATION_DATE);
    }

    private Date minRegistrationDate, maxRegistrationDate;
    private Integer user, client;

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

}
