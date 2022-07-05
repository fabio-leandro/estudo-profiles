package com.fabio.cadastrocliente.domain.enums;

public enum TipoCliente {

    PESSOAFISICA(1,"Pessoa Física"),
    PESSOAJURIDICA(2,"Pessoa Jurídica");

    private int cod;
    private String description;

    private TipoCliente(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public static TipoCliente toEnum(Integer id){

        if(id == null) return null;

        for (TipoCliente c: TipoCliente.values()){
            if (id.equals(c.getCod())) return c;
        }

        throw new IllegalArgumentException("Id invalid "+id);

    }

}
