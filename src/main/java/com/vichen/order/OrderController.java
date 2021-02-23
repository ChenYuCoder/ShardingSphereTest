package com.vichen.order;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyu
 * @date 2021/2/22
 */
@RestController
@RequestMapping("order")
public class OrderController {

  private final OrderMapper orderMapper;

  public OrderController(OrderMapper orderMapper) {
    this.orderMapper = orderMapper;
  }

  @GetMapping("query")
  public List<OrderDO> query() {
    QueryWrapper<OrderDO> wrapper = new QueryWrapper<>();
    return orderMapper.selectList(wrapper);
  }

  @PostMapping("save")
  public String save(@RequestParam String orderNo) {
    OrderDO order = new OrderDO();
    order.setOrderNo(orderNo);
    order.setCreateTime(new Date());
    orderMapper.insert(order);
    return "success";
  }
}
