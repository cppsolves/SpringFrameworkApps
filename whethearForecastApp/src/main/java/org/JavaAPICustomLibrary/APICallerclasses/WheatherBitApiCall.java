package org.JavaAPICustomLibrary.APICallerclasses;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URISyntaxException;

public class WheatherBitApiCall
{
    public void WheatherBitCall() throws URISyntaxException, IOException
    {
        URIBuilder builder = new URIBuilder("https://api.weatherbit.io/v2.0/current?lat=35.7796&lon=-78.6382&key=14535965ac5648bd9a2277d3104f4691&include=minutely");
        builder.setParameter("lat","35.7796");
        builder.setParameter("lon","-78.6382");
        builder.setParameter("key","14535965ac5648bd9a2277d3104f4691");
        builder.setParameter("include","minutely");
        HttpGet getdata = new HttpGet(builder.build());
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(getdata);
        HttpEntity httpentity = response.getEntity();
        String result = EntityUtils.toString(httpentity);
        JSONObject jboj = new JSONObject(result);
        JSONArray Jarr = new JSONArray(jboj.getJSONArray("minutely"));
        System.out.println("minutely: [");
        for(int idx = 0 ;idx<Jarr.length();idx++)
        {
            System.out.println("\t{");
            JSONObject obj = Jarr.getJSONObject(idx);
            double precip = obj.getDouble("precip");
            System.out.println("\t\t\"precip\": "+precip+" ,");
            double snow = obj.getDouble("snow");
            System.out.println("\t\tsnow: "+snow+" ,");
            double temp = obj.getDouble("temp");
            System.out.println("\t\ttemp: "+temp+" ,");
            int ts = obj.getInt("ts");
            String date = obj.getString("timestamp_local");
            System.out.println("\t\ttimestamp_local: "+date+" ,");
            String date1 = obj.getString("timestamp_utc");
            System.out.println("\t\ttimestamp_utc: "+date1);
            if(idx < Jarr.length()-1) System.out.println("\t},");
            else System.out.println("\t}");
        }
        System.out.println("]");
        httpClient.close();
        response.close();

    }
}
