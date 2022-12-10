$(document).ready(function(){
    $('#btnSignup').click(function (e){
        // 정규식으로 아이디 비번 설정 필요
        // 추가로 입력안된 부분이 있을 경우 경고 조치 필요
        //console.log($('#signup-form').serialize());
        $('#signup-form').submit()
    })

    $('#btnCancel').click(function(e){
        location.href='/loginForm';
    })
});