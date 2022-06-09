### Sentinel 学习
将sentinel 部署到Linux 上传到服务器 安装好java 环境 直接运行 `java -jar sentinel-dashboard-1.8.1.jar` 若需要后台运行，避免占用端口 
1 、推荐使用 `nohup java -jar xxxx.jar & (推荐)` 或者 
2、
```
java -jar xxx.jar &

说明： 在末尾加入 & 符号

（1）执行java -jar xxx.jar后

（2）ctrl+z 退出到控制台,执行 bg

（3）exit
```