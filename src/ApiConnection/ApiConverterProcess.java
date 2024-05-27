package ApiConnection;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConverterProcess {

    public Currency locateCurrency(String CurrencyOption, double CurrencyAmount) {
        URI url = URI.create("https://v6.exchangerate-api.com/v6/fd8f0607e59c10f2ac65e9fe/pair/" + CurrencyOption + CurrencyAmount);


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Currency.class);
        } catch (Exception e) {
            throw new RuntimeException("No se puede convertir");
        }
    }
}
