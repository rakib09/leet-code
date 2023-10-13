package com.extremecoder.ikm;

public enum Element {
    HELIUM("He", "Gas"),
    MAGNESIUM("Mg", "SOlid");
    private String ch;
    private String nature;
    private Element(String ch, String nat) {
        this.ch = ch;
        this.nature = nat;
    }
    public String ch() {
        return this.ch;
    }
    public String nature() {
        return this.nature;
    }


}
