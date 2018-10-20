package controller_new;

public enum Command {
    NAME ("check.name.en", "NAME"),
    SECONDNAME ("check.name.en", "SECONDNAME"),
    SURNAME ("check.name.en", "SURNAME"),
    NICKNAME ("check.name.en", "NICKNAME"),
    COMMENT ("check.line", "COMMENT"),
    PHONE ("check.homephone", "HOMENUMBER"),
    MOB1 ("check.phone", "MOBNUM1"),
    MOB2 ("check.phone", "MOBNUM2"),
    EMAIL ("check.mail", "EMAIL"),
    SKYPE("check.skype", "SKYPE"),
    ZIP ("check.zip", "ZIP"),
    CITY("check.city", "CITY"),
    STREET("check.street", "STREET"),
    HOUSE ("check.home", "HOUSE"),
    FLAT ("check.flat", "FLAT");

    private String reg;
    private String mes;

    Command(String reg, String mes) {
        this.reg = reg;
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public String getReg() {
        return reg;
    }
}
