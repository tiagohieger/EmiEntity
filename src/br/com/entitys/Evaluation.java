package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Fk;
import br.com.annotations.Table;
import br.com.constants.HasClient;
import br.com.constants.HasCountStar;
import br.com.constants.HasUser;

@Table(name = Evaluation.TABLE_NAME)
public class Evaluation extends Entity implements HasUser, HasClient, HasCountStar {

    private static final long serialVersionUID = 7580842213022364236L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "evaluations";

    public interface Columns extends Entity.Columns {

        public static final String USER = "user_";
        public static final String CLIENT = "client";
        public static final String COUNT_STARS = "count_stars";
    }

    @Fk(table = User.TABLE_NAME, id = User.Columns.ID, name = Evaluation.Columns.USER, notNull = true)
    private User user;

    @Fk(table = Client.TABLE_NAME, id = Client.Columns.ID, name = Evaluation.Columns.CLIENT, notNull = true)
    private Client client;

    @Column(name = Evaluation.Columns.COUNT_STARS)
    private Integer countStars;

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
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
    public Integer getCountStars() {
        return countStars;
    }

    @Override
    public void setCountStars(Integer countStars) {
        this.countStars = countStars;
    }

}
