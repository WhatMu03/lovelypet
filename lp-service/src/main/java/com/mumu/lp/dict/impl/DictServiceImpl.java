package com.mumu.lp.dict.impl;

import com.mumu.lp.dict.IDictService;
import com.mumu.lp.dict.dto.DictItem;
import com.mumu.lp.dict.entity.Dict;
import com.mumu.lp.dict.mapper.DictMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DictServiceImpl implements IDictService {
    @Autowired
    private DictMapper dictMapper;

    public Map<String, String> getDict(String beanCode){
        Map<String, String> dictMap = new HashMap<>();
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("beanCode", beanCode);
        List<Dict> dictList = dictMapper.getDict(paraMap);
        for(Dict dict : dictList){
            dictMap.put(dict.getDictCode(), dict.getDictName());
        }
        return dictMap;
    }

    @Override
    public void insertDict(DictItem dictItem) {
        Dict dict = new Dict();
        BeanUtils.copyProperties(dictItem, dict);
        dictMapper.insert(dict);

    }

    @Override
    public void updateDict(DictItem dictItem) {
        Dict dict = new Dict();
        BeanUtils.copyProperties(dictItem, dict);
        dictMapper.update(dict);
    }

    @Override
    public void deleteDict(Long id) {
        dictMapper.delete(id);
    }
}
