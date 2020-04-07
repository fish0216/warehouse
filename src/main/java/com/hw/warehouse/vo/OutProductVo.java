package com.hw.warehouse.vo;

import lombok.Data;

/**
 * 用户vo
 * @author hw
 */
@Data
public class OutProductVo {
    public String getOutName() {
        return outName;
    }

    public void setOutName(String outName) {
        this.outName = outName;
    }

    public String getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(String outNumber) {
        this.outNumber = outNumber;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public String getOutId() {
        return outId;
    }

    public void setOutId(String outId) {
        this.outId = outId;
    }

    private String outId;
    private String outName;
    private String outNumber;
    private String outDate;
}