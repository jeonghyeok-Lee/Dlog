//이전 버튼 이벤트
function fn_prev(page, range, rangeSize) {
    let myPage = ((range - 2) * rangeSize) + 1;
    let myRange = range - 1;
    let url = "/noticeList";
    url = url + "?page=" + myPage;
    url = url + "&range=" + myRange;
    location.href = url;
}

//페이지 번호 클릭
function fn_pagination(page, range, rangeSize, searchType, keyword) {
    let url = "/noticeList";
    url = url + "?page=" + page;
    url = url + "&range=" + range;
    location.href = url;
}

//다음 버튼 이벤트
function fn_next(page, range, rangeSize) {
    let myPage = parseInt((range * rangeSize)) + 1;
    let myRange = parseInt(range) + 1;

    let url = "/noticeList";
    url = url + "?page=" + myPage;
    url = url + "&range=" + myRange;

    location.href = url;

}

$(document).ready(function(){
    $('#btnSearch').click(function(e){
        e.preventDefault();
        let url = "/noticeList";
        url = url + "?searchType=" + $("#searchType").val();
        url = url + "&keyword="+$("#keyword").val();
        location.href=url;
    })
})