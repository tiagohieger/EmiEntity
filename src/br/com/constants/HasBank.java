package br.com.constants;

import br.com.entitys.Bank;
import java.util.List;

public interface HasBank {

    public List<Bank> getBanks();

    public void setBanks(List<Bank> banks);
}
