import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.*;

public class ConvertirMoneda {

    private String apiKey = "51c42f8b553e0cbcfaa78984";
    public double convertir(String monedaOrigen, String monedaConversion) throws IOException, InterruptedException {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + monedaOrigen);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        // System.out.println(json);

        Moneda moneda = new Gson().fromJson(json, Moneda.class);

        // System.out.println(moneda.conversion_rates);

        if (moneda.conversion_rates.containsKey(monedaConversion)) {
            return moneda.conversion_rates.get(monedaConversion);
        } else {
            throw new RuntimeException("Moneda no soportada");
        }
    }
}
