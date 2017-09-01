package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Fk;
import br.com.annotations.Table;
import br.com.annotations.Transient;
import br.com.constants.HasClient;
import br.com.constants.HasCompanyComment;
import br.com.constants.HasCompanysComments;
import br.com.constants.HasText;
import br.com.constants.HasUser;
import java.util.LinkedList;
import java.util.List;

@Table(name = CompanyComment.TABLE_NAME)
public class CompanyComment extends Entity implements HasUser, HasCompanyComment, HasClient, HasText, HasCompanysComments {

    private static final long serialVersionUID = 3441815637028753587L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "company_comments";

    public interface Columns extends Entity.Columns {

        public static final String USER = "user_";
        public static final String COMPANY_COMMENT = "company_comment";
        public static final String CLIENT = "client";
        public static final String TEXT = "text_";
    }

    @Fk(table = User.TABLE_NAME, id = User.Columns.ID, name = CompanyComment.Columns.USER, notNull = true)
    private User user;

    @Fk(table = CompanyComment.TABLE_NAME, id = CompanyComment.Columns.ID, name = CompanyComment.Columns.COMPANY_COMMENT)
    private CompanyComment companyComments;

    @Fk(table = Client.TABLE_NAME, id = Client.Columns.ID, name = CompanyComment.Columns.CLIENT, notNull = true)
    private Client client;

    @Column(isText = true, name = CompanyComment.Columns.TEXT)
    private String text;

    @Transient
    private List<CompanyComment> companysComments = new LinkedList<>();

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public CompanyComment getCompanyComments() {
        return companyComments;
    }

    @Override
    public void setCompanyComments(CompanyComment companyComments) {
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

    @Override
    public List<CompanyComment> getCompanysComments() {
        return companysComments;
    }

    @Override
    public void setCompanysComments(List<CompanyComment> companysComments) {
        this.companysComments = companysComments;
    }

}
