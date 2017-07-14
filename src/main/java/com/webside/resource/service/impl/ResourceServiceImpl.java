package com.webside.resource.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webside.base.baseservice.impl.AbstractService;
import com.webside.exception.ServiceException;
import com.webside.resource.mapper.ResourceMapper;
import com.webside.resource.model.ResourceEntity;
import com.webside.resource.service.ResourceService;
import com.webside.shiro.ShiroAuthenticationManager;

@Service("resourceService")
public class ResourceServiceImpl extends AbstractService<ResourceEntity, Long>
		implements ResourceService {

	@Autowired
	private ResourceMapper resourceMapper;

	// 这句必须要加上。不然会报空指针异常，因为在实际调用的时候不是BaseMapper调用，而是具体的mapper，这里为resourceMapper
	@Autowired
	public void setBaseMapper() {
		super.setBaseMapper(resourceMapper);
	}

	@Override
	public List<ResourceEntity> findResourcesByUserId(int userId) {
		return resourceMapper.findResourcesByUserId(userId);
	}

	@Override
	public List<ResourceEntity> queryResourceList(Map<String, Object> parameter) {
		return resourceMapper.queryResourceList(parameter);
	}

	@Override
	public List<ResourceEntity> findResourcesMenuByUserId(int userId) {
		return resourceMapper.findResourcesMenuByUserId(userId);
	}

	@Override
	public boolean deleteRoleAndResource(List<Long> resourceIds) {
		try
		{
			resourceIds.forEach(resourceId -> {
				resourceMapper.deleteRolePerm(resourceId);
			});
			resourceMapper.deleteBatchById(resourceIds);
			//清空所有用户权限,重新加载权限
			ShiroAuthenticationManager.clearAllUserAuth();
			return true;
		}catch(Exception e)
		{
			throw new ServiceException(e);
		}
	}

	/* (non-Javadoc)
	 * @see com.webside.resource.service.ResourceService#queryTreeGridListByPage(java.util.Map)
	 */
	@Override
	public List<ResourceEntity> queryTreeGridListByPage(Map<String, Object> parameter) {
		return resourceMapper.queryTreeGridListByPage(parameter);
	}

	
}
