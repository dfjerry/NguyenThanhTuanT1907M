$(".menu-item.parent").bind("mouseenter",function (){
    var li = $(this);
    var sub = li.children(".submenu");
    sub.show();
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

/*google maps*/


var map;
function initMap() {
    var address = {lat: 21.0288, lng: 105.781},
        map = new google.maps.Map(document.getElementById('map'), {
            center: address,
            zoom: 18,
        });
    var marker = new google.maps.Marker({position: address, map:map, label: "Đại học FPT"});

}
