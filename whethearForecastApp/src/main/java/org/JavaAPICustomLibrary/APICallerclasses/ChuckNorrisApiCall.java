package org.JavaAPICustomLibrary.APICallerclasses;

import org.JavaAPICustomLibrary.CustomExceptionCollection.StatusNotFoundException;
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
import java.net.URI;
import java.net.URISyntaxException;
import java.security.URIParameter;

public class ChuckNorrisApiCall
{
   public void ChuckNorrisapiCall() throws URISyntaxException, IOException, StatusNotFoundException
   {
       URIBuilder builder = new URIBuilder("https://api.chucknorris.io/jokes/random");
       HttpGet getData = new HttpGet(builder.build());
       CloseableHttpClient httpClient = HttpClients.createDefault();
       CloseableHttpResponse response = httpClient.execute(getData);
       HttpEntity httpentity = response.getEntity();
       String result = EntityUtils.toString(httpentity);
       JSONObject Jobj = new JSONObject(result);
       System.out.println("{");
       JSONArray jarr = Jobj.getJSONArray("categories");
       if(jarr.length() == 0)
       {
           System.out.println("\tcategories: [],");
       }
       else
       {
           System.out.println("\tcategories : [");
           System.out.println("\t");
           for(int idx =0;idx<jarr.length();idx++)
           {
               String str = jarr.getString(idx);
               System.out.print(str+" ");
           }
           System.out.println();
           System.out.println("],");
       }
       String cat = Jobj.getString("created_at");
       System.out.println("\tcreated_at: "+cat+" ,");
       String icon_url = Jobj.getString("icon_url");
       System.out.println("\ticon_url: "+icon_url+" ,");
       String id = Jobj.getString("id");
       System.out.println("\tid: "+id+" ,");
       String updated_at = Jobj.getString("updated_at");
       System.out.println("\tupdated_at: "+updated_at+" ,");
       String url = Jobj.getString("url");
       System.out.println("\turl: "+url+" ,");
       String value = Jobj.getString("value");
       System.out.println("\tvalue: "+value);
       System.out.println("}");
   }
}
