package com.vichen.order;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * @author chenyu
 * @date 2021/2/22
 */
@TableName("v_order")
public class OrderDO {

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
    return "OrderDO{" +
      "id=" + id +
      ", orderNo='" + orderNo + '\'' +
      ", createTime=" + createTime +
      '}';
  }
}
