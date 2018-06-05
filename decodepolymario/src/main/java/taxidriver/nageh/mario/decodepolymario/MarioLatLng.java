package taxidriver.nageh.mario.decodepolymario;

public class MarioLatLng {
    private double Lat,Lng;

    public MarioLatLng(double lat, double lng) {
        Lat = lat;
        Lng = lng;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getLng() {
        return Lng;
    }

    public void setLng(double lng) {
        Lng = lng;
    }
}
