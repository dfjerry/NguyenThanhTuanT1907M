$(".menu-item.parent").bind("mouseenter",function (){
    var li = $(this);
    var sub = li.children(".submenu");
    sub.slideDown();
});
$(".menu-item.parent").bind("mouseleave",function (){
    var li = $(this);
    var sub = li.children(".submenu");
    sub.hide();
});
$(".vedautrang").bind("click",function (){
    $("html").animate({
        scrollTop: 0
    },200)
});


$(document).ready(function(){
    $('#slider').nivoSlider();
});