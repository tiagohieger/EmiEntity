package br.com.filters;

import br.com.entitys.IndicationComment;

public class IndicationCommentFilter extends EntityFilter {

    private static final long serialVersionUID = 9070693628976398664L;
    
     public static class OrderBy {

        public static final String NOME = IndicationComment.TABLE_NAME + "." + IndicationComment.Columns.REGISTRATION_DATE;
    }
    
    private Integer countLevel, indicationComment;

    public Integer getCountLevel() {
        return countLevel;
    }

    public void setCountLevel(Integer countLevel) {
        this.countLevel = countLevel;
    }

    public Integer getIndicationComment() {
        return indicationComment;
    }

    public void setIndicationComment(Integer indicationComment) {
        this.indicationComment = indicationComment;
    }
        

}
