package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Fk;
import br.com.annotations.Table;
import br.com.constants.AlertScreen;
import br.com.constants.HasAlertScreen;
import br.com.constants.HasSearchKey;
import br.com.constants.HasText;
import br.com.constants.HasUser;

@Table(name = Alert.TABLE_NAME)
public class Alert extends Entity implements HasUser, HasText, HasSearchKey, HasAlertScreen {

    private static final long serialVersionUID = -3882404252108175549L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "alerts";

    public interface Columns extends Entity.Columns {

        public static final String USER = "user_";
        public static final String TEXT = "text_";
        public static final String SEARCH_KEY = "search_key";
        public static final String SCREEN = "screen";
    }

    @Fk(table = User.TABLE_NAME, id = User.Columns.ID, name = Alert.Columns.USER, notNull = true)
    private User user;

    @Column(isText = true, name = Alert.Columns.TEXT)
    private String text;
    
    @Column(isText = true, name = Alert.Columns.SEARCH_KEY)
    private String searchKey;
    
    @Column(isText = true, name = Alert.Columns.SCREEN)
    private AlertScreen screen;

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
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
    public String getSearchKey() {
        return searchKey;
    }

    @Override
    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    @Override
    public AlertScreen getScreen() {
        return screen;
    }

    @Override
    public void setScreen(AlertScreen screen) {
        this.screen = screen;
    }

}
