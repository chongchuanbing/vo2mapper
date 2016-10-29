/*
 * @Title: Tag.java 
 * @Package com.corbin.pocket.dto 
 * @Description:  
 * @author Administrator  
 * @date 2016年8月27日 下午3:41:04 
 * @version V1.0   
 */
package com.corbin.pocket.po;

import java.util.Date;

import com.vo2mapper.annotation.PrimaryKey;

/**
 * @ClassName: Tag
 * @Description: //TODO 添加类/接口功能描述
 * @author Administrator
 * @date 2016年8月27日 下午3:41:04
 * @author Administrator
 */
public class Tag {
    // 主键
    @PrimaryKey
    private Integer id;

    // 项id
    private Integer itemId;

    // 文章id
    private Integer articleId;

    // 标签
    private String tagName;
    
    //创建时间
    private Date createTime;
    
    //更新时间
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

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
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
