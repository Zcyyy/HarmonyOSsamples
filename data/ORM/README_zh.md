# 对象关系映射数据库<a name="ZH-CN_TOPIC_0000001172200433"></a>

### 简介<a name="section103mcpsimp"></a>

本示例通过注解和继承来实现数据库和表的创建，实现了数据库的升级、备份、删除、恢复，实现了表的增删改查，并监听数据变化。

1.  @Database注解，且继承了OrmDatabase的类，对应关系型数据库；
2.  @Entity注解，且继承了OrmObject的类，对应关系型数据库中的表；
3.  OrmContext实现数据库的升级、备份、删除、恢复，表的增删改查并监听数据变化。

### 使用说明<a name="section105mcpsimp"></a>

1.  点击插入按钮插入数据，点击更新按钮更新数据，点击删除按钮删除数据，点击查询按钮查询数据并显示查询结果；
2.  点击升级按钮数据库升级，从版本1升级到3，会从1升级到2再从2升级到3；
3.  点击备份按钮数据库备份，点击删除数据库按钮删除数据库，点击恢复按钮恢复数据库。

### 约束与限制<a name="section111mcpsimp"></a>

1. 本示例支持在大型系统上运行。

2. 验证本示例的系统版本号：2.0.0.202110110309(DEVC00E1R53dexlog) GPU Turbo。

3. 验证本示例的HarmonyOS版本：2.0.0 Devloper Beta3。

4. 本示例需要使用 DevEco Studio 3.0 Beta3 (Build Version:3.0.0.533,built on September 26,2021) 才可编译。

