package org.JavaAPICustomLibrary.JavaApiInterface;
import org.json.JSONException;
import java.io.IOException;
import java.net.URISyntaxException;
import org.JavaAPICustomLibrary.CustomExceptionCollection.StatusNotFoundException;
import org.JavaAPICustomLibrary.APICallerclasses.WheatherForecastApiCall;

public class APICaller
{
    public static void main(String[]args)
    {
        try
        {
            WheatherForecastApiCall  Api = new WheatherForecastApiCall();
            Api.callWheatherForecastApi();
        }
        catch (URISyntaxException | IOException | StatusNotFoundException e)
        {
            if(e.getClass().getSimpleName() == "StatusNotFoundException")
            {
                throw new StatusNotFoundException("Connectivity issue!");
            }
            e.printStackTrace();
        }
        catch(JSONException e)
        {
            e.printStackTrace();
            System.out.println("Possible error in provided key values");
        }
    }
}
