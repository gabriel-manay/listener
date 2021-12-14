package com.accenture.entity;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private List<TCR> tcrs = new ArrayList<>();

    public List<TCR> getTcrs() {
        return tcrs;
    }

    public void setTcrs(List<TCR> tcrs) {
        this.tcrs = tcrs;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "tcrs=" + tcrs.toString() +
                '}';
    }
}
