package com.vichen.point;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
@RequestMapping("point")
public class PointController {

  private final PointMapper pointMapper;

  public PointController(PointMapper pointMapper) {
    this.pointMapper = pointMapper;
  }

  @GetMapping("query")
  public List<PointDO> query() {
    QueryWrapper<PointDO> wrapper = new QueryWrapper<>();
    return pointMapper.selectList(wrapper);
  }

  @PostMapping("save")
  public String save(@RequestParam String orderNo, @RequestParam String date) {
    PointDO point = new PointDO();
    point.setOrderNo(orderNo);
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date parse = null;
    try {
      parse = sdf1.parse(date);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    point.setCreateTime(parse);
    pointMapper.insert(point);
    return "success";
  }
}
