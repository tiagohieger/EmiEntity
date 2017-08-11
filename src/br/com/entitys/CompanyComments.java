package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Fk;
import br.com.annotations.Table;
import br.com.constants.HasClient;
import br.com.constants.HasCompanyComment;
import br.com.constants.HasText;
import br.com.constants.HasUser;

@Table(name = CompanyComments.TABLE_NAME)
public class CompanyComments extends Entity implements HasUser, HasCompanyComment, HasClient, HasText {

    private static final long serialVersionUID = 3441815637028753587L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "company_comments";

    public interface Columns extends Entity.Columns {

        public static final String USER = "user_";
        public static final String COMPANY_COMMENT = "company_comment";
        public static final String CLIENT = "client";
        public static final String TEXT = "text_";
    }

    @Fk(table = User.TABLE_NAME, id = User.Columns.ID, name = CompanyComments.Columns.USER, notNull = true)
    private User user;

    @Fk(table = CompanyComments.TABLE_NAME, id = CompanyComments.Columns.ID, name = CompanyComments.Columns.COMPANY_COMMENT)
    private CompanyComments companyComments;

    @Fk(table = Client.TABLE_NAME, id = Client.Columns.ID, name = CompanyComments.Columns.CLIENT, notNull = true)
    private Client client;

    @Column(isText = true, name = CompanyComments.Columns.TEXT)
    private String text;

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public CompanyComments getCompanyComments() {
        return companyComments;
    }

    @Override
    public void setCompanyComments(CompanyComments companyComments) {
        this.companyComments = companyComments;
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
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

}
