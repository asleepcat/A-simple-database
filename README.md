#一个简易的bean存储插件
**原因**：
- 当时面试阿里的一道面试题目就是如何用java搭建一个简单的数据库（不采用商业数据库），当时左思右想没有一个好的解决办法（HR的意思其实是问的文件存储）。
- 在项目的联调过程中，经常需要前段或者请求端发数据给我们，发的数据格式通常会是model实体，或者json格式。
很多情况下，为了一直测试，debug模式就需要请求端不停的发数据过来，这样就大大影响了联调速度，耽误前端时间，所以就有个需求
如何把请求端的测试数据保存下来，存到本地进行测试。        

**解决**：
采用java实现,通过操作文件进行本地存储。由于发来的数据格式可能会比较复杂（很多嵌套的实体），所以采用json格式直接存储。采用字符串直接存储到文件。当要返回测试的实体，再将json字符串自动封成bean实体。
