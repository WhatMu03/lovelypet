package com.mumu.lp.dict;

import com.mumu.lp.dict.dto.DictItem;

import java.util.Map;

public interface IDictService {
    public Map<String, String> getDict(String beanCode);
    public void insertDict(DictItem dictItem);
    public void updateDict(DictItem dictItem);
    public void deleteDict(Long id);
}
