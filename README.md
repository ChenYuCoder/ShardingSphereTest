# 　Sharding JDBC TEST

> 分库分表学习
> https://shardingsphere.apache.org/document/legacy/4.x/document/cn/manual/sharding-jdbc/configuration/config-spring-boot/

## 技术栈

* SpringBoot
* MybatisPlus
* ShardingJDBC

## 项目结构

* user：根据主键取模运算分库
* order：根据主键取模运算分表
* point：根据创建时间字段所在季度分表
* record：根据创建时间字段所在季度分库

## 配置与主要概念
* spring.shardingsphere.props.sql.show：log输出分片sql
* spring.shardingsphere.datasource.name：声明数据源
* spring.shardingsphere.datasource.db(0~n)：配置数据源
* spring.shardingsphere.sharding.default：所有表默认策略
* spring.shardingsphere.sharding.tables.tableName：单表分片策略
* spring.shardingsphere.sharding.tables.tableName.key-generator：分布式ID（SNOWFLAKE/UUID）
* spring.shardingsphere.sharding.tables.tableName.actual-data-nodes：数据源（数据源名 + 表名组成，以小数点分隔。多个表以逗号分隔，支持inline表达式）
* spring.shardingsphere.sharding.tables.tableName.database-strategy：分库策略
* spring.shardingsphere.sharding.tables.tableName.table-strategy：分表策略

## 备注
* 需要取消默认数据源加载
```
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
  DruidDataSourceAutoConfigure.class})
```