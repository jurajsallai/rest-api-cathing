package github;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GitHubApi {

    // API - tento file do clienta, mal by sa pripojit na URI a robit kadejake metody

    public static <T> T retrieveResourceFromResponse(final HttpResponse response, final Class<T> clazz) throws IOException {
        final String jsonFromResponse = EntityUtils.toString(response.getEntity());
        final ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.readValue(jsonFromResponse, clazz);
    }


    public static String getResource(HttpResponse response) throws IOException {
        String json = EntityUtils.toString(response.getEntity());
        return json;
    }

    // method for status code return

    // method for mime type return


}