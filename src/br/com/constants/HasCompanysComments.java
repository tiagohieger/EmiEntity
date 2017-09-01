package br.com.constants;

import br.com.entitys.CompanyComment;
import java.util.List;

public interface HasCompanysComments {

    public List<CompanyComment> getCompanysComments();

    public void setCompanysComments(List<CompanyComment> companysComments);

}
