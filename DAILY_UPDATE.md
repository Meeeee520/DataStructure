# 数据结构每日笔记与练习更新说明

## 范围

仅写入 GitHub 仓库 `Meeeee520/DataStructure` 的 `main` 分支。日期以 Asia/Shanghai 的运行当天为准。与 Python 仓库分别保存内容，但共享既有每日任务和网站课程切换。只写学习资料，不保存私人聊天、账户资料或个人答题记录。

## 每次运行

1. 读取 `LEARNING_PLAN.md`、本文件、`README.md`、`questions/index.json` 和最近一次笔记，确定当日主题。十月按日表；之后优先使用用户的新计划，否则沿主线增加一个合理主题，明确标为延伸安排，不冒充原聊天逐日规划。
2. 编写美观、中文、适合基础学习的完整 Markdown 笔记。采用目标、概念、可运行 Java 示例与输出、易错点表、2–3 个递进任务、折叠答案、未勾选验收清单、参考与衔接的结构。不要预先断言用户已学会。
3. 实际上网搜集对应主题的练习。阅读至少两个相关官方/课程来源，优先 Oracle Java、Java 语言规范、MIT/Princeton 等课程资料。核对原题内容、链接和当天先修要求；不要编造题号、URL 或出处。
4. 保存当天 5 题，默认 3 选择、1 输出、1 Java 编程题。注明原题链接、改编方式或“依据官方概念编写”。找不到适合再发布的原题时，链接原题并写原创变式，不复制完整题库。题目难度应匹配当天，不强加尚未学的算法。
5. 验证 Java 示例和参考代码、输出与答案。编程题至少运行正常、零/空边界或单元素等有意义输入；必要先检查边界再访问元素。不能运行 Java 时先静态检查并明确报告运行验证的限制，不声称已经运行。网站不运行用户代码。
6. 笔记写 `notes/YYYY-MM/YYYY-MM-DD_知识点名.md`；题目写 `questions/YYYY-MM/YYYY-MM-DD_知识点名.json`。先写并确认题目，再更新索引，最后维护 README 的 `DAILY_NOTES_START/END` 目录，保留旧内容。直接提交 main，提交信息前缀 `docs: 每日学习笔记`。
7. 写入后读回内容。已完整存在的当天主题不重复创建；部分成功时只补缺失步骤。短暂检索失败重试一次或换官方来源；仍失败时如实报告，不伪称搜集完成，不删既有资料。

## 网站数据契约

与 Python 每日练习兼容，课程入口为 `?course=data-structures`。网站只从此公开仓库读取数据，不持有 GitHub 凭据。云任务通过用户已连接的 GitHub 插件写入，网站关闭时也要完成更新；不能用页面刷新代替写入。不要改变网站私密权限。

索引：`{"schemaVersion":1,"days":[{"date":"YYYY-MM-DD","topic":"知识点名","path":"questions/YYYY-MM/YYYY-MM-DD_知识点名.json","count":5}]}`。每个日期一条，按日期排序。

题目顶层：`schemaVersion:1`、`date`、`topic`、`stage`、`language:"Java"`、`estimatedMinutes`、`notePath`、`collectedAt`、`sources`、`questions`。

- 阶段使用 `数组与顺序表`、`栈与队列`、`链表与引用`、`综合练习`；以后可用更具体的新阶段。
- sources 每项含 title、真实 https url、kind；questions 每项含 id、type、title、difficulty、prompt、answer、explanation、hint、sourceIndex、attribution。
- type 仅使用 mcq、short、code。mcq 的 options 为字符串数组，answer 为零起始选项下标且答案唯一。
- short 的 answer 为字符串，逐行输出唯一；页面只忽略每行首尾空格与换行格式，不应放需要语义判断的开放题。
- code 含 starter、answer 和 tests（input/output 字符串数组项）；完整 Java 程序写明类名与文件名。
- JSON 字符串中的换行必须编码成解码后真正的换行，不能留下字面量反斜杠 n。
- notePath 与索引 path 指向同一日实际存在的文件；来源索引在 sources 数组范围内。

写现有文件先 fetch_file 获取当前 blob SHA 后 update_file；明确缺失才 create_file。连接失效时报告需要重新连接。用户未反馈完成情况时，不替其勾选清单。
