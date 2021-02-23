package com.vichen.record;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * @author chenyu
 * @date 2021/2/22
 */
@TableName("v_record")
public class RecordDO {

  private Long id;
  private String orderNo;
  private Date createTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    return "PointDO{" +
      "id=" + id +
      ", orderNo='" + orderNo + '\'' +
      ", createTime=" + createTime +
      '}';
  }
}
