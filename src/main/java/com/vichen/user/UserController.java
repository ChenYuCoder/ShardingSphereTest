package com.vichen.user;

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
@RequestMapping("user")
public class UserController {

  private final UserMapper userMapper;

  public UserController(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  @GetMapping("query")
  public List<UserDO> query() {
    QueryWrapper<UserDO> wrapper = new QueryWrapper<>();
    return userMapper.selectList(wrapper);
  }

  @PostMapping("save")
  public String save(@RequestParam String name) {
    UserDO user = new UserDO();
    user.setName(name);
    user.setCreateTime(new Date());
    userMapper.insert(user);
    return "success";
  }

}
