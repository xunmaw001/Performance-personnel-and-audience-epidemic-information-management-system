package com.entity.model;

import com.entity.KaoqinxiangqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 考勤详情
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KaoqinxiangqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 考勤通知
     */
    private Integer kaoqintongzhiId;


    /**
     * 员工
     */
    private Integer yuangongId;


    /**
     * 体温
     */
    private Double kaoqinxiangqingTiwen;


    /**
     * 考勤时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：考勤通知
	 */
    public Integer getKaoqintongzhiId() {
        return kaoqintongzhiId;
    }


    /**
	 * 设置：考勤通知
	 */
    public void setKaoqintongzhiId(Integer kaoqintongzhiId) {
        this.kaoqintongzhiId = kaoqintongzhiId;
    }
    /**
	 * 获取：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 设置：员工
	 */
    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 获取：体温
	 */
    public Double getKaoqinxiangqingTiwen() {
        return kaoqinxiangqingTiwen;
    }


    /**
	 * 设置：体温
	 */
    public void setKaoqinxiangqingTiwen(Double kaoqinxiangqingTiwen) {
        this.kaoqinxiangqingTiwen = kaoqinxiangqingTiwen;
    }
    /**
	 * 获取：考勤时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：考勤时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
