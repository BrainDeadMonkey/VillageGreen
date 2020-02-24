package com.example.villagegreen.model;

import java.util.Date;

public class Commande {

    private int com_id;
    private Date com_date;
    private String com_eta;
    private Double com_tot;
    private int cli_id;
    private String fac_adr;
    private String fac_cp;
    private String fac_vil;
    private String fac_pays;

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public Date getCom_date() {
        return com_date;
    }

    public void setCom_date(Date com_date) {
        this.com_date = com_date;
    }

    public String getCom_eta() {
        return com_eta;
    }

    public void setCom_eta(String com_eta) {
        this.com_eta = com_eta;
    }

    public Double getCom_tot() {
        return com_tot;
    }

    public void setCom_tot(Double com_tot) {
        this.com_tot = com_tot;
    }

    public int getCli_id() {
        return cli_id;
    }

    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    public String getFac_adr() {
        return fac_adr;
    }

    public void setFac_adr(String fac_adr) {
        this.fac_adr = fac_adr;
    }

    public String getFac_cp() {
        return fac_cp;
    }

    public void setFac_cp(String fac_cp) {
        this.fac_cp = fac_cp;
    }

    public String getFac_vil() {
        return fac_vil;
    }

    public void setFac_vil(String fac_vil) {
        this.fac_vil = fac_vil;
    }

    public String getFac_pays() {
        return fac_pays;
    }

    public void setFac_pays(String fac_pays) {
        this.fac_pays = fac_pays;
    }
}
