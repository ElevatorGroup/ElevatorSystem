var ch = document.documentElement.clientHeight;
$('.loginBg').height(ch);
$(window).resize(function() {
    var _ch = document.documentElement.clientHeight;
    $('.loginBg').height(_ch);

});
$('.main').height(ch-72);
$('.vertical-menu-wr').height(ch-72);
//$('.vertical-menu').height(ch-160);
$('.main-bd').height(ch-105);
$('.defaultAre').height(ch-145);

$(window).resize(function() {
    var _ch = document.documentElement.clientHeight;
    $('.main').height(_ch-72);
    $('.vertical-menu-wr').height(_ch-72);
    $('.main-bd').height(_ch-105);
    $('.defaultAre').height(_ch-145);
    //$('.vertical-menu').height(ch-160);
});


