package com.entity.model;

import com.entity.LingyangfankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 领养反馈
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LingyangfankuiModel implements Serializable {
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


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：标题
	 */
    public String getLingyangfankuiName() {
        return lingyangfankuiName;
    }


    /**
	 * 设置：标题
	 */
    public void setLingyangfankuiName(String lingyangfankuiName) {
        this.lingyangfankuiName = lingyangfankuiName;
    }
    /**
	 * 获取：动物图片
	 */
    public String getLingyangfankuiPhoto() {
        return lingyangfankuiPhoto;
    }


    /**
	 * 设置：动物图片
	 */
    public void setLingyangfankuiPhoto(String lingyangfankuiPhoto) {
        this.lingyangfankuiPhoto = lingyangfankuiPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getLingyangfankuiVideo() {
        return lingyangfankuiVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setLingyangfankuiVideo(String lingyangfankuiVideo) {
        this.lingyangfankuiVideo = lingyangfankuiVideo;
    }
    /**
	 * 获取：详情
	 */
    public String getLingyangfankuiContent() {
        return lingyangfankuiContent;
    }


    /**
	 * 设置：详情
	 */
    public void setLingyangfankuiContent(String lingyangfankuiContent) {
        this.lingyangfankuiContent = lingyangfankuiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
