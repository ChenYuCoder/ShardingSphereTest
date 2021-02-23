package com.vichen.record;

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
@RequestMapping("record")
public class RecordController {

  private final RecordMapper recordMapper;

  public RecordController(RecordMapper recordMapper) {
    this.recordMapper = recordMapper;
  }

  @GetMapping("query")
  public List<RecordDO> query() {
    QueryWrapper<RecordDO> wrapper = new QueryWrapper<>();
    return recordMapper.selectList(wrapper);
  }

  @PostMapping("save")
  public String save(@RequestParam String orderNo, @RequestParam String date) {
    RecordDO record = new RecordDO();
    record.setOrderNo(orderNo);
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date parse = null;
    try {
      parse = sdf1.parse(date);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    record.setCreateTime(parse);
    recordMapper.insert(record);
    return "success";
  }
}
