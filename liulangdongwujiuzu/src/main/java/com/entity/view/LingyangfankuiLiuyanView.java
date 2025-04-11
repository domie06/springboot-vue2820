package com.entity.view;

import com.entity.LingyangfankuiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 领养反馈留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("lingyangfankui_liuyan")
public class LingyangfankuiLiuyanView extends LingyangfankuiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 lingyangfankui
			/**
			* 领养反馈 的 用户
			*/
			private Integer lingyangfankuiYonghuId;
			/**
			* 标题
			*/
			private String lingyangfankuiName;
			/**
			* 动物图片
			*/
			private String lingyangfankuiPhoto;
			/**
			* 视频
			*/
			private String lingyangfankuiVideo;
			/**
			* 详情
			*/
			private String lingyangfankuiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 领养需求
			*/
			private String yonghuLingyang;
			/**
			* 住址
			*/
			private String yonghuAddress;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public LingyangfankuiLiuyanView() {

	}

	public LingyangfankuiLiuyanView(LingyangfankuiLiuyanEntity lingyangfankuiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, lingyangfankuiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set lingyangfankui

					/**
					* 获取：领养反馈 的 用户
					*/
					public Integer getLingyangfankuiYonghuId() {
						return lingyangfankuiYonghuId;
					}
					/**
					* 设置：领养反馈 的 用户
					*/
					public void setLingyangfankuiYonghuId(Integer lingyangfankuiYonghuId) {
						this.lingyangfankuiYonghuId = lingyangfankuiYonghuId;
					}

					/**
					* 获取： 标题
					*/
					public String getLingyangfankuiName() {
						return lingyangfankuiName;
					}
					/**
					* 设置： 标题
					*/
					public void setLingyangfankuiName(String lingyangfankuiName) {
						this.lingyangfankuiName = lingyangfankuiName;
					}
					/**
					* 获取： 动物图片
					*/
					public String getLingyangfankuiPhoto() {
						return lingyangfankuiPhoto;
					}
					/**
					* 设置： 动物图片
					*/
					public void setLingyangfankuiPhoto(String lingyangfankuiPhoto) {
						this.lingyangfankuiPhoto = lingyangfankuiPhoto;
					}
					/**
					* 获取： 视频
					*/
					public String getLingyangfankuiVideo() {
						return lingyangfankuiVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setLingyangfankuiVideo(String lingyangfankuiVideo) {
						this.lingyangfankuiVideo = lingyangfankuiVideo;
					}
					/**
					* 获取： 详情
					*/
					public String getLingyangfankuiContent() {
						return lingyangfankuiContent;
					}
					/**
					* 设置： 详情
					*/
					public void setLingyangfankuiContent(String lingyangfankuiContent) {
						this.lingyangfankuiContent = lingyangfankuiContent;
					}



















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 领养需求
					*/
					public String getYonghuLingyang() {
						return yonghuLingyang;
					}
					/**
					* 设置： 领养需求
					*/
					public void setYonghuLingyang(String yonghuLingyang) {
						this.yonghuLingyang = yonghuLingyang;
					}
					/**
					* 获取： 住址
					*/
					public String getYonghuAddress() {
						return yonghuAddress;
					}
					/**
					* 设置： 住址
					*/
					public void setYonghuAddress(String yonghuAddress) {
						this.yonghuAddress = yonghuAddress;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}






}
