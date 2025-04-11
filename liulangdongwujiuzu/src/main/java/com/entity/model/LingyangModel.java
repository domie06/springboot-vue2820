package com.entity.model;

import com.entity.LingyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 流浪动物领养
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LingyangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 流浪动物
     */
    private Integer liulangdongwuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 审核状态
     */
    private Integer lingyangYesnoTypes;


    /**
     * 审核结果
     */
    private String lingyangYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：流浪动物
	 */
    public Integer getLiulangdongwuId() {
        return liulangdongwuId;
    }


    /**
	 * 设置：流浪动物
	 */
    public void setLiulangdongwuId(Integer liulangdongwuId) {
        this.liulangdongwuId = liulangdongwuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getLingyangYesnoTypes() {
        return lingyangYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setLingyangYesnoTypes(Integer lingyangYesnoTypes) {
        this.lingyangYesnoTypes = lingyangYesnoTypes;
    }
    /**
	 * 获取：审核结果
	 */
    public String getLingyangYesnoText() {
        return lingyangYesnoText;
    }


    /**
	 * 设置：审核结果
	 */
    public void setLingyangYesnoText(String lingyangYesnoText) {
        this.lingyangYesnoText = lingyangYesnoText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
