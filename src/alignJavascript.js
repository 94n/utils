<script type="text/javascript">

var map = null;

$(function () {

    map = new Microsoft.Maps.Map($('#mapDiv').get(0),
        {
            credentials:"KEY",
            mapTypeId:Microsoft.Maps.MapTypeId.road,
            zoom:3
        });

$(".NavBar_typeButtonContainer").live('mouseover', null, function () {
    $('.MicrosoftMap_NavBar_typeMenu').empty()
        .append($('<li>').addClass('NavBar_menuitem')
        .append($('<div>').addClass('NavBar_itemContainer').addClass('NavBar_itemContainer_auto')
        .append($('<div class="NavBar_typePreview NavBar_typePreview_auto"></div><div class="NavBar_typeContent"><div class="NavBar_typeTitle">My Custom style</div><div class="NavBar_typeDesc">My Custom</div></div>').click(null, function () {
        map.setMapType(Microsoft.Maps.MapTypeId.aerial);
        changeMapStyleLabel("Custom");
    }))));
});

});

function changeMapStyleLabel(style) {
    $('.NavBar_typeButtonContainer a:eq(0) span:eq(1)').text(style);
    }

</script>