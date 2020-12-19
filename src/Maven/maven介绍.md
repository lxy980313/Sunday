# 1.什么是maven？
        通俗来讲，maven就是一个用来管理项目的工具
# 2.maven工程的有点
        maven工程所用到的jar包全放在jar包仓库中
# 3.maven的安装
        1.官网下载压缩包
        2.解压到没有中文的路径下 E:\Java\apache\maven
        3.配置环境变量
        4.可在maven的同一路径下新建一个文件夹  maven-repository ，用作maven的本地仓库。
            打开D:\ProgramFiles\apache\maven\conf\settings.xml，将localRepository节点配置成上面D:\ProgramFiles\apache\maven-repository路径即可。
# 4.maven项目创建
        1.new project
        2.选择maven
        3.查找quickstart选项
        4.GroupId :com.公司名
          ArtifactId：maven_java

# 5.maven项目webapp创建
        1.new project
        2.选择maven
        3.查找webapp选项
        4.GroupId :com.公司名
          ArtifactId：maven_java

# 6.maven更换镜像
        找到mirrors元素， 在它里面添加子元素mirror：
            <mirror>
                <id>nexus-aliyun</id>
                <mirrorOf>central</mirrorOf>
                <name>Nexus aliyun</name>
                <url>http://maven.aliyun.com/nexus/content/groups/public</url>
            </mirror>