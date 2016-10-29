/*
 * @Title: Article.java 
 * @Package com.corbin.pocket.dto 
 * @Description:  
 * @author Administrator  
 * @date 2016年8月27日 下午3:40:51 
 * @version V1.0   
 */
package com.corbin.pocket.po;

import java.util.Date;

import com.vo2mapper.annotation.PrimaryKey;

/**
 * @ClassName: Article
 * @Description: //TODO 添加类/接口功能描述
 * @author Administrator
 * @date 2016年8月27日 下午3:40:51
 * @author Administrator
 */
public class Article {
    // 主键
    @PrimaryKey
    private Integer id;

    // 项id
    private Integer itemId;

    //
    private String givenTitle;

    private String givenUrl;

    private String resolvedUrl;

    private String resolvedTitle;

    private String excerpt;

    // 是否有图片
    private Integer hasImage;

    private Date createTime;

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

    public String getGivenTitle() {
        return givenTitle;
    }

    public void setGivenTitle(String givenTitle) {
        this.givenTitle = givenTitle;
    }

    public String getGivenUrl() {
        return givenUrl;
    }

    public void setGivenUrl(String givenUrl) {
        this.givenUrl = givenUrl;
    }

    public String getResolvedUrl() {
        return resolvedUrl;
    }

    public void setResolvedUrl(String resolvedUrl) {
        this.resolvedUrl = resolvedUrl;
    }

    public String getResolvedTitle() {
        return resolvedTitle;
    }

    public void setResolvedTitle(String resolvedTitle) {
        this.resolvedTitle = resolvedTitle;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public Integer getHasImage() {
        return hasImage;
    }

    public void setHasImage(Integer hasImage) {
        this.hasImage = hasImage;
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
