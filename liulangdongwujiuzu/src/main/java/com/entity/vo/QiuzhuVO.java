package com.entity.vo;

import com.entity.QiuzhuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 求助信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qiuzhu")
public class QiuzhuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 动物昵称
     */

    @TableField(value = "qiuzhu_name")
    private String qiuzhuName;


    /**
     * 动物品种
     */

    @TableField(value = "liulangdongwu_types")
    private Integer liulangdongwuTypes;


    /**
     * 动物图片
     */

    @TableField(value = "qiuzhu_photo")
    private String qiuzhuPhoto;


    /**
     * 求助详情
     */

    @TableField(value = "qiuzhu_content")
    private String qiuzhuContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：动物昵称
	 */
    public String getQiuzhuName() {
        return qiuzhuName;
    }


    /**
	 * 获取：动物昵称
	 */

    public void setQiuzhuName(String qiuzhuName) {
        this.qiuzhuName = qiuzhuName;
    }
    /**
	 * 设置：动物品种
	 */
    public Integer getLiulangdongwuTypes() {
        return liulangdongwuTypes;
    }


    /**
	 * 获取：动物品种
	 */

    public void setLiulangdongwuTypes(Integer liulangdongwuTypes) {
        this.liulangdongwuTypes = liulangdongwuTypes;
    }
    /**
	 * 设置：动物图片
	 */
    public String getQiuzhuPhoto() {
        return qiuzhuPhoto;
    }


    /**
	 * 获取：动物图片
	 */

    public void setQiuzhuPhoto(String qiuzhuPhoto) {
        this.qiuzhuPhoto = qiuzhuPhoto;
    }
    /**
	 * 设置：求助详情
	 */
    public String getQiuzhuContent() {
        return qiuzhuContent;
    }


    /**
	 * 获取：求助详情
	 */

    public void setQiuzhuContent(String qiuzhuContent) {
        this.qiuzhuContent = qiuzhuContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
