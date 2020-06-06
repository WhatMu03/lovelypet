package com.mumu.lp.dto;

import java.io.Serializable;

public class QueryPageIn implements Serializable {

    protected String beginRow;

    protected String rowCount;

    public String getBeginRow() {
        return beginRow;
    }

    public void setBeginRow(String beginRow) {
        this.beginRow = beginRow;
    }

    public String getRowCount() {
        return rowCount;
    }

    public void setRowCount(String rowCount) {
        this.rowCount = rowCount;
    }
}
