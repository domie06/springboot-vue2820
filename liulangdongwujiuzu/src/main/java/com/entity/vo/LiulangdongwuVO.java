package com.entity.vo;

import com.entity.LiulangdongwuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 流浪动物
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("liulangdongwu")
public class LiulangdongwuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 动物昵称
     */

    @TableField(value = "liulangdongwu_name")
    private String liulangdongwuName;


    /**
     * 动物品种
     */

    @TableField(value = "liulangdongwu_types")
    private Integer liulangdongwuTypes;


    /**
     * 动物图片
     */

    @TableField(value = "liulangdongwu_photo")
    private String liulangdongwuPhoto;


    /**
     * 动物性别
     */

    @TableField(value = "liulangdongwu_sex_types")
    private Integer liulangdongwuSexTypes;


    /**
     * 健康状况
     */

    @TableField(value = "liulangdongwu_jiangkang")
    private String liulangdongwuJiangkang;


    /**
     * 疫苗情况
     */

    @TableField(value = "liulangdongwu_shizhang")
    private String liulangdongwuShizhang;


    /**
     * 绝育情况
     */

    @TableField(value = "liulangdongwu_jueyu")
    private String liulangdongwuJueyu;


    /**
     * 领养状态
     */

    @TableField(value = "lingyang_status_types")
    private Integer lingyangStatusTypes;


    /**
     * 动物详情
     */

    @TableField(value = "liulangdongwu_content")
    private String liulangdongwuContent;


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
	 * 设置：动物昵称
	 */
    public String getLiulangdongwuName() {
        return liulangdongwuName;
    }


    /**
	 * 获取：动物昵称
	 */

    public void setLiulangdongwuName(String liulangdongwuName) {
        this.liulangdongwuName = liulangdongwuName;
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
    public String getLiulangdongwuPhoto() {
        return liulangdongwuPhoto;
    }


    /**
	 * 获取：动物图片
	 */

    public void setLiulangdongwuPhoto(String liulangdongwuPhoto) {
        this.liulangdongwuPhoto = liulangdongwuPhoto;
    }
    /**
	 * 设置：动物性别
	 */
    public Integer getLiulangdongwuSexTypes() {
        return liulangdongwuSexTypes;
    }


    /**
	 * 获取：动物性别
	 */

    public void setLiulangdongwuSexTypes(Integer liulangdongwuSexTypes) {
        this.liulangdongwuSexTypes = liulangdongwuSexTypes;
    }
    /**
	 * 设置：健康状况
	 */
    public String getLiulangdongwuJiangkang() {
        return liulangdongwuJiangkang;
    }


    /**
	 * 获取：健康状况
	 */

    public void setLiulangdongwuJiangkang(String liulangdongwuJiangkang) {
        this.liulangdongwuJiangkang = liulangdongwuJiangkang;
    }
    /**
	 * 设置：疫苗情况
	 */
    public String getLiulangdongwuShizhang() {
        return liulangdongwuShizhang;
    }


    /**
	 * 获取：疫苗情况
	 */

    public void setLiulangdongwuShizhang(String liulangdongwuShizhang) {
        this.liulangdongwuShizhang = liulangdongwuShizhang;
    }
    /**
	 * 设置：绝育情况
	 */
    public String getLiulangdongwuJueyu() {
        return liulangdongwuJueyu;
    }


    /**
	 * 获取：绝育情况
	 */

    public void setLiulangdongwuJueyu(String liulangdongwuJueyu) {
        this.liulangdongwuJueyu = liulangdongwuJueyu;
    }
    /**
	 * 设置：领养状态
	 */
    public Integer getLingyangStatusTypes() {
        return lingyangStatusTypes;
    }


    /**
	 * 获取：领养状态
	 */

    public void setLingyangStatusTypes(Integer lingyangStatusTypes) {
        this.lingyangStatusTypes = lingyangStatusTypes;
    }
    /**
	 * 设置：动物详情
	 */
    public String getLiulangdongwuContent() {
        return liulangdongwuContent;
    }


    /**
	 * 获取：动物详情
	 */

    public void setLiulangdongwuContent(String liulangdongwuContent) {
        this.liulangdongwuContent = liulangdongwuContent;
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
