//==CONTROLLER===============
//--User---------------------
//--Login--
$(document).on("click","#btnLogin",function()
{
	var result=isValidFormLogin();
	if(result=="true")
		{	$("#formLogin").submit();	}
	else
		{	$("#divStsMsgLogin").html(result)}
});

//==CLIENT-MODEL==================
//--User--------------------------
function isValidFormLogin()
{
	if($.trim($("#txtUserName").val())=="")
		{	return "Enter Username";	}
	if($.trim($("#txtPassword").val())=="")
		{	return "Enter Password";	}

	return "true";
}

//--items---------f
//--Save/Update----------
$(document).on("click","#btnSave",function()
{
	var result = isValidFormCategory();
	if(result=="true")
		{	$("#formCategories").submit();	}
	else
		{	$("#divStsMsgCategory").html(result);	}
});

//--Edit--
$(document).on("click","#btnEdit",function()
{	
	$("#hidMode").val("update");
	$("#hidID").val($(this).attr("param"));
	$("#txtCategoryName").val($(this).closest("tr").find('td:eq(1)').text());
	$("#txtCategoryDesc").val($(this).closest("tr").find('td:eq(2)').text());
}
);

//--Remove--
$(document).on("click","#btnRemove",function()
		{	
			$("#hidMode").val("remove");
			$("#hidID").val($(this).attr("param"));
			var res =confirm("Are you sure?");
				if(res==true){
					$("#formCategories").submit();
				}
		});
				}