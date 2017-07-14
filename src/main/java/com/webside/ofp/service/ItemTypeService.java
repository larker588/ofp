package com.webside.ofp.service;

import java.util.List;
import java.util.Map;

import com.webside.ofp.model.ItemTypeEntity;

public interface ItemTypeService {

	public List<ItemTypeEntity> queryListByPage(Map<String, Object> paramet);

}
