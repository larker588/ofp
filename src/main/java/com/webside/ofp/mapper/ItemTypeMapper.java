package com.webside.ofp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.webside.base.basemapper.BaseMapper;
import com.webside.ofp.model.ItemTypeEntity;
import com.webside.quartz.model.ScheduleJobEntity;
import com.webside.resource.model.ResourceEntity;

@Repository
public interface ItemTypeMapper extends BaseMapper<ItemTypeEntity, Long> {
	/**
	 * 查询权限树集合
	 * 
	 * @param parameter
	 *            参数可参考mapping文件
	 * @return
	 */
	public List<ItemTypeEntity> queryListByPage(Map<String, Object> parameter);
}
