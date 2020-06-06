package com.mumu.lp.dict.dto;

public class DictItem {
    private Long id;
    private String beanCode;
    private String dictCode;
    private String dictName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBeanCode() {
        return beanCode;
    }

    public void setBeanCode(String beanCode) {
        this.beanCode = beanCode;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }
}
