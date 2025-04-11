package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 领养反馈
 *
 * @author 
 * @email
 */
@TableName("lingyangfankui")
public class LingyangfankuiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LingyangfankuiEntity() {

	}

	public LingyangfankuiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 流浪动物
     */
    @TableField(value = "liulangdongwu_id")

    private Integer liulangdongwuId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 标题
     */
    @TableField(value = "lingyangfankui_name")

    private String lingyangfankuiName;


    /**
     * 动物图片
     */
    @TableField(value = "lingyangfankui_photo")

    private String lingyangfankuiPhoto;


    /**
     * 视频
     */
    @TableField(value = "lingyangfankui_video")

    private String lingyangfankuiVideo;


    /**
     * 详情
     */
    @TableField(value = "lingyangfankui_content")

    private String lingyangfankuiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：流浪动物
	 */
    public Integer getLiulangdongwuId() {
        return liulangdongwuId;
    }


    /**
	 * 获取：流浪动物
	 */

    public void setLiulangdongwuId(Integer liulangdongwuId) {
        this.liulangdongwuId = liulangdongwuId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：标题
	 */
    public String getLingyangfankuiName() {
        return lingyangfankuiName;
    }


    /**
	 * 获取：标题
	 */

    public void setLingyangfankuiName(String lingyangfankuiName) {
        this.lingyangfankuiName = lingyangfankuiName;
    }
    /**
	 * 设置：动物图片
	 */
    public String getLingyangfankuiPhoto() {
        return lingyangfankuiPhoto;
    }


    /**
	 * 获取：动物图片
	 */

    public void setLingyangfankuiPhoto(String lingyangfankuiPhoto) {
        this.lingyangfankuiPhoto = lingyangfankuiPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getLingyangfankuiVideo() {
        return lingyangfankuiVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setLingyangfankuiVideo(String lingyangfankuiVideo) {
        this.lingyangfankuiVideo = lingyangfankuiVideo;
    }
    /**
	 * 设置：详情
	 */
    public String getLingyangfankuiContent() {
        return lingyangfankuiContent;
    }


    /**
	 * 获取：详情
	 */

    public void setLingyangfankuiContent(String lingyangfankuiContent) {
        this.lingyangfankuiContent = lingyangfankuiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Lingyangfankui{" +
            "id=" + id +
            ", liulangdongwuId=" + liulangdongwuId +
            ", yonghuId=" + yonghuId +
            ", lingyangfankuiName=" + lingyangfankuiName +
            ", lingyangfankuiPhoto=" + lingyangfankuiPhoto +
            ", lingyangfankuiVideo=" + lingyangfankuiVideo +
            ", lingyangfankuiContent=" + lingyangfankuiContent +
            ", createTime=" + createTime +
        "}";
    }
}
