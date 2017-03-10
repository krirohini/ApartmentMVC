<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <style type="text/css">
      html, body, #map-canvas { height: 100%; margin: 0; padding: 0;}
    </style>
    <script type="text/javascript" 
    		src="https://maps.googleapis.com/maps/api/js?sensor=SET_TO_TRUE_OR_FALSE">
    </script>
    <script type="text/javascript">
      function initialize() {
        var mapOptions = {
          center: { lat: 37.318, lng: -121.941},
/*           center: { lat: -34.397, lng: 140.644}, */         
		  zoom: 10
        };
        var map = new google.maps.Map(document.getElementById('map-canvas'),
            mapOptions);
      }
      google.maps.event.addDomListener(window, 'load', initialize);
      // browser.loadURL("http://maps.google.com");
    </script>
  </head>
  <body>
	<div id="map-canvas"></div>
	<form method="GET" name="mapDirection" ></form>
  </body>
</html>