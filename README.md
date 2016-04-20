# spring-project-demo

1> spring-demo 这个项目主要是用来做控制层和视图层。

2> spring-demo-common 这个项目主要是把公用的一些工具类，或者枚举变量放在里面。

3> spring-demo-model 这个项目主要是放mybatis生成的文件和模型层数据处理的文件。

4> 分为三部分的目的是为了各个项目的公用性增加，不写重复代码，通过maven的配置，灵活加入到各个所需要的项目里面。

5> 每个业务模块都可以分为两个项目来做。例如：商品处理的业务就可以建 product，product-model，一个负责控制层视图层，一个负责模型层，
然后公用的功能就引用 common 项目。
