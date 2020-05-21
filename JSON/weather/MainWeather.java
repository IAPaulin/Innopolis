package weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MainWeather {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://www.metaweather.com/api/location/2122265/");
        ObjectMapper obMap = new ObjectMapper();

        PrognosisWeek prog = obMap.readValue(url, PrognosisWeek.class);

        System.out.println(prog.getList());


    }
}
