$(document).ready(function () {

    //아이디는 영어+숫자만 가능 4~20글자 사이로
    const sampleRegex = /^[0-9|a-z|A-Z]{3,20}$/;
    // 최소 8글자 하나이상의 숫자/문자/특수문자
    const passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,20}$/;

    // 이름 설정
    const nameRegex = /^[A-Za-zㄱ-ㅎ가-힣]{2,20}$/;
    // 닉네임 설정
    const nicNameRegex = /^[A-Z0-9a-zㄱ-ㅎ가-힣]{2,20}$/;

    const emailRegex = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;

    const dateRegex = /^\d{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$/;


    $('#btnSignup').click(function (e) {
        $('.createDiv').remove();

        let check = regexCheck();

        if($('#signup-birth').val()==""){
            $('#signup-birth').val("0000-00-00");
        }else{
            if(!dateRegex.test($('#signup-birth').val())){
                check = false;
                $('#signup-birth').val('');
                $('.row5').after(createDiv("생일을 0000-00-00 형태로 작성해주세요"));
                console.log("생일");
            }
        }

        if(!$('input[name=signup-gender]').is(':checked')){
            check = false;
            $('.row6').after(createDiv("성별을 선택해주세여"));
            console.log("생일");
        }

        // 정규식을 모두 통과 하였을 경우
        if (check) {
            $('#signup-form').submit()
        } else {
            console.log("정규식을 만족하지 못하였습니다.");
            console.log($('#signup-form').serialize());
        }
    })

    $('#btnCancel').click(function (e) {
        location.href = '/loginForm';
    })

    $('#signup-password-show').change(function(){
        if($('#signup-password-show').is(':checked')){
            $('#signup-password').prop("type","text");
        }else{
            $('#signup-password').prop("type","password");
        }
    })

    // 정규식 체크
    function regexCheck(){
        let checkRegex = true;

        let name = decodeURI($('#signup-name').val());
        let nicName = decodeURI($('#signup-nicName').val());

        // 정규식 체크
        if (!sampleRegex.test($('#signup-id').val())) {
            checkRegex = false;
            $('#signup-id').val('');
            $('.row1').after(createDiv("3글자 이상 20글자 이하의 영어+숫자로 구성된 아이디를 작성해주세요"));
            console.log("id");
        }
        if (!nameRegex.test(name)) {
            checkRegex = false;
            $('#signup-name').val('');
            $('.row2').after(createDiv("2글자 이상 20글자 이하의 영어, 한글로 구성된 이름을 작성해주세요"));
            console.log("name");
        }
        if (!passwordRegex.test($('#signup-password').val())) {
            checkRegex = false;
            $('#signup-password').val('');
            $('.row4').after(createDiv("8글자이상 20글자 이하의 숫자,문자,특수문자가 각 1회이상 포함된 페스워드를 작성해주세요"));
            console.log("pw");
        }
        if (!nicNameRegex.test(nicName)) {
            checkRegex = false;
            $('#signup-nicName').val('');
            $('.row3').after(createDiv("2글자 이상 20글자 이하의 한글, 숫자, 영어로 구성된 닉네임을 설정해주세요"));
            console.log("nicname");
        }
        if (!emailRegex.test($('#signup-email').val())) {
            checkRegex = false;
            $('#signup-email').val('');
            $('.row7').after(createDiv("이메일의 형태로 작성해주세요"));
            console.log("email");
        }

        return checkRegex;
    }

    function createDiv(str) {
        let div = $('<div class="createDiv">');
        div.text(str).css({
            'paddingBottom': '1rem',
            'color': 'red',
            'fontSize': '.75rem',
        })

        return div;
    }

});