/*
 * @Title: Image.java 
 * @Package com.corbin.pocket.dto 
 * @Description:  
 * @author Administrator  
 * @date 2016年8月27日 下午3:40:58 
 * @version V1.0   
 */
package com.corbin.pocket.po;

import java.util.Date;

import com.vo2mapper.annotation.PrimaryKey;

/**
 * @ClassName: Image
 * @Description: 图片
 * @author Administrator
 * @date 2016年8月27日 下午3:40:58
 * @author Administrator
 */
public class Image {
    // 主键
    @PrimaryKey
    private Integer id;

    // 项id
    private Integer itemId;

    // 文章id
    private Integer articleId;

    // 图片地址
    private String src;

    // 宽度
    private Integer width;

    // 高度
    private Integer height;

    private String credit;

    private String caption;

    // 创建时间
    private Date createTime;

    // 更新时间
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
