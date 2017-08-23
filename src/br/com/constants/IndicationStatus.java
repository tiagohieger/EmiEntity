package br.com.constants;

public enum IndicationStatus {

    WAITING_CONTACT("Aguardando contato"), NOT_LOCALIZED("Não localizado"), NO_INTEREST("Sem interesse"),
    WAITING_PAYMENT("Aguardando pagamento"), PAYMENT_MADE("Pagamento realizado"), CONTACTING("Em contato");

    private final String value;

    private IndicationStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
