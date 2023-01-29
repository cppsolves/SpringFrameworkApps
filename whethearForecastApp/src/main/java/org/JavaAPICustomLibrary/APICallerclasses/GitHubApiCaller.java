package org.JavaAPICustomLibrary.APICallerclasses;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.JavaAPICustomLibrary.CustomExceptionCollection.StatusNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

public class GitHubApiCaller
{
    public void GitHubApiCallermethod() throws URISyntaxException, StatusNotFoundException,IOException, JSONException
    {
        URIBuilder builder = new URIBuilder("https://api.github.com/users/cppsolves");
        HttpGet getdata = new HttpGet(builder.build());
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(getdata);
        if(response.getStatusLine().getStatusCode() == 200)
        {
            HttpEntity getEntity = response.getEntity();
            String res = EntityUtils.toString(getEntity);
            JSONObject json = new JSONObject(res);
            String username = json.getString("login");
            int loginid = json.getInt("id");
            System.out.println("username: "+username);
            System.out.println("loginID: "+loginid);
        }
        else
        {
            throw new StatusNotFoundException("Program Exiting, Status not found!");
        }
        httpClient.close();
    }

}

