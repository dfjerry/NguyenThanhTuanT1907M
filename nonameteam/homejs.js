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

// When the user scrolls the page, execute myFunction
window.onscroll = function() {myFunction()};

// Get the header
var header = document.getElementById("myHeader");

// Get the offset position of the navbar
var sticky = header.offsetTop;

// Add the sticky class to the header when you reach its scroll position. Remove "sticky" when you leave the scroll position
function myFunction() {
    if (window.pageYOffset > sticky) {
        header.classList.add("sticky");
    } else {
        header.classList.remove("sticky");
    }
}
