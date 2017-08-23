package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Table;
import br.com.constants.HasCity;
import br.com.constants.HasNeighborhood;
import br.com.constants.HasNumber;
import br.com.constants.HasState;
import br.com.constants.HasStreet;
import br.com.constants.HasCep;

@Table(name = Address.TABLE_NAME)
public class Address extends Entity implements HasCep, HasStreet, HasNeighborhood, HasNumber, HasCity, HasState {

    private static final long serialVersionUID = -8459733558008185220L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "addresses";

    public interface Columns extends Entity.Columns {

        public static final String CEP = "cep";
        public static final String STREET = "street";
        public static final String NEIGHBORHOOD = "neighborhood";
        public static final String NUMBER = "number_";
        public static final String CITY = "city";
        public static final String STATE = "state";
    }

    @Column(name = Address.Columns.CEP)
    private Integer cep;

    @Column(name = Address.Columns.STREET, isText = true)
    private String street;

    @Column(name = Address.Columns.NEIGHBORHOOD, isText = true)
    private String neighborhood;

    @Column(name = Address.Columns.NUMBER, isText = true)
    private String number;

    @Column(name = Address.Columns.CITY, isText = true)
    private String city;

    @Column(name = Address.Columns.STATE, isText = true)
    private String state;

    @Override
    public Integer getCep() {
        return cep;
    }

    @Override
    public void setCep(Integer cep) {
        this.cep = cep;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getNeighborhood() {
        return neighborhood;
    }

    @Override
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

}
