package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Fk;
import br.com.annotations.Table;
import br.com.constants.HasIndication;
import br.com.constants.HasIndicationComment;
import br.com.constants.HasText;
import br.com.constants.HasUser;

@Table(name = IndicationComment.TABLE_NAME)
public class IndicationComment extends Entity implements HasUser, HasIndicationComment, HasIndication, HasText {

    private static final long serialVersionUID = 5182191272351110768L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "indication_comments";

    public interface Columns extends Entity.Columns {

        public static final String USER = "user_";
        public static final String INDICATION_COMMENT = "indication_comment";
        public static final String INDICATION = "indication";
        public static final String TEXT = "text_";
    }

    @Fk(table = User.TABLE_NAME, id = User.Columns.ID, name = IndicationComment.Columns.USER, notNull = true)
    private User user;

    @Fk(table = IndicationComment.TABLE_NAME, id = IndicationComment.Columns.ID, name = IndicationComment.Columns.INDICATION_COMMENT)
    private IndicationComment indicationComments;

    @Fk(table = Indication.TABLE_NAME, id = Indication.Columns.ID, name = IndicationComment.Columns.INDICATION, notNull = true)
    private Indication indication;

    @Column(isText = true, name = IndicationComment.Columns.TEXT)
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
    public IndicationComment getIndicationComments() {
        return indicationComments;
    }

    @Override
    public void setIndicationComments(IndicationComment indicationComments) {
        this.indicationComments = indicationComments;
    }

    @Override
    public Indication getIndication() {
        return indication;
    }

    @Override
    public void setIndication(Indication Indication) {
        this.indication = Indication;
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