# Compiler_2019Spring
用于哈尔滨工业大学2019年春季编译原理课程实验

## 写在课程结束之后
这门课确实是综合了相当多内容很有挑战性的一门课程，特别是实验安排导致的连续三周在最忙的时候连续验收词法分析、语法分析和语义分析，
当时几乎天天在写编译实验。最后实验完成的效果，个人不是很满意，中间使用了大量的`if-else`的特判，导致整个代码非常丑；而且由于实验时间相当紧张，完成度也不高，可能是这门课的一个遗憾吧。

说一下考试，考试之前就可以大概猜出考试题型，就是一道LL(1)文法，一道LR(1)文法，一道DAG优化，一道流图，一道访问链，一道写中间代码以及一道修改或者自行设计翻译方案的题目。**很不解的一点是，老师喜欢考原题，即使是十年之前的原题（特别是小题，挺坑的）。**

另外，强烈推荐使用龙书和虎书，这两本教材不愧称为”程序员必读“，其中相当多的讲述十分简练并且易于理解，并且这两本书可以参考使用，我从中受益良多。

于2019年5月19日 编译期末后一天

## 附加部分
- 增加函数
- 增加数组
- 增加输入输出

## 实验后总结
1. 代码很丑，特别是在进行语义分析之后。
2. 翻译方案不全，处理了函数声明，嵌套符号表，数组元素的使用，循环和分支结构；错误处理了重复定义，未定义以及函数的重复声明。
3. 使用的LR(1)文法，有二义性（在悬空else处，通过增加移进的优先级进行限定）只处理了加法和乘法运算的编译器前端；语义分析，使用仅有S属性的自底向上翻译方案。
4. 有机会可以完善的地方，**函数调用**，欢迎pull Request(~~写的太丑了，可能重写更快~~)。
