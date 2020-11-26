<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="UTF-8">

	<link href="/crm/jquery/bootstrap_3.3.0/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
	<link href="/crm/jquery/bootstrap-datetimepicker-master/css/bootstrap-datetimepicker.min.css" type="text/css" rel="stylesheet" />

	<script type="text/javascript" src="/crm/jquery/jquery-1.11.1-min.js"></script>
	<script type="text/javascript" src="/crm/jquery/bootstrap_3.3.0/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/crm/jquery/bootstrap-datetimepicker-master/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript" src="/crm/jquery/bootstrap-datetimepicker-master/locale/bootstrap-datetimepicker.zh-CN.js"></script>

	<%--导入分页插件--%>
	<link href="/crm/jquery/bs_pagination/jquery.bs_pagination.min.css" type="text/css" rel="stylesheet" />
	<script type="text/javascript" src="/crm/jquery/bs_pagination/en.js"></script>
	<script type="text/javascript" src="/crm/jquery/bs_pagination/jquery.bs_pagination.min.js"></script>


	<script type="text/javascript">

		$(function(){



		});

	</script>
</head>
<body>

<!-- 创建线索的模态窗口 -->
<div class="modal fade" id="createClueModal" role="dialog">
	<div class="modal-dialog" role="document" style="width: 90%;">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">×</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">创建线索</h4>
			</div>
			<div class="modal-body">
				<form class="form-horizontal" id="saveClueForm" role="form">

					<div class="form-group">
						<label for="create-clueOwner" class="col-sm-2 control-label">所有者<span style="font-size: 15px; color: red;">*</span></label>
						<div class="col-sm-10" style="width: 300px;">
							<select class="form-control" name="owner" id="create-clueOwner">

							</select>
						</div>
						<label for="create-company" class="col-sm-2 control-label">公司<span style="font-size: 15px; color: red;">*</span></label>
						<div class="col-sm-10" style="width: 300px;">
							<input type="text" class="form-control" name="company" id="create-company">
						</div>
					</div>

					<div class="form-group">
						<label for="create-call" class="col-sm-2 control-label">称呼</label>
						<div class="col-sm-10" style="width: 300px;">
							<select class="form-control" name="appellation" id="create-call">

							</select>
						</div>
						<label for="create-surname" class="col-sm-2 control-label">姓名<span style="font-size: 15px; color: red;">*</span></label>
						<div class="col-sm-10" style="width: 300px;">
							<input type="text" class="form-control" name="fullname" id="create-surname">
						</div>
					</div>

					<div class="form-group">
						<label for="create-job" class="col-sm-2 control-label">职位</label>
						<div class="col-sm-10" style="width: 300px;">
							<input type="text" class="form-control" name="job" id="create-job">
						</div>
						<label for="create-email" class="col-sm-2 control-label">邮箱</label>
						<div class="col-sm-10" style="width: 300px;">
							<input type="text" class="form-control" name="email" id="create-email">
						</div>
					</div>

					<div class="form-group">
						<label for="create-phone" class="col-sm-2 control-label">公司座机</label>
						<div class="col-sm-10" style="width: 300px;">
							<input type="text" class="form-control" name="phone" id="create-phone">
						</div>
						<label for="create-website" class="col-sm-2 control-label">公司网站</label>
						<div class="col-sm-10" style="width: 300px;">
							<input type="text" class="form-control" name="website" id="create-website">
						</div>
					</div>

					<div class="form-group">
						<label for="create-mphone" class="col-sm-2 control-label">手机</label>
						<div class="col-sm-10" style="width: 300px;">
							<input type="text" class="form-control" name="mphone" id="create-mphone">
						</div>
						<label for="create-status" class="col-sm-2 control-label">线索状态</label>
						<div class="col-sm-10" style="width: 300px;">
							<select class="form-control" name="state" id="create-status">
							</select>
						</div>
					</div>

					<div class="form-group">
						<label for="create-source" class="col-sm-2 control-label">线索来源</label>
						<div class="col-sm-10" style="width: 300px;">
							<select class="form-control" name="source" id="create-source">

							</select>
						</div>
					</div>


					<div class="form-group">
						<label for="create-describe" class="col-sm-2 control-label">线索描述</label>
						<div class="col-sm-10" style="width: 81%;">
							<textarea class="form-control" rows="3" name="description" id="create-describe"></textarea>
						</div>
					</div>

					<div style="height: 1px; width: 103%; background-color: #D5D5D5; left: -13px; position: relative;"></div>

					<div style="position: relative;top: 15px;">
						<div class="form-group">
							<label for="create-contactSummary" class="col-sm-2 control-label">联系纪要</label>
							<div class="col-sm-10" style="width: 81%;">
								<textarea class="form-control" rows="3" name="contactSummary" id="create-contactSummary"></textarea>
							</div>
						</div>
						<div class="form-group">
							<label for="create-nextContactTime" class="col-sm-2 control-label">下次联系时间</label>
							<div class="col-sm-10" style="width: 300px;">
								<input type="text" class="form-control" name="nextContactTime" id="create-nextContactTime">
							</div>
						</div>
					</div>

					<div style="height: 1px; width: 103%; background-color: #D5D5D5; left: -13px; position: relative; top : 10px;"></div>

					<div style="position: relative;top: 20px;">
						<div class="form-group">
							<label for="create-address" class="col-sm-2 control-label">详细地址</label>
							<div class="col-sm-10" style="width: 81%;">
								<textarea class="form-control" rows="1" name="address" id="create-address"></textarea>
							</div>
						</div>
					</div>
				</form>

			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary" id="saveClueBtn">保存</button>
			</div>
		</div>
	</div>
</div>

<!-- 修改线索的模态窗口 -->
<div class="modal fade" id="editClueModal" role="dialog">
	<div class="modal-dialog" role="document" style="width: 90%;">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">×</span>
				</button>
				<h4 class="modal-title">修改线索</h4>
			</div>
			<div class="modal-body">
				<form class="form-horizontal" role="form">
                    <input type="hidden" id="clueId"/>
					<div class="form-group">
						<label for="edit-clueOwner" class="col-sm-2 control-label">所有者<span style="font-size: 15px; color: red;">*</span></label>
						<div class="col-sm-10" style="width: 300px;">
							<select class="form-control" id="edit-clueOwner">

							</select>
						</div>
						<label for="edit-company" class="col-sm-2 control-label">公司<span style="font-size: 15px; color: red;">*</span></label>
						<div class="col-sm-10" style="width: 300px;">
							<input type="text" class="form-control" id="edit-company" >
						</div>
					</div>

					<div class="form-group">
						<label for="edit-call" class="col-sm-2 control-label">称呼</label>
						<div class="col-sm-10" style="width: 300px;">
							<select class="form-control" id="edit-call">

							</select>
						</div>
						<label for="edit-surname" class="col-sm-2 control-label">姓名<span style="font-size: 15px; color: red;">*</span></label>
						<div class="col-sm-10" style="width: 300px;">
							<input type="text" class="form-control" id="edit-surname">
						</div>
					</div>

					<div class="form-group">
						<label for="edit-job" class="col-sm-2 control-label">职位</label>
						<div class="col-sm-10" style="width: 300px;">
							<input type="text" class="form-control" id="edit-job">
						</div>
						<label for="edit-email" class="col-sm-2 control-label">邮箱</label>
						<div class="col-sm-10" style="width: 300px;">
							<input type="text" class="form-control" id="edit-email">
						</div>
					</div>

					<div class="form-group">
						<label for="edit-phone" class="col-sm-2 control-label">公司座机</label>
						<div class="col-sm-10" style="width: 300px;">
							<input type="text" class="form-control" id="edit-phone" >
						</div>
						<label for="edit-website" class="col-sm-2 control-label">公司网站</label>
						<div class="col-sm-10" style="width: 300px;">
							<input type="text" class="form-control" id="edit-website">
						</div>
					</div>

					<div class="form-group">
						<label for="edit-mphone" class="col-sm-2 control-label">手机</label>
						<div class="col-sm-10" style="width: 300px;">
							<input type="text" class="form-control" id="edit-mphone" >
						</div>
						<label for="edit-status" class="col-sm-2 control-label">线索状态</label>
						<div class="col-sm-10" style="width: 300px;">
							<select class="form-control" id="edit-status">

							</select>
						</div>
					</div>

					<div class="form-group">
						<label for="edit-source" class="col-sm-2 control-label">线索来源</label>
						<div class="col-sm-10" style="width: 300px;">
							<select class="form-control" id="edit-source">

							</select>
						</div>
					</div>

					<div class="form-group">
						<label for="edit-describe" class="col-sm-2 control-label">描述</label>
						<div class="col-sm-10" style="width: 81%;">
							<textarea class="form-control" rows="3" id="edit-describe"></textarea>
						</div>
					</div>

					<div style="height: 1px; width: 103%; background-color: #D5D5D5; left: -13px; position: relative;"></div>

					<div style="position: relative;top: 15px;">
						<div class="form-group">
							<label for="edit-contactSummary" class="col-sm-2 control-label">联系纪要</label>
							<div class="col-sm-10" style="width: 81%;">
								<textarea class="form-control" rows="3" id="edit-contactSummary"></textarea>
							</div>
						</div>
						<div class="form-group">
							<label for="edit-nextContactTime" class="col-sm-2 control-label"></label>
							<div class="col-sm-10" style="width: 300px;">
								<input type="text" class="form-control" id="edit-nextContactTime" >
							</div>
						</div>
					</div>

					<div style="height: 1px; width: 103%; background-color: #D5D5D5; left: -13px; position: relative; top : 10px;"></div>

					<div style="position: relative;top: 20px;">
						<div class="form-group">
							<label for="edit-address" class="col-sm-2 control-label">详细地址</label>
							<div class="col-sm-10" style="width: 81%;">
								<textarea class="form-control" rows="1" id="edit-address"></textarea>
							</div>
						</div>
					</div>
				</form>

			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary" id="updateActivity-btn">更新</button>
			</div>
		</div>
	</div>
</div>




<div>
	<div style="position: relative; left: 10px; top: -10px;">
		<div class="page-header">
			<h3>线索列表</h3>
		</div>
	</div>
</div>

<div style="position: relative; top: -20px; left: 0px; width: 100%; height: 100%;">

	<div style="width: 100%; position: absolute;top: 5px; left: 10px;">

		<div class="btn-toolbar" role="toolbar" style="height: 80px;">
			<form class="form-inline" role="form" style="position: relative;top: 8%; left: 5px;">

				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">名称</div>
						<input class="form-control" type="text" id="fullname">
					</div>
				</div>

				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">公司</div>
						<input class="form-control" type="text" id="company">
					</div>
				</div>

				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">公司座机</div>
						<input class="form-control" type="text" id="phone">
					</div>
				</div>

				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">线索来源</div>
						<select class="form-control" id="source">
							<option></option>
							<option>广告</option>
							<option>推销电话</option>
							<option>员工介绍</option>
							<option>外部介绍</option>
							<option>在线商场</option>
							<option>合作伙伴</option>
							<option>公开媒介</option>
							<option>销售邮件</option>
							<option>合作伙伴研讨会</option>
							<option>内部研讨会</option>
							<option>交易会</option>
							<option>web下载</option>
							<option>web调研</option>
							<option>聊天</option>
						</select>
					</div>
				</div>

				<br>

				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">所有者</div>
						<input class="form-control" type="text" id="owner">
					</div>
				</div>



				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">手机</div>
						<input class="form-control" type="text" id="mphone">
					</div>
				</div>

				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">线索状态</div>
						<select class="form-control">
							<option></option>
							<option>试图联系</option>
							<option>将来联系</option>
							<option>已联系</option>
							<option>虚假线索</option>
							<option>丢失线索</option>
							<option>未联系</option>
							<option>需要条件</option>
						</select>
					</div>
				</div>

				<button type="submit" class="btn btn-default">查询</button>

			</form>
		</div>
		<div class="btn-toolbar" role="toolbar" style="background-color: #F7F7F7; height: 50px; position: relative;top: 40px;">
			<div class="btn-group" style="position: relative; top: 18%;">
				<button type="button" id="createClueBtn" class="btn btn-primary" data-toggle="modal" data-target="#createClueModal"><span class="glyphicon glyphicon-plus"></span> 创建</button>
				<button id="updateActivityBtn" type="button" class="btn btn-default" data-toggle="modal" ><span class="glyphicon glyphicon-pencil"></span> 修改</button>
				<button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-minus"></span> 删除</button>
			</div>


		</div>
		<div style="position: relative;top: 50px;">
			<table class="table table-hover">
				<thead>
				<tr style="color: #B3B3B3;">
					<td><input type="checkbox" /></td>
					<td>名称</td>
					<td>公司</td>
					<td>公司座机</td>
					<td>手机</td>
					<td>线索来源</td>
					<td>所有者</td>
					<td>线索状态</td>
				</tr>
				</thead>
				<tbody id="activityBody">

				</tbody>
			</table>
		</div>

		<%--分页插件--%>
		<div style="height: 50px; position: relative;top: 40px;">
			<div  id="activityPage">

			</div>
		</div>


	</div>

</div>
</body>
</html>
<script>
	$('#createClueBtn').click(function () {
		//异步查询所有者信息
		//打开新建市场活动模态窗查询所有用户
		$.ajax({
			url : '/crm/workbench/activity/queryAllUsers',
			type : 'get',
			dataType : 'json',
			success : function(data){
				for(var i = 0 ; i < data.length;i++){
					$('#create-clueOwner')
							.append("<option value="+data[i].id+">"+data[i].name+"</option>");
				}
			}
		});
		//异步查询字典数据
		$.ajax({
			url : '/crm/dictionaryCache',
			type : 'get',
			dataType : 'json',
			success : function(data){
				//先遍历所有的字典类型
				for(var i = 0 ; i < data.length; i++){
					var dictionaryList = data[i].dictionaryValues;
					for(var j = 0; j < dictionaryList.length; j++){
						var dictionaryValue = dictionaryList[j];
						if("appellation" == data[i].code){
							$('#create-call')
									.append("<option value="+dictionaryValue.value+">"+dictionaryValue.text+"</option>");
						}
						if("clueState" == data[i].code){
							$('#create-status')
									.append("<option value="+dictionaryValue.value+">"+dictionaryValue.text+"</option>");
						}
						if("source" == data[i].code){
							$('#create-source')
									.append("<option value="+dictionaryValue.value+">"+dictionaryValue.text+"</option>");
						}
					}
				}
			}

		});

	});

	//创建线索模态窗口日历插件
	$("#create-nextContactTime").datetimepicker({
		language:  "zh-CN",
		format: "yyyy-mm-dd",//显示格式
		minView: "month",//设置只显示到月份
		initialDate: new Date(),//初始化当前日期
		autoclose: true,//选中自动关闭
		todayBtn: true, //显示今日按钮
		clearBtn : true,
		pickerPosition: "bottom-left"
	});
	//点击线索创建模态窗口的保存按钮异步提交线索数据进行保存 &..&..
	//{"":"","":",}
	$('#saveClueBtn').click(function () {
		var saveClueForm = $('#saveClueForm').serialize();
		$.ajax({
			url : '/crm/workbench/clue/saveClue',
			data : saveClueForm,
			type : 'post',
			dataType : 'json',
			success : function(data){
				alert(data.mess);
				//关闭模态窗
				$('#createClueModal').modal('hide');
			}
		});
	});



	//点击查询按钮查询数据
	function queryActivity(){
		pageList(1,2);
	}

	/*参数一:当前页码
	参数二:每页记录数
	* */
	pageList(1,2);
	//跳转到活动列表首页的时候,向后台发送查询所有市场活动信息列表的异步请求
	//刷新页面的方法
	function pageList(page,pageSize) {
		$.ajax({
			url : '/crm/workbench/clue/queryAllClue',
			data : {'page':page,
				'pageSize':pageSize,
				'fullname':$('#fullname').val(),
				'company':$('#company').val(),
				'phone':$('#phone').val(),
				'mphone':$('#mphone').val(),
				'source' : $('#source').val(),
				'owner' : $('#owner').val(),
				'state' : $('#state').val()
			},
			type : 'get',
			dataType : 'json',
			success : function(data){
				//清空上一页拼接的数据
				$('#activityBody').html("");
				//后台传递的每页的总数据
				var dataList = data.dataList;
				for (var i=0;i<dataList.length;i++){
					//list是每页遍历的数据
					var list = dataList[i];
					$('#activityBody').append("<tr>\n" +
							"\t\t\t\t\t<td><input type=\"checkbox\" class='son' value="+list.id+" /></td>\n" +
							"\t\t\t\t\t<td><a style=\"text-decoration: none; cursor: pointer;\" href=/crm/workbench/clue/queryClueDetailById?id="+list.id+">"+list.fullname+"</a></td>\n" +
							"\t\t\t\t\t<td>"+list.company+"</td>\n" +
							"\t\t\t\t\t<td>"+list.phone+"</td>\n" +
							"\t\t\t\t\t<td>"+list.mphone+"</td>\n" +
							"\t\t\t\t\t<td>"+list.source+"</td>\n" +
							"\t\t\t\t\t<td>"+list.owner+"</td>\n" +
							"\t\t\t\t\t<td>"+list.state+"</td>\n" +
							"\t\t\t\t</tr>");
				}

				//利用分页插件查询第一页数据
				$("#activityPage").bs_pagination({
					currentPage: data.page, // 页码
					rowsPerPage: data.pageSize, // 每页显示的记录条数
					maxRowsPerPage: 20, // 每页最多显示的记录条数
					totalPages: data.pages, // 总页数
					totalRows: data.total, // 总记录条数
					visiblePageLinks: 3, // 显示几个卡片
					showGoToPage: true,
					showRowsPerPage: true,
					showRowsInfo: true,
					showRowsDefaultInfo: true,
					//回调函数，用户每次点击分页插件进行翻页的时候就会触发该函数
					onChangePage : function(event, obj){
						//刷新页面，obj.currentPage:当前点击的页码
						pageList(obj.currentPage,obj.rowsPerPage);
					}
				});
			}
		});
	}






	//点击修改按钮弹出模态窗
	$('#updateActivityBtn').click(function () {
		//获取勾中的son的个数
		if ($('.son:checked').length ==0){
			alert("至少勾中一条记录");
			return;
		}else if ($('.son:checked').length>1){
			alert("只能勾中一条记录");
			return;
		}else{
			//手动显示模态窗
			$('#editClueModal').modal('show');
			//异步查询所有者信息
			$.ajax({
				url : '/crm/workbench/clue/queryAllUsers',
				type : 'get',
				dataType : 'json',
				success : function(data){
					//清空上一页拼接的数据
					$('#edit-clueOwner').html("");
					for (var i=0;i < data.length;i++){
						$('#edit-clueOwner')
								.append("<option value="+data[i].id+">"+data[i].name+"</option>");
					}
				}
			});

			//向后台传递主键,查询该条市场活动信息
			$.ajax({
				url : '/crm/workbench/clue/queryClueById',
				type : 'get',
				data : {'id':$('.son:checked').val()},
				dataType : 'json',
				success : function(data){
					//隐藏域
					$('#clueId').val(data.id);
					$('#edit-clueOwner').html("");
					for (var i=0;i < data.length;i++){
						$('#edit-clueOwner')
								.append("<option value="+data[i].id+">"+data[i].name+"</option>");
					}

					$('#edit-clueOwner').val(data.owner);
					$('#edit-company').val(data.company);

					$('#edit-call').html("");
					for (var i=0;i < data.length;i++){
						$('#edit-call')
								.append("<option value="+data[i].id+">"+data[i].appellation+"</option>");
					}


					$('#edit-surname').val(data.fullname);
					$('#edit-job').val(data.job);
					$('#edit-email').val(data.email);
					$('#edit-phone').val(data.phone);
					$('#edit-website').val(data.website);
					$('#edit-mphone').val(data.mphone);



					$('#edit-status').html("");
					for (var i=0;i < data.length;i++){
						$('#edit-status')
								.append("<option value="+data[i].id+">"+data[i].status+"</option>");
					}


					$('#edit-source').html("");
					for (var i=0;i < data.length;i++){
						$('#edit-source')
								.append("<option value="+data[i].id+">"+data[i].source+"</option>");
					}



					$('#edit-describe').val(data.description);
					$('#edit-contactSummary').val(data.contactSummary);
					$('#edit-nextContactTime').val(data.nextContactTime);
					$('#edit-address').val(data.address);
				}
			});

		}

	});
	//点击修改模态窗口更新按钮，异步提交表单
	$('#updateActivity-btn').click(function () {

		$.ajax({
			url : '/crm/workbench/clue/updateClue',
			data : {
				'id' : $('#clueId').val(),
				'owner' : $('#edit-clueOwner').val(),
				'company' :$('#edit-company').val(),
				'call' :$('edit-call').val(),

				'fullname' : $('#edit-surname').val(),
				'job':$('#edit-job').val(),
				'email':$('#edit-email').val(),
				'phone':$('#edit-phone').val(),
				'website':$('#edit-website').val(),
				'mphone':$('#edit-mphone').val(),
				'status':$('#edit-status').val(),
				'source':$('#edit-source').val(),
				'describe':$('#edit-describe').val(),
				'contactSummary':$('#edit-contactSummary').val(),
				'nextContactTime':$('#edit-nextContactTime').val(),
				'address':$('#edit-address').val(),



			},
			type : 'post',
			dataType : 'json',
			success : function(data){
				alert(data.mess);
				//刷新页面
				pageList(1,2);
				//关闭模态窗口	easyui
				$('#editClueModal').modal('hide');
			}
		});
	});


</script>