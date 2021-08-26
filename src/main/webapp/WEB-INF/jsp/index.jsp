<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta charset="UTF-8">
        <title>shurikeygear管理</title>
        <!-- 引入 ECharts 文件 -->
        <script src="echarts.min.js"></script>
        <link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
    </head>
    <body style="overflow: hidden;">
        <ul class="layui-nav" style="text-align: right;">
            <li class="layui-nav-item">
                <a href="">控制台<span class="layui-badge">9</span></a>
            </li>
            <li class="layui-nav-item">
                <a href="">个人中心<span class="layui-badge-dot"></span></a>
            </li>
            <li class="layui-nav-item">
                <a href=""><img src="//t.cn/RCzsdCq" class="layui-nav-img">我</a>
                <dl class="layui-nav-child">
                  <dd><a href="javascript:;">修改信息</a></dd>
                  <dd><a href="javascript:;">安全管理</a></dd>
                  <dd><a href="login.html">退出</a></dd>
                </dl>
            </li>
        </ul>
        
        <div>
            <div class="layui-panel layui-col-md2" style="background-color: aliceblue;">
                <ul class="layui-menu" id="docDemoMenu1" style="background-color: aliceblue;">
                    <li lay-options="{id: 100}">
                        <div class="layui-menu-body-title">官网首页管理</div>
                    </li>
                    <li class="layui-menu-item-divider"></li>
                    <li lay-options="{id: 101}">
                        <div class="layui-menu-body-title">
                            <a href="#">会员&商务管理
                            <!--<span class="layui-badge-dot"></span>-->
                            </a>
                        </div>
                    </li>
                    <li class="layui-menu-item-divider"></li>
                    <li class="layui-menu-item-group layui-menu-item-down" lay-options="{type: 'group'}">
                        <div class="layui-menu-body-title">
                            产品管理<i class="layui-icon layui-icon-up"></i>
                        </div>
                        <ul>
                            <li lay-options="{id: 1031}">产品分类类型</li>
                            <li lay-options="{id: 1032}">
                                <div class="layui-menu-body-title">主题产品管理</div>
                            </li>
                        </ul>
                    </li>
                    <li class="layui-menu-item-divider"></li>
                    <li class="layui-menu-item-group layui-menu-item-down" lay-options="{type: 'group'}">
                        <div class="layui-menu-body-title">
                            私人定制管理<i class="layui-icon layui-icon-up"></i>
                        </div>
                        <ul>
                            <li lay-options="{id: 1031}">功能管理</li>
                            <li lay-options="{id: 1032}">
                                <div class="layui-menu-body-title">各零件管理</div>
                            </li>
                        </ul>
                    </li>
                    <li class="layui-menu-item-divider"></li>
                    <li class="layui-menu-item-group layui-menu-item-down" lay-options="{type: 'group'}">
                        <div class="layui-menu-body-title">
                            订单管理<i class="layui-icon layui-icon-up"></i>
                        </div>
                        <ul>
                            <li lay-options="{id: 1031}">待支付订单</li>
                            <li lay-options="{id: 1032}">
                                <div class="layui-menu-body-title">已支付订单</div>
                            </li>
                            <li lay-options="{id: 1031}">已发货订单</li>
                            <li lay-options="{id: 1032}">
                                <div class="layui-menu-body-title">已退款订单</div>
                            </li>
                            <li lay-options="{id: 1031}">已过期订单</li>
                        </ul>
                    </li>
                    <li class="layui-menu-item-divider"></li>
                    <li class="layui-menu-item-group layui-menu-item-down" lay-options="{type: 'group'}">
                        <div class="layui-menu-body-title">
                            售后管理<i class="layui-icon layui-icon-up"></i>
                        </div>
                        <ul>
                            <li lay-options="{id: 1031}">说明书管理</li>
                            <li lay-options="{id: 1032}">
                                <div class="layui-menu-body-title">驱动程序管理</div>
                            </li>
                            <li lay-options="{id: 1031}">常见问题</li>
                            <li lay-options="{id: 1032}">
                                <div class="layui-menu-body-title">保修说明</div>
                            </li>
                            <li lay-options="{id: 1031}">序列号查询</li>
                        </ul>
                    </li>
                    <li class="layui-menu-item-divider"></li>
                    <li class="layui-menu-item-parent" lay-options="{type: 'parent'}">
                        <div class="layui-menu-body-title">
                            menu item 5 
                            <i class="layui-icon layui-icon-right"></i>
                        </div>
                        <div class="layui-panel layui-menu-body-panel">
                            <ul>
                                <li lay-options="{id: 1051}">
                                    <div class="layui-menu-body-title">menu item 5-1</div>
                                </li>
                                <li lay-options="{id: 1051}">
                                    <div class="layui-menu-body-title">menu item 5-2</div>
                                </li>
                            </ul>
                      </div>
                    </li>
                </ul>
            </div>
            
            <div class="layui-col-xs10 layui-col-sm10 layui-col-md10">
                    <div class="layui-col-xs12 layui-col-sm5 layui-col-md5">
                        <p style="font-size: 23px; font-weight: bolder; line-height: 40px; padding-left: 20px;">参数设置</p>
                        <hr class="layui-border-black">
                        <form class="layui-form" action="">
                            <div class="layui-form-item">
                                <label class="layui-form-label">呈现方式：</label>
                                <div class="layui-input-block" style="width: 160px;">
                                    <select id="chooseBlueprintValue" name="" lay-verify="required" lay-filter="chooseBlueprint">
                                        <option value="line">趋势折线图</option>
                                        <option value="pie">份额分布图</option>
                                    </select> 
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">度量：</label>
                                <div class="layui-input-block" style="width: 160px;">
                                    <select id="chooseTolValue" name="" lay-verify="required" lay-filter="chooseTolValue">
                                        <option value="销量">销量</option>
                                        <option value="销售额">销售额</option>
                                        <option value="加购">加购</option>
                                        <option value="已终止">退货</option>
                                    </select>   
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">采样时间：</label>
                                <div class="layui-input-inline" style="width: 120px; float: none;">
                                    <input type="text" class="layui-input" id="startTime">
                                </div>
                                <span>&nbsp;to&nbsp;&nbsp;&nbsp;</span>
                                <div class="layui-input-inline" style="width: 120px; float: none;">
                                    <input type="text" class="layui-input" id="endTime">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">采样范围：</label>
                                <div class="layui-input-block" style="width: 160px;">
                                    <select id="chooseAddAll" name="" lay-verify="required" lay-filter="chooseValue">
                                        <option id="delAll" value="全部">全部</option>
                                        <option value="订制类型">订制类型</option>
                                        <option value="地区">地区</option>
                                        <option value="尺寸">尺寸</option>
                                        <option value="主题">主题</option>
                                        <option value="轴体">轴体</option>
                                        <option value="连接方式">连接方式</option>
                                        <option value="价格区间">价格区间</option>
                                    </select>   
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">可选：</label>
                                <div class="layui-input-block" id="chooseBox" style="width: 360px; border: 1px solid #e6e6e6; padding: 10px 0 10px 10px;max-height: 230px;overflow-y: scroll">
                                    <input type="checkbox" name="" value="全部" title="全部" checked>
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">商品类型：</label>
                                <div class="layui-input-block" style="width: 160px;">
                                    <select name="" lay-verify="required" lay-filter="chooseTypeModel">
                                        <option value="键盘">键盘</option>
                                        <option value="配件">配件</option>
                                        <option value="全部">全部</option>
                                    </select>   
                                </div>
                            </div>
                            <hr class="layui-border-black">
                            <div class="layui-form-item">
                                <label class="layui-form-label">分组依据：</label>
                                <div class="layui-input-block" style="width: 160px;">
                                    <select id="groupingGist" name="" lay-verify="required">
                                        <option value="d">日</option>
                                        <option value="w">周</option>
                                        <option value="m">月</option>
                                        <option value="q">季度</option>
                                        <option value="y">年</option>
                                    </select>   
                                </div>
                            </div>
                            <hr class="layui-border-black">
                        </form>
                        <button type="button" id="statistics" class="layui-btn layui-btn-normal" style=";margin-left: 30px; width: 110px;">统&nbsp;&nbsp;计</button>
                        <hr class="layui-border-black">
                        <div style="padding:10px 10px">
            				<div class="layui-card">
            					<div class="layui-card-body">
            						<div id="main2" style="width: 100%; height:650px; text-align: center;"></div>
            						<div id="main3" style="width: 100%; height:780px; text-align: center;"></div>
                                    <button type="button" id="addComparisonArea" class="layui-btn layui-btn-normal" style="display: none;">加入对比区</button>
            					</div>
            				</div>
            			</div>
                    </div>
                    <div class="layui-col-xs12 layui-col-sm6 layui-col-md6 layui-col-sm-offset1 layui-col-md-offset1">
                        <p style="font-size: 23px; font-weight: bolder; line-height: 40px; padding-left: 20px;">对比区</p>
                        <hr class="layui-border-black">
                        <div style="padding:10px 10px">
            				<div class="layui-card">
            					<div id="createMain" class="layui-card-body">
            					</div>
            				</div>
            			</div>
                    </div>
                </div>
        </div>
        <script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
        <script>
            layui.use(['layer', 'form'], function(){
                var layer = layui.layer
                ,form = layui.form;
              
                layer.msg('Hello World');
            });
        </script> 
    </body>
</html>