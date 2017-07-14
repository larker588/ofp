package com.webside.ofp.service.impl;

import jxl.common.Logger;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webside.base.baseservice.impl.AbstractService;
import com.webside.ofp.mapper.ItemTypeMapper;
import com.webside.ofp.model.ItemTypeEntity;
import com.webside.ofp.service.ItemTypeService;

@Service("itemTypeService")
public class ItemTypeServiceImpl extends AbstractService<ItemTypeEntity, Long>implements ItemTypeService {

	private static Logger logger = Logger.getLogger(ItemTypeServiceImpl.class);

	@Autowired
	private ItemTypeMapper itemTypeMapper;

	// 这句必须要加上。不然会报空指针异常，因为在实际调用的时候不是BaseMapper调用，而是具体的mapper，这里为userMapper
	@Autowired
	public void setBaseMapper() {
		super.setBaseMapper(itemTypeMapper);
	}
}
