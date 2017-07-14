package com.webside.dtgrid.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;

import com.webside.dtgrid.model.Column;

/**
 * 
 * @ClassName: GridUtils
 * @Description: dtgrid工具类，拷贝自大连首闻科技有限公司的DLShouWen Grid
 * @author gaogang
 * @date 2016年7月12日 下午3:09:19
 *
 */
public class GridUtils {
	
	/**
	 * 格式化日期
	 * @param column
	 * @param content
	 * @return
	 * @throws Exception
	 */
	public static String formatContent(Column column, String content) throws ParseException{
//			处理码表
			if(column.getCodeTable()!=null){
				if(column.getCodeTable().containsKey(content)){
					return MapUtils.getString(column.getCodeTable(), content);
				}
			}
//			处理日期、数字的默认情况
			if("date".equalsIgnoreCase(column.getType())&&column.getFormat()!=null&&!"".equals(column.getFormat())){
				if(StringUtils.isNotBlank(column.getOtype())){
					if("time_stamp_s".equals(column.getOtype())){
						Date date = new Date(Integer.parseInt(content)*1000);
						return LocalDate.fromDateFields(date).toString(DateTimeFormat.forPattern(column.getFormat()));
					}else if("time_stamp_ms".equals(column.getOtype())){
						Date date = new Date(Integer.parseInt(content));
						return LocalDate.fromDateFields(date).toString(DateTimeFormat.forPattern(column.getFormat()));
					}else if("string".equals(column.getOtype())){
						if(StringUtils.isNotBlank(column.getOformat())){
							return LocalDateTime.parse(content, DateTimeFormat.forPattern(column.getOformat().replace("hh:mm:ss", "HH:mm:ss"))).toString(DateTimeFormat.forPattern(column.getFormat().replace("hh:mm:ss", "HH:mm:ss")));
						}
					}
				}
			}else if("number".equalsIgnoreCase(column.getType()) && StringUtils.isNotBlank(column.getFormat())){
				DecimalFormat df = new DecimalFormat(column.getFormat());
				content = df.format(Double.parseDouble(content));
			}
		
		return content;
	}

}