<h1>系统后端</h1>
项目信息：<br>
jdk版本：1.8<br>
maven: 3.6.1<br>
MySQL:  8.0.37<br>

>配置jdk信息
* 设置setting->project structure->project setting->设置sdk为1.8，language level8以下即可（推荐8）
>配置maven信息
* 设置setting->build tool->maven <br>
1. 第一个设置maven home，即maven文件夹所在位置
2. 第二个设置maven文件夹下的setting文件即可，注意，国内需要设置maven镜像加速，[参考此文章即可](https://blog.csdn.net/weixin_74266825/article/details/134426289)
3. 第三个设置maven本地仓库地址，推荐在maven文件夹下新建文件夹，后设置此文件夹为本地maven仓库即可，具体可参考2中连接
4. 设置好后打开设置中的maven选项，选择runner，设置jre为1.8（maven依靠jdk运行）
5. 全部设置好后，保存并应用apply，打开pom.xml文件，加载maven信息即可
>推荐设置
* setting -> build -> compiler -> java compiler -> project bytecode version<br>
设置为8即可
> 项目运行
* src -> main -> com -> system -> service -> ServiceApplication
* 右键Run或debug运行项目

<h1>这都是爸爸对你满满的爱</h1>
