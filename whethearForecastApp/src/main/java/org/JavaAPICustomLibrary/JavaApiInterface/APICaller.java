package org.JavaAPICustomLibrary.JavaApiInterface;
import org.JavaAPICustomLibrary.APICallerclasses.ChuckNorrisApiCall;
import org.json.JSONException;
import java.io.IOException;
import java.net.URISyntaxException;
import org.JavaAPICustomLibrary.CustomExceptionCollection.StatusNotFoundException;
import org.JavaAPICustomLibrary.APICallerclasses.WheatherBitApiCall;
import org.JavaAPICustomLibrary.APICallerclasses.JsonPlaceHolderAPICall;
public class APICaller
{
    public static void main(String[]args)
    {
        try
        {
            JsonPlaceHolderAPICall Apiobj = new JsonPlaceHolderAPICall();
            Apiobj.JsonAPICall();
        }
        catch (URISyntaxException | IOException | StatusNotFoundException e)
        {
            if(e.getClass().getSimpleName() == "StatusNotFoundException")
            {
                throw new StatusNotFoundException("Possible Connectivity error!");
            }
            else if(e.getClass().getSimpleName() == "URISyntaxException")
            {
                e.printStackTrace();
                System.out.println("Possible JSONFormat/URISyntax Error!");
            }
            else
            {
                e.printStackTrace();
                System.out.println("Possible IO Error/Unknown error occurred!");
            }
        }
        catch(JSONException e)
        {
            e.printStackTrace();
            System.out.println("Unknown JSON Format");
        }
    }
}
