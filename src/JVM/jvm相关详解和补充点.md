# jvm体系结构
## 1.1什么是jvm？
>jvm即java虚拟机，用来保证java跨平台，jvm与java并没有什么必须联系，它只和特定的二进制文件格式（class文件），或者说，jvm就是一个字节码翻译器
## 1.2jvm的体系结构
>jvm由三大区域构成，分别是：1.类加载器（class loading），2.运行时储存区（runtime data areas），3.执行引擎（execution engine）
### 1.2.1 类加载器（class loading）
>类加载器中可分为三个步骤，按先后顺序为：loading（加载）、linking（链接）和initializtion（初始化）

>loading的过程包括：bootstrap loader（启动类加载器）、Extension Loader（扩展类加载器）、Application System Loader（应用系统类加载器）和用户自定义加载器

>linking的过程包括：Verification（验证）、Preparation（准备）和Resolution（解析）
>
>>Verification（验证）：验证被加载后的类是否有正确的结构，类数据是否会符合虚拟机的要求，确保不会危害虚拟机安全。

>>Preparation（准备）：为类的静态变量（static filed）在方法区分配内存，并赋默认初值（0值或null值）。如static int a = 100;
        静态变量a就会在准备阶段被赋默认值0。

>>Resolution（解析）：将类的二进制数据中的符号引用换为直接引用。

>initializtion（初始化）:类的初始化的主要工作是为静态变量赋程序设定的初值。
>>如static int a = 100;在准备阶段，a被赋默认值0，在初始化阶段就会被赋值为100。
### 1.2.2运行时储存区（runtime data areas）
>运行时储存区包括五个部分：
>>1.栈（JavaStack）:每当启用一个线程时，JVM就为他分配一个Java栈，栈是以帧为单位保存当前线程的运行状态。

>>2.堆（Heap）:一个java虚拟机实例中只存在一个堆内存空间，被所有线程共享；堆是运行时数据区域，所有类的实例和数组的内存均从此处分配，堆是在java虚拟机启动时创建的，在堆内存之外的内存成为非堆内存。

>>3.方法区域（MethodArea）:方法区与堆一样，也是被线程共享的区域，被装载的class的信息存储在方法去内存中，存储了每个类的信息，这些信息包括类的名称、方法信息、字段信息、静态变量、常量、类型信息以及编译器编译后的代码等。当虚拟机装载某个类型时，它使用类装载器定位相应的class文件，然后读入这个class文件内容并把它传输到虚拟机中。

>>4.本地方法栈（Nativemethodstack）:保存native方法进入区域的地址。

>>5.程序计数器（ProgramCounter）:
### 1.2.3执行引擎（execution engine）
>执行引擎包括三个部分：
>>1.interpret解释器（解释器）

>>2.JIT compiler(即时编译器)

>>3.GC(垃圾回收)

# 1.2.垃圾回收
