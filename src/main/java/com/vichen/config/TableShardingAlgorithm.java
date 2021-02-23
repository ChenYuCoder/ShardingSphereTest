package com.vichen.config;

import java.util.Collection;
import java.util.Date;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

/**
 * @author chenyu
 * @date 2021/2/22
 */
public class TableShardingAlgorithm implements PreciseShardingAlgorithm<Date> {

  @Override
  public String doSharding(Collection<String> collection,
    PreciseShardingValue<Date> preciseShardingValue) {
    String tbName = preciseShardingValue.getLogicTableName() + "_";
    Date date = preciseShardingValue.getValue();

    String year = String.format("%tY", date);
    int season = DateUtils.getSeason(date);
    tbName = tbName + year + "_Q" + season;

    return tbName;
  }


}
