package com.webside.ofp.model;

import java.util.Date;

import jxl.common.Logger;

import org.apache.ibatis.type.Alias;
import org.quartz.Job;

import static org.quartz.JobBuilder.newJob;

import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.TriggerKey;

import com.webside.base.basemodel.BaseEntity;

@Alias("itemTypeEntity")
public class ItemTypeEntity extends BaseEntity {
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * 主键
	 */
	private Integer itemtypeid;
	/*
	 * 名称
	 */
	private String itemtypename;

	@Override
	public String toString() {
		return "ItemTypeEntity [itemtypeid=" + itemtypeid + ", itemtypename=" + itemtypename + ", itemtypecreatetime="
				+ itemtypecreatetime + ", itemtypemodifytime=" + itemtypemodifytime + ", itemtypecreater="
				+ itemtypecreater + ", itemtypestatus=" + itemtypestatus + "]";
	}

	public Integer getItemtypeid() {
		return itemtypeid;
	}

	public void setItemtypeid(Integer itemtypeid) {
		this.itemtypeid = itemtypeid;
	}

	public String getItemtypename() {
		return itemtypename;
	}

	public void setItemtypename(String itemtypename) {
		this.itemtypename = itemtypename;
	}

	public Date getItemtypecreatetime() {
		return itemtypecreatetime;
	}

	public void setItemtypecreatetime(Date itemtypecreatetime) {
		this.itemtypecreatetime = itemtypecreatetime;
	}

	public Date getItemtypemodifytime() {
		return itemtypemodifytime;
	}

	public void setItemtypemodifytime(Date itemtypemodifytime) {
		this.itemtypemodifytime = itemtypemodifytime;
	}

	public Integer getItemtypecreater() {
		return itemtypecreater;
	}

	public void setItemtypecreater(Integer itemtypecreater) {
		this.itemtypecreater = itemtypecreater;
	}

	public Integer getItemtypestatus() {
		return itemtypestatus;
	}

	public void setItemtypestatus(Integer itemtypestatus) {
		this.itemtypestatus = itemtypestatus;
	}

	private Date itemtypecreatetime;

	private Date itemtypemodifytime;

	private Integer itemtypecreater;
	/*
	 * 状态1:正常；0；关闭
	 */
	private Integer itemtypestatus;

}
