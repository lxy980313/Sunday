#Git
## 1.什么是Git
Git是分布式版本控制系统，及对版本的更新，并记录每次改动的内容
## 2.Git和GitHub的区别
>Git就相当于是一个软件，用于记录一个和若干文件的内容变化，以便将来查阅特定版本修订情况的软件

>GitHub是个提供在线Git服务的网站
## 3.GitHub注册
打开GitHub官网：https://github.com/，点击右上角的“sign up”注册
## 4.Git的安装

## 5.Git的使用
绑定用户名：
>git config --global user.name "用户名"

绑定邮箱
>git config --global user.email "邮箱"

生成ssh秘钥
>ssh-keygen -t rsa -C "邮箱"   然后去C:\Users\24281\.ssh查看id.rsa.pub,b把内容复制到码云里的ssh

验证
>ssh -T git@gitee.com

进入相应的目录
>cd

初始化
> mkdir 文件名
>cd 文件名
>git init

查看临时区域的文件
>git status

将文件提交到临时区域
>git add 文件名

提交
>git commit -m "备注信息"

查看更新情况
>git log

将本地仓库与远程仓库关联（先进入本地库）
>git remote add origin 仓库链接 （git@gitee.com:SternLau/test.git）

将远程仓库文件导入到本地
>git pull --rebase origin master(master为分支，输入分支名就拉哪个分支)

将本地仓库文件推到远程仓库
>git push -u origin master(master为分支，输入分支名就拉哪个分支)
## 6.IDEA配置git
1.在idea上下载gitee
2.导入本地安装的git.exe
3.选择Create API Token,输入码云账号密码
4.主界面点击VSC，Checkout from Version Control是从外部远程仓库导入代码，Import Into Version Control是连接外部仓库，将代码导出
