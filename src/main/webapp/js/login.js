$(function () {
    $("#userName").on("blur",function () {
        valUserName();
    });
    $("#passWord").on("blur",function () {
        valPassWord();
    });
    $("#LoginForm").on("blur",function () {
        return valPassWord()&&valUserName();
    });

});

function valUserName() {
    isNull('userName');
}
function valPassWord() {
    isNull('passWord');
}
function isNull(value) {
    if($('#'+value).val()==""){
        $("#"+value+"Div").attr("class","form-group has-error");
        $("#"+value+"Span").html("<span class='text-danger'>该字段不能为空</span>");
        return false;
    }else{
        $("#"+value+"Div").attr("class","form-group has-success");
        $("#"+value+"Span").html("<span class='text-success'>该字段合法</span>");
        return true;
    }
}
