package com.example.UniversityEventManagment.getrequesttests;

import com.example.UniversityEventManagment.supplier.LogInformation;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import java.lang.String;
import java.util.function.Supplier;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class GETRequestTest {
    private static Logger LOG = LoggerFactory.getLogger(GETRequestTest.class);
    @Test
    public void initiateAllrecs(){
        LOG.info(LogInformation.GETREQUEST);
        String url = "http://localhost:8080/Studentmaster/findAll";
        Response response = RestAssured.given().accept("application/json").get(url).andReturn();
        response.getBody().prettyPrint();
        LOG.info(LogInformation.ASSERTSTATUSCODE);
        assertEquals(response.getStatusCode(),200,"http status");
        LOG.info(LogInformation.VERFIFYRESPONSEID);
        for(int i=1;i<=4;i++){
            assertTrue(response.getBody().jsonPath().getList("studentId").contains(i));
        }
    }
}
