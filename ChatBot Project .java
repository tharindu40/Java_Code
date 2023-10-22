import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

public class ChatBot {
    public static void main(String[] LOL) {
        try {
            HttpClient httpClient = HttpClients.createDefault();
            HttpPost request = new HttpPost("https://api.openai.com/v1/engines/davinci/completions"); 
            request.addHeader("Authorization", "Bearer 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");
            StringEntity entity = new StringEntity("{\"prompt\": \"Translate the following English text to French: 'Hello, how are you?'\"}");
            request.setEntity(entity);
            HttpResponse response = httpClient.execute(request);
            System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
