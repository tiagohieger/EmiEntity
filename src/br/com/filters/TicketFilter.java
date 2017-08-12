package br.com.filters;

import br.com.entitys.Entity;
import br.com.entitys.Ticket;
import java.util.Date;

public class TicketFilter extends EntityFilter {

    private static final long serialVersionUID = -3597973389084569061L;

    public static class OrderBy {

        public static final String STATUS = Entity.fullColumn(Ticket.TABLE_NAME, Ticket.Columns.STATUS);
        public static final String REGISTRATION_DATE = Entity.fullColumn(Ticket.TABLE_NAME, Ticket.Columns.REGISTRATION_DATE);
        public static final String CLOSSING_DATE = Entity.fullColumn(Ticket.TABLE_NAME, Ticket.Columns.CLOSING_DATE);
        public static final String NEGOTIATION_DATE = Entity.fullColumn(Ticket.TABLE_NAME, Ticket.Columns.NEGOTIATION_DATE);
    }

    private Date minRegistrationDate, maxRegistrationDate;
    private Date minExpirationDate, maxExpirationDate;
    private Date minClosingDate, maxClosingDate;
    private String barCode, ourNumber, payerDocument, beneficiaryDocument;
    private Integer client;

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

    public Date getMinExpirationDate() {
        return minExpirationDate;
    }

    public void setMinExpirationDate(Date minExpirationDate) {
        this.minExpirationDate = minExpirationDate;
    }

    public Date getMaxExpirationDate() {
        return maxExpirationDate;
    }

    public void setMaxExpirationDate(Date maxExpirationDate) {
        this.maxExpirationDate = maxExpirationDate;
    }

    public Date getMinClosingDate() {
        return minClosingDate;
    }

    public void setMinClosingDate(Date minClosingDate) {
        this.minClosingDate = minClosingDate;
    }

    public Date getMaxClosingDate() {
        return maxClosingDate;
    }

    public void setMaxClosingDate(Date maxClosingDate) {
        this.maxClosingDate = maxClosingDate;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getOurNumber() {
        return ourNumber;
    }

    public void setOurNumber(String ourNumber) {
        this.ourNumber = ourNumber;
    }

    public String getPayerDocument() {
        return payerDocument;
    }

    public void setPayerDocument(String payerDocument) {
        this.payerDocument = payerDocument;
    }

    public String getBeneficiaryDocument() {
        return beneficiaryDocument;
    }

    public void setBeneficiaryDocument(String beneficiaryDocument) {
        this.beneficiaryDocument = beneficiaryDocument;
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

}
