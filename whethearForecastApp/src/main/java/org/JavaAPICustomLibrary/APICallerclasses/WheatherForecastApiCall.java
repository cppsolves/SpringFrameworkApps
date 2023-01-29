package org.JavaAPICustomLibrary.APICallerclasses;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.JavaAPICustomLibrary.CustomExceptionCollection.StatusNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class WheatherForecastApiCall
{
    public void callWheatherForecastApi() throws URISyntaxException, IOException,JSONException
    {
        System.out.println("Please enter the location");
        Scanner scn = new Scanner(System.in);
        String location = scn.nextLine();
        URIBuilder builder = new URIBuilder("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/weatherdata/forecast?aggregateHours=24&contentType=json&unitGroup=metric&locationMode=single&locations=Delhi,India&key=1PYNQ6AWUDJE9AFERDCHJHSXK");
        builder.setParameter("aggregateHours","24");
        builder.setParameter("contentType","json");
        builder.setParameter("unitGroup","metric");
        builder.setParameter("LocationMode","single");
        builder.setParameter("key","1PYNQ6AWUDJE9AFERDCHJHSXK");
        HttpGet getData = new HttpGet(builder.build());
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(getData);
        if(response.getStatusLine().getStatusCode() == 200)
        {
            HttpEntity responseEntity = response.getEntity();
            System.out.println(responseEntity);
            String result = EntityUtils.toString(responseEntity);
            JSONObject responseObject = new JSONObject(result);
            JSONObject jsonLocation = responseObject.getJSONObject("location");
            JSONArray valueArray = jsonLocation.getJSONArray("values");
            System.out.println("dateTime \t \t \t \t \t mintemp \t   maxtemp \t  humidity \t  visibility");
            for(int i=0;i<valueArray.length();i++)
            {
                JSONObject jobj = valueArray.getJSONObject(i);
                String dateTime = jobj.getString("datetimeStr");
                Double mintemp = jobj.getDouble("mint");
                Double maxtemp = jobj.getDouble("maxt");
                Double humidity = jobj.getDouble("humidity");
                Double visibility = jobj.getDouble("visibility");
                System.out.printf("%s\t%f\t%f\t%f\t%f",dateTime,mintemp,maxtemp,humidity,visibility);
                System.out.println();
            }
        }
        else
        {
            throw new StatusNotFoundException("Program Exiting, Status not found!");
        }
        httpClient.close();
    }
}

