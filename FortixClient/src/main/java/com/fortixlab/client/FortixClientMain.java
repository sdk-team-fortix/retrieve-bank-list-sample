package com.fortixlab.client;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


import com.fortixlab.sdk.modules.duitnow.DuitNow;
import com.fortixlab.sdk.modules.duitnow.DuitNowAPI;
import com.fortixlab.sdk.modules.duitnow.DuitNowResponse;
import com.fortixlab.sdk.modules.duitnow.retrievebanklist.RetrieveBankListBody;


@Component
@ComponentScan("com.fortixlab.client")
public class FortixClientMain implements CommandLineRunner {

    private static DuitNowAPI duitNow = DuitNow.initiateDuitNow();
    @Override
    public void run(String... args) throws Exception {
        
        System.out.println("Get Started!");
		// Compose body Retrive Bank List DTO
		RetrieveBankListBody req = new RetrieveBankListBody();
		/*
		    //Optional fields, if null will be generated default value
		  	req.setClientId("APGWXXX");
			req.setMessageId("2023XXXXAPGWMYKL650OBWXXXXXXX");
			req.setTransactionId("20230XXXAPGWMYKL650XXXXXX");
			req.setRppBIC("RPPXXXX");
			req.setPageKey(null);
			req.setPrivateKey("XXXXXX.key");
		 */
		// call retrieve bank list API
		DuitNowResponse resp = duitNow.retrieveBankList(req);
		// print out response from API Gateway
		System.out.println("Message ID :"+req.getMessageId());
		System.out.println("Status Code : " + resp.getStatusCode());
		System.out.println("Status Message : " + resp.getStatusMessage());
		if(resp.getBody()!=null) {
			System.out.println("Body : ");
			System.out.println(resp.getBody().get("header"));
			System.out.println(resp.getBody().get("banks"));
		}
    }
}
