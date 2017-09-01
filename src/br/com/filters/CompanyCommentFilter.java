package br.com.filters;

import br.com.entitys.CompanyComment;

public class CompanyCommentFilter extends EntityFilter {

    private static final long serialVersionUID = -8470350476535337649L;

    public static class OrderBy {

        public static final String NOME = CompanyComment.TABLE_NAME + "." + CompanyComment.Columns.REGISTRATION_DATE;
    }

    private Integer countLevel, companyComment;

    public Integer getCountLevel() {
        return countLevel;
    }

    public void setCountLevel(Integer countLevel) {
        this.countLevel = countLevel;
    }

    public Integer getCompanyComment() {
        return companyComment;
    }

    public void setCompanyComment(Integer companyComment) {
        this.companyComment = companyComment;
    }

}
