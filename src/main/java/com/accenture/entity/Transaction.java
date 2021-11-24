package com.accenture.entity;

public class Transaction {

    private TCR00 tcr00;
    private TCR01 tcr01;
    private TCR02 tcr02;

    public TCR00 getTcr00() {
        return tcr00;
    }

    public void setTcr00(TCR00 tcr00) {
        this.tcr00 = tcr00;
    }

    public TCR01 getTcr01() {
        return tcr01;
    }

    public void setTcr01(TCR01 tcr01) {
        this.tcr01 = tcr01;
    }

    public TCR02 getTcr02() {
        return tcr02;
    }

    public void setTcr02(TCR02 tcr02) {
        this.tcr02 = tcr02;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "tcr00=" + tcr00 +
                ", tcr01=" + tcr01 +
                ", tcr02=" + tcr02 +
                '}';
    }
}
