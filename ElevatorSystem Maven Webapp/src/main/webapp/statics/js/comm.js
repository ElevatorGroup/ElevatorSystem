var ch = document.documentElement.clientHeight;
$('.loginBg').height(ch);
$(window).resize(function() {
    var _ch = document.documentElement.clientHeight;
    $('.loginBg').height(_ch);

});
$('.main').height(ch-72);
$('.vertical-menu-wr').height(ch-72);

$(window).resize(function() {
    var _ch = document.documentElement.clientHeight;
    $('.main').height(_ch-72);
    $('.vertical-menu-wr').height(_ch-72);

});