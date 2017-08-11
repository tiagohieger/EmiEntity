package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Fk;
import br.com.annotations.Table;
import br.com.constants.HasClient;
import br.com.constants.HasName;

@Table(name = Product.TABLE_NAME)
public class Product extends Entity implements HasClient, HasName {

    private static final long serialVersionUID = -6896021326677615611L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "products";

    public interface Columns extends Entity.Columns {

        public static final String CLIENT = "client";
        public static final String NAME = "name_";
    }

    @Fk(table = Client.TABLE_NAME, id = Client.Columns.ID, name = Product.Columns.CLIENT, notNull = true)
    private Client client;

    @Column(name = Product.Columns.NAME, isText = true)
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public void setClient(Client client) {
        this.client = client;
    }

}
