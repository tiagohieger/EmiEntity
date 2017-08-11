package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Fk;
import br.com.annotations.Table;
import br.com.constants.HasBarCode;
import br.com.constants.HasBeneficiaryDocument;
import br.com.constants.HasClient;
import br.com.constants.HasClosingDate;
import br.com.constants.HasExpirationDate;
import br.com.constants.HasLink;
import br.com.constants.HasNegotiationDate;
import br.com.constants.HasNote;
import br.com.constants.HasOurNumber;
import br.com.constants.HasPayerDocument;
import br.com.constants.HasTicketStatus;
import br.com.constants.HasValue;
import br.com.constants.TicketStatus;
import java.util.Date;

@Table(name = Ticket.TABLE_NAME)
public class Ticket extends Entity implements HasClient, HasTicketStatus, HasExpirationDate, HasClosingDate,
        HasNegotiationDate, HasLink, HasNote, HasValue, HasBarCode, HasOurNumber,
        HasPayerDocument, HasBeneficiaryDocument {

    private static final long serialVersionUID = 4889318053622683863L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "tickets";

    public interface Columns extends Entity.Columns {

        public static final String CLIENT = "client";
        public static final String STATUS = "status";
        public static final String EXPIRATION_DATE = "expiration_date";
        public static final String CLOSING_DATE = "closing_date";
        public static final String NEGOTIATION_DATE = "negotiation_date";
        public static final String LINK = "link";
        public static final String NOTE = "note";
        public static final String VALUE = "value_";
        public static final String BAR_CODE = "bar_code";
        public static final String OUR_NUMBER = "our_number";
        public static final String PAYER_DOCUMENT = "payer_document";
        public static final String BENEFICIARY_DOCUMENT = "beneficiary_document";
    }

    @Fk(table = Client.TABLE_NAME, id = Client.Columns.ID, name = Ticket.Columns.CLIENT, notNull = true)
    private Client client;

    @Column(name = Ticket.Columns.STATUS, isText = true)
    private TicketStatus status;

    @Column(name = Ticket.Columns.EXPIRATION_DATE)
    private Date expirationDate;

    @Column(name = Ticket.Columns.CLOSING_DATE)
    private Date closingDate;

    @Column(name = Ticket.Columns.NEGOTIATION_DATE, isText = true)
    private Date negotiationDate;

    @Column(name = Ticket.Columns.LINK, isText = true)
    private String link;

    @Column(name = Ticket.Columns.NOTE, isText = true)
    private String note;

    @Column(name = Ticket.Columns.VALUE)
    private Integer value;

    @Column(name = Ticket.Columns.BAR_CODE, isText = true, unique = true)
    private String barCode;

    @Column(name = Ticket.Columns.OUR_NUMBER, isText = true)
    private String ourNumber;

    @Column(name = Ticket.Columns.PAYER_DOCUMENT, isText = true)
    private String payerDocument;

    @Column(name = Ticket.Columns.BENEFICIARY_DOCUMENT, isText = true)
    private String beneficiaryDocument;

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public TicketStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    @Override
    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public Date getClosingDate() {
        return closingDate;
    }

    @Override
    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    @Override
    public Date getNegotiationDate() {
        return negotiationDate;
    }

    @Override
    public void setNegotiationDate(Date negotiationDate) {
        this.negotiationDate = negotiationDate;
    }

    @Override
    public String getLink() {
        return link;
    }

    @Override
    public void setLink(String link) {
        this.link = link;
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
    public Integer getValue() {
        return value;
    }

    @Override
    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String getBarCode() {
        return barCode;
    }

    @Override
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Override
    public String getOurNumber() {
        return ourNumber;
    }

    @Override
    public void setOurNumber(String ourNumber) {
        this.ourNumber = ourNumber;
    }

    @Override
    public String getPayerDocument() {
        return payerDocument;
    }

    @Override
    public void setPayerDocument(String payerDocument) {
        this.payerDocument = payerDocument;
    }

    @Override
    public String getBeneficiaryDocument() {
        return beneficiaryDocument;
    }

    @Override
    public void setBeneficiaryDocument(String beneficiaryDocument) {
        this.beneficiaryDocument = beneficiaryDocument;
    }

}
