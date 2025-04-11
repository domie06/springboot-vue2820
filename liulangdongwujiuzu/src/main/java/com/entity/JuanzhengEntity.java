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
 * 捐赠信息
 *
 * @author 
 * @email
 */
@TableName("juanzheng")
public class JuanzhengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JuanzhengEntity() {

	}

	public JuanzhengEntity(T t) {
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
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 求助
     */
    @TableField(value = "qiuzhu_id")

    private Integer qiuzhuId;


    /**
     * 捐赠渠道
     */
    @TableField(value = "juanzheng_types")

    private Integer juanzhengTypes;


    /**
     * 捐赠金额
     */
    @TableField(value = "juanzheng_number")

    private Double juanzhengNumber;


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
	 * 设置：求助
	 */
    public Integer getQiuzhuId() {
        return qiuzhuId;
    }


    /**
	 * 获取：求助
	 */

    public void setQiuzhuId(Integer qiuzhuId) {
        this.qiuzhuId = qiuzhuId;
    }
    /**
	 * 设置：捐赠渠道
	 */
    public Integer getJuanzhengTypes() {
        return juanzhengTypes;
    }


    /**
	 * 获取：捐赠渠道
	 */

    public void setJuanzhengTypes(Integer juanzhengTypes) {
        this.juanzhengTypes = juanzhengTypes;
    }
    /**
	 * 设置：捐赠金额
	 */
    public Double getJuanzhengNumber() {
        return juanzhengNumber;
    }


    /**
	 * 获取：捐赠金额
	 */

    public void setJuanzhengNumber(Double juanzhengNumber) {
        this.juanzhengNumber = juanzhengNumber;
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
        return "Juanzheng{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", qiuzhuId=" + qiuzhuId +
            ", juanzhengTypes=" + juanzhengTypes +
            ", juanzhengNumber=" + juanzhengNumber +
            ", createTime=" + createTime +
        "}";
    }
}
