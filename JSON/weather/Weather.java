package weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {


    @JsonProperty("applicable_date")
    private String date;
    @JsonProperty("max_temp")
    private double maxTemp;
    @JsonProperty("min_temp")
    private double minTemp;
    @JsonProperty("wind_speed")
    private double windSpeed;
    @JsonProperty("humidity")
    private int humidity;

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {

        this.maxTemp = round(maxTemp);
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = round(minTemp);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = round(windSpeed);
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "weather.Weather{" +
                "date='" + date + '\'' +
                ", maxTemp=" + maxTemp +
                ", minTemp=" + minTemp +
                ", windSpeed=" + windSpeed +
                ", humidity=" + humidity +
                '}' + "\n";
    }

    private double round(double num) {
        num = (int) (num * 100);
        num = num / 100;
        return num;
    }
}
