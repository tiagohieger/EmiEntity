package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Table;
import br.com.constants.HasFile;

@Table(name = PaymentVoucher.TABLE_NAME)
public class PaymentVoucher extends Entity implements HasFile {

    private static final long serialVersionUID = -348504233688609132L;

    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public static final String TABLE_NAME = "payment_vouchers";

    public interface Columns extends Entity.Columns {

        public static final String FILE = "file_";
    }

    @Column(name = PaymentVoucher.Columns.FILE, isText = true)
    private String file;

    @Override
    public String getFile() {
        return file;
    }

    @Override
    public void setFile(String file) {
        this.file = file;
    }

}
