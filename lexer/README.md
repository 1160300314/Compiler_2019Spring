# 需求分析
要求:阐述词法分析系统所要完成的功能
# 文法设计
要求：对如下内容展开描述
1. 给出各类单词的词法规则描述（正则文法或正则表达式）
2. 各类单词的转换图

## 各类单词的词法规则
1. digit -> [0-9]
2. letter -> [A-Za-z]
3. identifier -> [letter|_][letter|digit|_]*
4. keyword -> **'int'**|**'float'**|**'bool'**|**'record'**|**'if'**|**'else'**|**'do'**|**'while'**
5. arithmetic_operator -> '+' | '-' | '*' | '/' | '%' 
6. relation_operator -> '!=' | '>' | '<' | '>=' | '<='
7. logical_operator -> '&' | '|' | '^' | '&&' | '||' | '!'
8. delimiters -> '=' | ';' | '[' | ']' | '(' | ')' | '{' | '}'
9.  number -> digit+(.digit+)?((e|E)(+|-)?digit+)
10. comment -> /\*([^\*]*\*)*\*/(其中"."匹配任意字符)
# 系统设计
要求：分为系统概要设计和系统详细设计。
1. 系统概要设计：给出必要的系统宏观层面设计图，如系统框架图、数据流图、功能模块图等以及相应的文字说明。
2. 系统详细设计：对如下工作进行展开描述
   1. 核心数据结构的设计
   2. 主要功能函数说明
   3. 程序核心部分的程序流程图

# 系统实现及结果分析

## 测试结果
```
<STRUCT>
<ID, student>
<LP>
<INT>
<ID, id>
<SEMICOLON>
<CHAR>
<MLP>
<MRP>
<ID, name>
<SEMICOLON>
<RP>
<SEMICOLON>
<WHILE>
<SLP>
<ID, num>
<NE>
<NUM, 0>
<SRP>
<LP>
<ID, num>
<ASSIGN>
<ID, num>
<ADD>
<NUM, 1>
<SEMICOLON>
<ID, x>
<ASSIGN>
<REAL, 0.0>
<SEMICOLON>
<ID, string>
<ASSIGN>
<SEMICOLON>
<INT>
<ID, _aInt>
<ASSIGN>
<NUM, 100>
<SEMICOLON>
<ID, a>
<MLP>
<NUM, 10>
<MRP>
<ASSIGN>
<NUM, 100>
<SEMICOLON>
<BOOL>
<ID, b>
<ASSIGN>
<FALSE>
<SEMICOLON>
<INT>
<NUM, 123>
<ID, Bcd>
<SEMICOLON>
<INT>
<ID, y>
<ASSIGN>
<REAL, 1.22E10>
<SEMICOLON>
<RP>
```

## 错误信息
```
[ERROR 11]"Hello world!\n字符串格式错误
[ERROR 14]"#"为未定义的字符
```