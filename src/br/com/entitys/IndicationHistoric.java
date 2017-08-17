package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Fk;
import br.com.annotations.Table;
import br.com.constants.HasIndication;
import br.com.constants.HasJson;
import br.com.constants.HasUser;

@Table(name = IndicationHistoric.TABLE_NAME)
public class IndicationHistoric extends Entity implements HasIndication, HasJson, HasUser {

    private static final long serialVersionUID = -1390516159543072505L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "indications_historic";

    public interface Columns extends Entity.Columns {

        public static final String INDICATION = "indication";
        public static final String JSON = "json";
        public static final String USER = "user_";
    }

    @Fk(table = Indication.TABLE_NAME, id = Indication.Columns.ID, name = IndicationHistoric.Columns.INDICATION, notNull = true)
    private Indication indication;

    @Fk(table = User.TABLE_NAME, id = User.Columns.ID, name = IndicationHistoric.Columns.USER, notNull = true)
    private User user;

    @Column(isText = true, notNull = true)
    private String json;

    @Override
    public Indication getIndication() {
        return indication;
    }

    @Override
    public void setIndication(Indication indication) {
        this.indication = indication;
    }

    @Override
    public String getJson() {
        return json;
    }

    @Override
    public void setJson(String json) {
        this.json = json;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }

}
