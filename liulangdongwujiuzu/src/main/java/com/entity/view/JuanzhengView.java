package com.entity.view;

import com.entity.JuanzhengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 捐赠信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("juanzheng")
public class JuanzhengView extends JuanzhengEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 捐赠渠道的值
		*/
		private String juanzhengValue;



		//级联表 qiuzhu
			/**
			* 求助信息 的 用户
			*/
			private Integer qiuzhuYonghuId;
			/**
			* 动物昵称
			*/
			private String qiuzhuName;
			/**
			* 动物品种
			*/
			private Integer liulangdongwuTypes;
				/**
				* 动物品种的值
				*/
				private String liulangdongwuValue;
			/**
			* 动物图片
			*/
			private String qiuzhuPhoto;
			/**
			* 求助详情
			*/
			private String qiuzhuContent;

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

	public JuanzhengView() {

	}

	public JuanzhengView(JuanzhengEntity juanzhengEntity) {
		try {
			BeanUtils.copyProperties(this, juanzhengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 捐赠渠道的值
			*/
			public String getJuanzhengValue() {
				return juanzhengValue;
			}
			/**
			* 设置： 捐赠渠道的值
			*/
			public void setJuanzhengValue(String juanzhengValue) {
				this.juanzhengValue = juanzhengValue;
			}
































				//级联表的get和set qiuzhu
					/**
					* 获取：求助信息 的 用户
					*/
					public Integer getQiuzhuYonghuId() {
						return qiuzhuYonghuId;
					}
					/**
					* 设置：求助信息 的 用户
					*/
					public void setQiuzhuYonghuId(Integer qiuzhuYonghuId) {
						this.qiuzhuYonghuId = qiuzhuYonghuId;
					}

					/**
					* 获取： 动物昵称
					*/
					public String getQiuzhuName() {
						return qiuzhuName;
					}
					/**
					* 设置： 动物昵称
					*/
					public void setQiuzhuName(String qiuzhuName) {
						this.qiuzhuName = qiuzhuName;
					}
					/**
					* 获取： 动物品种
					*/
					public Integer getLiulangdongwuTypes() {
						return liulangdongwuTypes;
					}
					/**
					* 设置： 动物品种
					*/
					public void setLiulangdongwuTypes(Integer liulangdongwuTypes) {
						this.liulangdongwuTypes = liulangdongwuTypes;
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
					* 获取： 动物图片
					*/
					public String getQiuzhuPhoto() {
						return qiuzhuPhoto;
					}
					/**
					* 设置： 动物图片
					*/
					public void setQiuzhuPhoto(String qiuzhuPhoto) {
						this.qiuzhuPhoto = qiuzhuPhoto;
					}
					/**
					* 获取： 求助详情
					*/
					public String getQiuzhuContent() {
						return qiuzhuContent;
					}
					/**
					* 设置： 求助详情
					*/
					public void setQiuzhuContent(String qiuzhuContent) {
						this.qiuzhuContent = qiuzhuContent;
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
