package com.mumu.lp.dict.mapper;

import com.mumu.lp.dict.entity.Dict;

import java.util.List;
import java.util.Map;

public interface DictMapper {
	
	List<Dict> getAll();

	List<Dict> getDict(Map<String, String> paraMap);

	Dict getOne(Long id);

	void insert(Dict dict);

	void update(Dict dict);

	void delete(Long id);

}