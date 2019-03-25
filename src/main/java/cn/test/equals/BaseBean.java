package cn.test.equals;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public abstract class BaseBean implements Serializable {

    private static final long serialVersionUID = 1L;

    protected Long id; //id提取
    protected Long storeId;//关联门店ID
    protected Long createdBy;//创建用户
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    protected Date createTime;//创建时间

    public BaseBean() {
    }

    public BaseBean(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void preSave(){
        this.createTime = new Date();
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
