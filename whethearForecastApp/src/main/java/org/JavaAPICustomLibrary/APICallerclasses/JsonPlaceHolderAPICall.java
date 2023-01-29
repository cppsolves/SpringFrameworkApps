package org.JavaAPICustomLibrary.APICallerclasses;

import org.JavaAPICustomLibrary.CustomExceptionCollection.StatusNotFoundException;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URISyntaxException;
import java.rmi.StubNotFoundException;

public class JsonPlaceHolderAPICall
{
    public void JsonAPICall() throws URISyntaxException, IOException , JSONException
    {
        URIBuilder builder = new URIBuilder("https://jsonplaceholder.typicode.com/albums");
        HttpGet getData = new HttpGet(builder.build());
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = httpclient.execute(getData);
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity);
        JSONArray Jarr = new JSONArray(result);
        System.out.println("[");
        for(int idx=0;idx<Jarr.length();idx++)
        {
            JSONObject jbj = (JSONObject) Jarr.get(idx);
            int userId = jbj.getInt("userId");
            int id = jbj.getInt("id");
            String title = jbj.getString("title");
            System.out.println("\t{");
            System.out.println("\t\t"+"\"userId\": "+userId+",");
            System.out.println("\t\t"+"\"id\": "+id+",");
            System.out.println("\t\t"+"\"title\": "+"\""+title+"\"");
            if(idx < Jarr.length()-1) System.out.println("\t},");
            else System.out.println("\t}");
        }
        System.out.println("]");
        httpclient.close();
        response.close();
    }

}
