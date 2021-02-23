package com.vichen.config;

import java.util.Collection;
import java.util.Date;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

/**
 * @author chenyu
 * @date 2021/2/22
 */
public class DatabaseShardingAlgorithm implements PreciseShardingAlgorithm<Date> {

  @Override
  public String doSharding(Collection<String> collection,
    PreciseShardingValue<Date> preciseShardingValue) {

    String dbName = "ds";
    Date date = preciseShardingValue.getValue();
    String year = String.format("%tY", date);
    dbName = dbName + year + "q" + DateUtils.getSeason(date);
    return dbName;
  }

}