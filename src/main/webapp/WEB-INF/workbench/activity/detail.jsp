<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta charset="UTF-8">

	<link href="/crm/jquery/bootstrap_3.3.0/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
	<script type="text/javascript" src="/crm/jquery/jquery-1.11.1-min.js"></script>
	<script type="text/javascript" src="/crm/jquery/bootstrap_3.3.0/js/bootstrap.min.js"></script>
<script type="text/javascript">

	//默认情况下取消和保存按钮是隐藏的
	var cancelAndSaveBtnDefault = true;
	
	$(function(){
		$("#remark").focus(function(){
			if(cancelAndSaveBtnDefault){
				//设置remarkDiv的高度为130px
				$("#remarkDiv").css("height","130px");
				//显示
				$("#cancelAndSaveBtn").show("2000");
				cancelAndSaveBtnDefault = false;
			}
		});
		
		$("#cancelBtn").click(function(){
			//显示
			$("#cancelAndSaveBtn").hide();
			//设置remarkDiv的高度为130px
			$("#remarkDiv").css("height","90px");
			cancelAndSaveBtnDefault = true;
		});
		
		$(".remarkDiv").mouseover(function(){
			$(this).children("div").children("div").show();
		});
		
		$(".remarkDiv").mouseout(function(){
			$(this).children("div").children("div").hide();
		});
		
		$(".myHref").mouseover(function(){
			$(this).children("span").css("color","blue");
		});
		
		$(".myHref").mouseout(function(){
			$(this).children("span").css("color","#E6E6E6");
		});
	});
	
</script>

</head>
<body>


    <!-- 修改市场活动的模态窗口 -->
    <div class="modal fade" id="editActivityModal" role="dialog">
        <div class="modal-dialog" role="document" style="width: 85%;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">
                        <span aria-hidden="true">×</span>
                    </button>
                    <h4 class="modal-title" id="myModalLabel">修改市场活动</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" role="form">

                        <div class="form-group">
                            <label for="edit-marketActivityOwner" class="col-sm-2 control-label">所有者<span style="font-size: 15px; color: red;">*</span></label>
                            <div class="col-sm-10" style="width: 300px;">
                                <select class="form-control" id="edit-marketActivityOwner">

                                </select>
                            </div>
                            <label for="edit-marketActivityName" class="col-sm-2 control-label">名称<span style="font-size: 15px; color: red;">*</span></label>
                            <div class="col-sm-10" style="width: 300px;">
                                <input type="text" class="form-control" id="edit-marketActivityName" value="${activity.name}">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="edit-startTime" class="col-sm-2 control-label">开始日期</label>
                            <div class="col-sm-10" style="width: 300px;">
                                <input type="text" class="form-control" id="edit-startTime" value="${activity.startDate}">
                            </div>
                            <label for="edit-endTime" class="col-sm-2 control-label">结束日期</label>
                            <div class="col-sm-10" style="width: 300px;">
                                <input type="text" class="form-control" id="edit-endTime" value="${activity.endDate}">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="edit-cost" class="col-sm-2 control-label">成本</label>
                            <div class="col-sm-10" style="width: 300px;">
                                <input type="text" class="form-control" id="edit-cost" value="${activity.cost}">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="edit-describe" class="col-sm-2 control-label">描述</label>
                            <div class="col-sm-10" style="width: 81%;">
                                <textarea class="form-control" rows="3" id="edit-describe">${activity.description}</textarea>
                            </div>
                        </div>

                    </form>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" data-dismiss="modal">更新</button>
                </div>
            </div>
        </div>
    </div>

	<!-- 返回按钮 -->
	<div style="position: relative; top: 35px; left: 10px;">
		<a href="javascript:void(0);" onclick="window.history.back();"><span class="glyphicon glyphicon-arrow-left" style="font-size: 20px; color: #DDDDDD"></span></a>
	</div>
	
	<!-- 大标题 -->
	<div style="position: relative; left: 40px; top: -30px;">
		<div class="page-header">
			<h3>市场活动- ${activity.name}<small>${activity.startDate} ~ ${activity.endDate}</small></h3>
		</div>
		<div style="position: relative; height: 50px; width: 250px;  top: -72px; left: 700px;">
			<button id="updateActivityBtn"  type="button" class="btn btn-default" data-toggle="modal"><span class="glyphicon glyphicon-edit"></span> 编辑</button>
			<button type="button" id="deleteActivityBtn" class="btn btn-danger"><span class="glyphicon glyphicon-minus"></span> 删除</button>
		</div>
	</div>
	
	<!-- 详细信息 -->
	<div style="position: relative; top: -70px;">
		<div style="position: relative; left: 40px; height: 30px;">
			<div style="width: 300px; color: gray;">所有者</div>
			<div style="width: 300px;position: relative; left: 200px; top: -20px;"><b>${activity.owner}</b></div>
			<div style="width: 300px;position: relative; left: 450px; top: -40px; color: gray;">名称</div>
			<div style="width: 300px;position: relative; left: 650px; top: -60px;"><b>${activity.name}</b></div>
			<div style="height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px;"></div>
			<div style="height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px; left: 450px;"></div>
		</div>

		<div style="position: relative; left: 40px; height: 30px; top: 10px;">
			<div style="width: 300px; color: gray;">开始日期</div>
			<div style="width: 300px;position: relative; left: 200px; top: -20px;"><b>${activity.startDate}</b></div>
			<div style="width: 300px;position: relative; left: 450px; top: -40px; color: gray;">结束日期</div>
			<div style="width: 300px;position: relative; left: 650px; top: -60px;"><b>${activity.endDate}</b></div>
			<div style="height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px;"></div>
			<div style="height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px; left: 450px;"></div>
		</div>
		<div style="position: relative; left: 40px; height: 30px; top: 20px;">
			<div style="width: 300px; color: gray;">成本</div>
			<div style="width: 300px;position: relative; left: 200px; top: -20px;"><b>${activity.cost}</b></div>
			<div style="height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -20px;"></div>
		</div>
		<div style="position: relative; left: 40px; height: 30px; top: 30px;">
			<div style="width: 300px; color: gray;">创建者</div>
			<div style="width: 500px;position: relative; left: 200px; top: -20px;"><b>${activity.createBy}&nbsp;&nbsp;</b><small style="font-size: 10px; color: gray;">${activity.createTime}</small></div>
			<div style="height: 1px; width: 550px; background: #D5D5D5; position: relative; top: -20px;"></div>
		</div>
		<div style="position: relative; left: 40px; height: 30px; top: 40px;">
			<div style="width: 300px; color: gray;">修改者</div>
			<div style="width: 500px;position: relative; left: 200px; top: -20px;"><b>${activity.editBy}&nbsp;&nbsp;</b><small style="font-size: 10px; color: gray;">${activity.editTime}</small></div>
			<div style="height: 1px; width: 550px; background: #D5D5D5; position: relative; top: -20px;"></div>
		</div>
		<div style="position: relative; left: 40px; height: 30px; top: 50px;">
			<div style="width: 300px; color: gray;">描述</div>
			<div style="width: 630px;position: relative; left: 200px; top: -20px;">
				<b>
					${activity.description}
				</b>
			</div>
			<div style="height: 1px; width: 850px; background: #D5D5D5; position: relative; top: -20px;"></div>
		</div>
	</div>

	<!-- 备注 -->
	<div style="position: relative; top: 30px; left: 40px;" id="activityRemarkDiv">
		<div class="page-header">
			<h4>备注</h4>
		</div>

		<div id="abc">
			<!-- 备注1 -->
			<c:forEach items="${activity.activityRemarks}" var="activityRemark">
				<div class="remarkDiv" id="deleteRemarkDiv${activityRemark.id}" style="height: 60px;">
					<img title="zhangsan" src="../../image/user-thumbnail.png" style="width: 30px; height:30px;">
					<div style="position: relative; top: -40px; left: 40px;" >
						<h5 id="activityH5${activityRemark.id}">${activityRemark.noteContent}</h5>
						<font color="gray">市场活动</font> <font color="gray">-</font> <b>${activity.name}</b> <small style="color: gray;"><span id="activitySpanTime${activityRemark.id}"> ${activityRemark.createTime}</span> 由${activityRemark.createBy}</small>
						<div style="position: relative; left: 500px; top: -30px; height: 30px; width: 100px; display: none;">
							<a class="myHref" id="editActivityRemark${activityRemark.id}" href="javascript:void(0)"><span class="glyphicon glyphicon-edit" style="font-size: 20px; color: #E6E6E6;"></span></a>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<a class="myHref" id="deleteActivityRemark${activityRemark.id}" href="javascript:void(0);"><span class="glyphicon glyphicon-remove" style="font-size: 20px; color: #E6E6E6;"></span></a>
						</div>
					</div>
				</div>


				<!-- 修改市场活动备注的模态窗口 -->
				<div class="modal fade" id="editRemarkModal${activityRemark.id}" role="dialog">
						<%-- 备注的id --%>
					<input type="hidden" id="remarkId${activityRemark.id}">
					<div class="modal-dialog" role="document" style="width: 40%;">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">
									<span aria-hidden="true">×</span>
								</button>
								<h4 class="modal-title" id="myModalLabel1">修改备注</h4>
							</div>
							<div class="modal-body">
								<form class="form-horizontal" role="form">
									<div class="form-group">
										<label for="edit-describe" class="col-sm-2 control-label">内容</label>
										<div class="col-sm-10" style="width: 81%;">
											<textarea class="form-control" rows="3" id="noteContent${activityRemark.id}"></textarea>
										</div>
									</div>
								</form>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
								<button type="button" class="btn btn-primary" id="updateRemarkBtn${activityRemark.id}">更新</button>
							</div>
						</div>
					</div>
				</div>


				<script>
					//文档加载完毕
					$(function () {

						//点击不同修改按钮,修改对应的市场活动备注
						$('#editActivityRemark${activityRemark.id}').click(function () {
							$('#editRemarkModal${activityRemark.id}').modal('show');
							//将对应的备注显示到模态窗口中
							$('#noteContent${activityRemark.id}').val($('#activityH5${activityRemark.id}').html());
							//把隐藏域的内容改成当前备注的主键
							$('#remarkId${activityRemark.id}').val('${activityRemark.id}');
						});

						//点击更新按钮,异步更改备注内容
						$('#updateRemarkBtn${activityRemark.id}').click(function () {
							//获取每个模态窗对应隐藏域的备注的id号的值
							var remarkId = $('#remarkId${activityRemark.id}').val();

							//发送异步请求更新备注信息,
							$.ajax({
								url : '/crm/workbench/activity/updateActivityRemark',
								data : {
									'id': remarkId,
									'noteContent' :$('#noteContent${activityRemark.id}').val()
								},
								type : 'get',
								dataType : 'json',
								success : function(data){
									if (data.success){
										alert(data.mess);
										//关闭对应的模态窗口
										$('#editRemarkModal${activityRemark.id}').modal('hide');
										//先修改成功,再修改页面
										// 获取最新数据(刷新页面,不走后台,将模态窗中的输入的最新数据给填充到被修改的备注中)
										var noteContent = $('#noteContent${activityRemark.id}').val();
										$('#activityH5${activityRemark.id}').html(noteContent);

									}

								}
							});
						});

						//点击删除按钮,删除备注
						$('#deleteActivityRemark${activityRemark.id}').click(function () {
							//把隐藏域的内容改成当前备注的主键
							$('#remarkId${activityRemark.id}').val('${activityRemark.id}');
							//获取每个模态窗对应隐藏域的备注的id号的值
							var remarkId = $('#remarkId${activityRemark.id}').val();
							//发送异步请求删除备注信息
							$.ajax({
								url : '/crm/workbench/activity/deleteActivityRemark',
								data : {
									'id': remarkId
								},
								type : 'get',
								dataType : 'json',
								success : function(data){
									if (data.success){
										alert(data.mess);
										//删除页面元素
										$('#deleteRemarkDiv${activityRemark.id}').remove();
									}

								}
							});

						});
					});

				</script>
			</c:forEach>
		</div>

		
		<div id="remarkDiv" style="background-color: #E6E6E6; width: 870px; height: 90px;">
			<form role="form" style="position: relative;top: 10px; left: 10px;">
				<textarea id="remark" class="form-control" style="width: 850px; resize : none;" rows="2"  placeholder="添加备注..."></textarea>
				<p id="cancelAndSaveBtn" style="position: relative;left: 737px; top: 10px; display: none;">
					<button id="cancelBtn" type="button" class="btn btn-default">取消</button>
					<button type="button" id="saveRemarkBtn" class="btn btn-primary">保存</button>
				</p>
			</form>
		</div>
	</div>
	<div style="height: 200px;"></div>
</body>
</html>

<script>
	$('#updateActivityBtn').click(function () {
			//手动显示模态窗
			$('#editActivityModal').modal('show');
			//异步查询所有者信息
			$.ajax({
				url : '/crm/workbench/activity/queryAllUsers',
				type : 'get',
				dataType : 'json',
				success : function(data){
					//清空上一页拼接的数据
					$('#edit-marketActivityOwner').html("");
					for (var i=0;i < data.length;i++){
						$('#edit-marketActivityOwner')
								.append("<option value="+data[i].id+">"+data[i].name+"</option>");
					}
				}
			});


	});


	//添加备注
	$('#saveRemarkBtn').click(function () {
		//获取用户输入的备注内容，向后台发送异步请求
		$.ajax({
			url : '/crm/workbench/activity/saveActivityRemark',
			data : {
				'noteContent' : $('#remark').val(),
				'activityId' : '${activity.id}'
			},
			type : 'post',
			dataType : 'json',
			success : function(data){
				//添加成功
				if(data.success){
					//弹窗提示
					alert(data.mess);
					//将页面的内容修改
					location.href = "/crm/workbench/activity/queryActivityDetailById?id=${activity.id}";
				}
			}
		});
	});


	//点击删除按钮,删除信息
	$('#deleteActivityBtn').click(function () {
		var isDelete = confirm("确认删除当前备注?");
		if (isDelete){
			//删除按钮就在市场活动详情页,如果使用ajax删除之后会返回当前页面,当前页面的数据被删除了
			//会导致删除成功后回到本页面会没有数据量
			//采用传统请求  除了ajax之外都是传统请求
			location.href = '/crm/workbench/activity/deleteActivityByDetail?id=${activity.id}';
		}
	});


</script>