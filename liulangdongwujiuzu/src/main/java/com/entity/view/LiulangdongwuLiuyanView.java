package com.entity.view;

import com.entity.LiulangdongwuLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 流浪动物留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("liulangdongwu_liuyan")
public class LiulangdongwuLiuyanView extends LiulangdongwuLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 liulangdongwu
			/**
			* 动物昵称
			*/
			private String liulangdongwuName;
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
			private String liulangdongwuPhoto;
			/**
			* 动物性别
			*/
			private Integer liulangdongwuSexTypes;
				/**
				* 动物性别的值
				*/
				private String liulangdongwuSexValue;
			/**
			* 健康状况
			*/
			private String liulangdongwuJiangkang;
			/**
			* 疫苗情况
			*/
			private String liulangdongwuShizhang;
			/**
			* 绝育情况
			*/
			private String liulangdongwuJueyu;
			/**
			* 领养状态
			*/
			private Integer lingyangStatusTypes;
				/**
				* 领养状态的值
				*/
				private String lingyangStatusValue;
			/**
			* 动物详情
			*/
			private String liulangdongwuContent;

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

	public LiulangdongwuLiuyanView() {

	}

	public LiulangdongwuLiuyanView(LiulangdongwuLiuyanEntity liulangdongwuLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, liulangdongwuLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

























				//级联表的get和set liulangdongwu
					/**
					* 获取： 动物昵称
					*/
					public String getLiulangdongwuName() {
						return liulangdongwuName;
					}
					/**
					* 设置： 动物昵称
					*/
					public void setLiulangdongwuName(String liulangdongwuName) {
						this.liulangdongwuName = liulangdongwuName;
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
					public String getLiulangdongwuPhoto() {
						return liulangdongwuPhoto;
					}
					/**
					* 设置： 动物图片
					*/
					public void setLiulangdongwuPhoto(String liulangdongwuPhoto) {
						this.liulangdongwuPhoto = liulangdongwuPhoto;
					}
					/**
					* 获取： 动物性别
					*/
					public Integer getLiulangdongwuSexTypes() {
						return liulangdongwuSexTypes;
					}
					/**
					* 设置： 动物性别
					*/
					public void setLiulangdongwuSexTypes(Integer liulangdongwuSexTypes) {
						this.liulangdongwuSexTypes = liulangdongwuSexTypes;
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
					* 获取： 健康状况
					*/
					public String getLiulangdongwuJiangkang() {
						return liulangdongwuJiangkang;
					}
					/**
					* 设置： 健康状况
					*/
					public void setLiulangdongwuJiangkang(String liulangdongwuJiangkang) {
						this.liulangdongwuJiangkang = liulangdongwuJiangkang;
					}
					/**
					* 获取： 疫苗情况
					*/
					public String getLiulangdongwuShizhang() {
						return liulangdongwuShizhang;
					}
					/**
					* 设置： 疫苗情况
					*/
					public void setLiulangdongwuShizhang(String liulangdongwuShizhang) {
						this.liulangdongwuShizhang = liulangdongwuShizhang;
					}
					/**
					* 获取： 绝育情况
					*/
					public String getLiulangdongwuJueyu() {
						return liulangdongwuJueyu;
					}
					/**
					* 设置： 绝育情况
					*/
					public void setLiulangdongwuJueyu(String liulangdongwuJueyu) {
						this.liulangdongwuJueyu = liulangdongwuJueyu;
					}
					/**
					* 获取： 领养状态
					*/
					public Integer getLingyangStatusTypes() {
						return lingyangStatusTypes;
					}
					/**
					* 设置： 领养状态
					*/
					public void setLingyangStatusTypes(Integer lingyangStatusTypes) {
						this.lingyangStatusTypes = lingyangStatusTypes;
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
					/**
					* 获取： 动物详情
					*/
					public String getLiulangdongwuContent() {
						return liulangdongwuContent;
					}
					/**
					* 设置： 动物详情
					*/
					public void setLiulangdongwuContent(String liulangdongwuContent) {
						this.liulangdongwuContent = liulangdongwuContent;
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
