# 前台服务<a name="ZH-CN_TOPIC_0000001117613318"></a>



### 简介<a name="section9511023719"></a>

本示例通过音乐播放器，展示了前台Service的使用方法。

一般情况下Service都是在后台运行的，后台Service优先级都是比较低的，当资源不足时，系统有可能回收

正在运行的后台Service。一些场景下（如：播放音乐），用户希望应用一直运行，此时就需要用到前台

Service。前台Service会使用保持正在运行的图标在系统状态栏显示。

### 使用说明<a name="section182537201392"></a>

本示例主界面分为三个按钮，点击Start Play按钮会启动前台服务并播放音乐，点击Pause Play按钮会暂停

播放音乐，前台服务继续运行，点击Stop Play按钮会停止播放音乐并关闭前台服务。

### 约束与限制<a name="section8621026154010"></a>

1.本示例仅支持在标准系统上运行。

2.验证本示例的系统版本号：2.0.0.202110110309(DEVC00E1R53dexlog) GPU Turbo。

3.验证本示例的HarmonyOS版本：2.0.0 Devloper Beta3。

4.本示例需要使用 DevEco Studio 3.0 Beta3 (Build Version:3.0.0.533,built on September 26,2021) 才可编译。