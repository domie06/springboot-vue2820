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
 * 流浪动物领养
 *
 * @author 
 * @email
 */
@TableName("lingyang")
public class LingyangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LingyangEntity() {

	}

	public LingyangEntity(T t) {
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
     * 审核状态
     */
    @TableField(value = "lingyang_yesno_types")

    private Integer lingyangYesnoTypes;


    /**
     * 审核结果
     */
    @TableField(value = "lingyang_yesno_text")

    private String lingyangYesnoText;


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
	 * 设置：审核状态
	 */
    public Integer getLingyangYesnoTypes() {
        return lingyangYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setLingyangYesnoTypes(Integer lingyangYesnoTypes) {
        this.lingyangYesnoTypes = lingyangYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getLingyangYesnoText() {
        return lingyangYesnoText;
    }


    /**
	 * 获取：审核结果
	 */

    public void setLingyangYesnoText(String lingyangYesnoText) {
        this.lingyangYesnoText = lingyangYesnoText;
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
        return "Lingyang{" +
            "id=" + id +
            ", liulangdongwuId=" + liulangdongwuId +
            ", yonghuId=" + yonghuId +
            ", lingyangYesnoTypes=" + lingyangYesnoTypes +
            ", lingyangYesnoText=" + lingyangYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
