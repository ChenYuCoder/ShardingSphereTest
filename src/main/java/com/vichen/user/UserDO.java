package com.vichen.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * @author chenyu
 * @date 2021/2/22
 */
@TableName("v_user")
public class UserDO {
  private Long id;
  private String name;
  private Date createTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    return "UserDO{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", createTime=" + createTime +
      '}';
  }
}
