
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

    public class Real implements Valor {
        private String base;
        private String alvo;

        public void setAlvo(String alvo) {
            this.alvo = alvo;
        }

        public void setBase(String base) {
            this.base = base;
        }


        public Real(String base, String alvo) {

            this.base = base;
            this.alvo = alvo;
        }

        @Override
        public String valor() {
            String url_str = "https://v6.exchangerate-api.com/v6/6e7e9c130ec6196589a36d8d/pair/"+ base+"/" + alvo;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url_str)).build();

            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                return response.body();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
