var book = '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:gs="http://spring.io/guides/gs-producing-web-service">\
<soapenv:Header/>\
<soapenv:Body>\
   <gs:getBookRequest>\
      <gs:name>UML</gs:name>\
   </gs:getBookRequest>\
</soapenv:Body>\
</soapenv:Envelope>';

$( "#soap" ).click(function() {
    $.ajax({
        url: "http://10.0.2.2:8080/ws/", 
        //url: "http://localhost:8080/ws/", 
        type: "POST",

        xhrFields: {
            withCredentials: true
          },
        
        dataType: "xml", 
        data: book, 
        contentType: "text/xml",
        success: OnSuccess, 
        error: OnError
    });
    return false;   
});
function OnSuccess(data, status)
{
    var name = $(data).find('name').text();
    var synopsis = $(data).find('synopsis').text();
    var disponible = $(data).find('disponible').text();
    var bibliotheque = $(data).find('bibliotheque').text();
    var geolocX= $(data).find('geolocX').text();
    var geolocY = $(data).find('geolocY').text();
    console.log(name);
    console.log(synopsis);
    console.log(disponible);
    console.log(bibliotheque);
    console.log(geolocX);
    console.log(geolocY);
};

function OnError(request, status, error)
{ 
    console.log(request);
    console.log("request");
    console.log(status); 
    console.log("status");
    console.log(error);
    console.log("error");
};



var Latitude = undefined;
var Longitude = undefined;

// Get geo coordinates

function getMapLocation() {

    navigator.geolocation.getCurrentPosition
    (onMapSuccess, onMapError, { enableHighAccuracy: true });
}

// Success callback for get geo coordinates

var onMapSuccess = function (position) {

    Latitude = position.coords.latitude;
    Longitude = position.coords.longitude;

    getMap(Latitude, Longitude);

}

// Get map by using coordinates

function getMap(latitude, longitude) {

    var mapOptions = {
        center: new google.maps.LatLng(0, 0),
        zoom: 1,
        mapTypeId: google.maps.MapTypeId.ROADMAP
    };

    map = new google.maps.Map
    (document.getElementById("map"), mapOptions);


    var latLong = new google.maps.LatLng(latitude, longitude);

    var marker = new google.maps.Marker({
        position: latLong
    });

    marker.setMap(map);
    map.setZoom(15);
    map.setCenter(marker.getPosition());
}

// Success callback for watching your changing position

var onMapWatchSuccess = function (position) {

    var updatedLatitude = position.coords.latitude;
    var updatedLongitude = position.coords.longitude;

    if (updatedLatitude != Latitude && updatedLongitude != Longitude) {

        Latitude = updatedLatitude;
        Longitude = updatedLongitude;

        getMap(updatedLatitude, updatedLongitude);
    }
}

// Error callback

function onMapError(error) {
    console.log('code: ' + error.code + '\n' +
        'message: ' + error.message + '\n');
}

// Watch your changing position

function watchMapPosition() {

    return navigator.geolocation.watchPosition
    (onMapWatchSuccess, onMapError, { enableHighAccuracy: true });
}
