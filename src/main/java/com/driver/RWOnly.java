package com.driver;

public class RWOnly {
    private String name;
    private String readOnly="RCERT";
    private String writeOnly;
    public String getReadOnly() {
        return readOnly;
    }

    public void setWriteOnly(String writeOnly) {
        this.writeOnly = writeOnly;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
    
    

