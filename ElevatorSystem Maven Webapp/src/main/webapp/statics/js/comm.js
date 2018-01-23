var ch = document.documentElement.clientHeight;
$('body').height(ch);
$('.loginBg').height(ch);
$(window).resize(function() {
    var _ch = document.documentElement.clientHeight;
    $('.loginBg').height(_ch);
    $('body').height(_ch);

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
$(function(){
    $('.vertical-menu ul li').hover(function(){
        var navStep =$(this).index();
        $(this).find('.vertical-menu-list').show();
        $(this).siblings().find('.vertical-menu-list').hide();
    },function(){
        $(this).find('.vertical-menu-list').hide();
    })
});


$(function(){
    var _this = this;
    var deltaFlag = 1;
    var listHeight = $('.vertical-menu-bd').height();
    $('.vertical-menu-wr').bind('mousewheel', function(event, delta) {
        if (deltaFlag == 1) {
            deltaFlag = 0;

            if (delta > 0) {
                $('.slide-btn-up').click();
            } else {
                $('.slide-btn-down').click();
            }

            setTimeout(function() {
                deltaFlag = 1
            }, 100);
        }
        event.preventDefault();
    });

    $('.slide-btn-down').on('click', function(e) {
        var slidHeight = $('.vertical-menu-wr').height();
        var partHeight = slidHeight % 80;

        if ((_this.currentMainMenuTop + slidHeight) >= listHeight) {
            return;
        }

        $('.slide-btn-up').removeClass('hidden');

        _this.currentMainMenuTop = _this.currentMainMenuTop + 80 * 2;
        $('.vertical-menu-bd').animate({
            marginTop: -_this.currentMainMenuTop + 'px'
        }, 'fadeOut', function() {
            if ((_this.currentMainMenuTop + slidHeight) >= listHeight) {
                $('.slide-btn-down').addClass('hidden');
            }
        });
    });
    $('.slide-btn-up').on('click', function(e) {
        var slidHeight = $('.vertical-menu-wr').height();
        var partHeight = slidHeight % 80;

        if(_this.currentMainMenuTop <= 0){
            return;
        }
        if (_this.currentMainMenuTop <= slidHeight) {
            _this.currentMainMenuTop = 0;
        } else if (_this.currentMainMenuTop > 90){
            _this.currentMainMenuTop = _this.currentMainMenuTop - 80 * 2;
        } else {
            _this.currentMainMenuTop = 0;
        }

        $('.slide-btn-down').removeClass('hidden');

        $('.vertical-menu-bd').animate({
            marginTop: -_this.currentMainMenuTop + 'px'
        }, 'fadeOut', function() {
            if (_this.currentMainMenuTop == 0) {
                $('.slide-btn-up').addClass('hidden');
            }
        });
    });
})

//倒计时
$(function(){
    var countdown=60;
    function sendemail(){
        var obj = $(".validate-box-btn");
        settime(obj);

    }
    function settime(obj) { //发送验证码倒计时
        if (countdown == 0) {
            obj.attr('disabled',false);
            //obj.removeattr("disabled");
            obj.val("免费获取验证码");
            countdown = 60;
            return;
        } else {
            obj.attr('disabled',true);
            obj.val("重新发送(" + countdown + ")");
            countdown--;
        }
        setTimeout(function() {
                settime(obj) }
            ,1000)
    }
    $('.validate-box-btn').on('click',function(){
        sendemail();
    })
})





