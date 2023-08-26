# 无障碍服务<a name="ZH-CN_TOPIC_0000001133985994"></a>

### 简介<a name="section104mcpsimp"></a>

本示例为用户演示无障碍服务功能的使用，继承AccessibleAbility实现无障碍服务中监听窗口变化和点击事件以及系统物理按键来做一些操作。

1、accessibility\_ability\_config.xml中配制要监听事件的类型。

2、MyAccessibilityService继承AccessibleAbility，实现监听窗口变化进行提示，监听按钮点击进行语音播报并执行全局事件，监听系统音量键实现文本内容的上下滚动。

### 使用说明<a name="section110mcpsimp"></a>

1、根据提示，前往设置-辅助功能-无障碍-已安装的服务 中打开无障碍服务的开关后返回该应用操作。

2、进入此应用界面，点击“点击，返回桌面”，无障碍服务会监听按钮的点击，进行语音播报按钮内容并执行全局HOME事件，返回桌面。

3、点击“系统按键事件”按钮进入新界面，该界面通过监听系统音量键实现文本内容的上下滚动。

### 约束与限制<a name="section116mcpsimp"></a>

1.本示例仅支持在大型系统上运行。

2.验证本示例的系统版本号：2.0.0.202110110309(DEVC00E1R53dexlog) GPU Turbo。

3.验证本示例的HarmonyOS版本：2.0.0 Devloper Beta3。

4.本示例需要使用 DevEco Studio 3.0 Beta3 (Build Version:3.0.0.501,built on June 2,2021) 才可编译。
