let oEditors = []

smartEditor = function() {
    console.log("Naver SmartEditor")
    nhn.husky.EZCreator.createInIFrame({
        oAppRef: oEditors,
        elPlaceHolder: "editorTxt",
        // html 주소 확인
        sSkinURI: "/templates/smarteditor/SmartEditor2Skin.html",
        fCreator: "createSEditor2"
    })
}

$(document).ready(function() {
    smartEditor();
    console.log($('#notice-form').serializeArray());

    $('#btnOk').click(function (){
        oEditors.getById["editorTxt"].exec("UPDATE_CONTENTS_FIELD", [])
        let title = document.getElementById("view-writing-title").value
        let content = document.getElementById("editorTxt").value

        if( title == '') {
            alert("제목을 입력해주세요.")
            oEditors.getById["view-writing-title"].exec("FOCUS")
            return
        }
        else if(content == '') {
            alert("내용을 입력해주세요.")
            oEditors.getById["editorTxt"].exec("FOCUS")
            return
        }
        else {
            // 값이 전송되는 부분
            console.log($('#notice-form').serializeArray());
            $('#notice-form').submit();
        }
    })
})
