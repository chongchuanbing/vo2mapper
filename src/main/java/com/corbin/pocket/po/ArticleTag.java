/*
 * @Title: ArticleTag.java 
 * @Package com.corbin.pocket.dto 
 * @Description:  
 * @author Administrator  
 * @date 2016年8月27日 下午3:45:10 
 * @version V1.0   
 */
package com.corbin.pocket.po;

import java.util.Date;

import com.vo2mapper.annotation.PrimaryKey;

/**
 * @ClassName: ArticleTag
 * @Description: 文章和标签的关系
 * @author Administrator
 * @date 2016年8月27日 下午3:45:10
 * @author Administrator
 */
public class ArticleTag {
    // 主键
    @PrimaryKey
    private Integer id;

    // 文章id
    private Integer articleId;

    // 项id
    private Integer itemId;

    // 标签id
    private Integer tagId;

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

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
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
