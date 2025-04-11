package com.entity.view;

import com.entity.LiulangdongwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 流浪动物
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("liulangdongwu")
public class LiulangdongwuView extends LiulangdongwuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 动物品种的值
		*/
		private String liulangdongwuValue;
		/**
		* 动物性别的值
		*/
		private String liulangdongwuSexValue;
		/**
		* 领养状态的值
		*/
		private String lingyangStatusValue;



	public LiulangdongwuView() {

	}

	public LiulangdongwuView(LiulangdongwuEntity liulangdongwuEntity) {
		try {
			BeanUtils.copyProperties(this, liulangdongwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 动物品种的值
			*/
			public String getLiulangdongwuValue() {
				return liulangdongwuValue;
			}
			/**
			* 设置： 动物品种的值
			*/
			public void setLiulangdongwuValue(String liulangdongwuValue) {
				this.liulangdongwuValue = liulangdongwuValue;
			}
			/**
			* 获取： 动物性别的值
			*/
			public String getLiulangdongwuSexValue() {
				return liulangdongwuSexValue;
			}
			/**
			* 设置： 动物性别的值
			*/
			public void setLiulangdongwuSexValue(String liulangdongwuSexValue) {
				this.liulangdongwuSexValue = liulangdongwuSexValue;
			}
			/**
			* 获取： 领养状态的值
			*/
			public String getLingyangStatusValue() {
				return lingyangStatusValue;
			}
			/**
			* 设置： 领养状态的值
			*/
			public void setLingyangStatusValue(String lingyangStatusValue) {
				this.lingyangStatusValue = lingyangStatusValue;
			}















}
