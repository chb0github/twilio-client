package org.bongiorno.ws.client;

import org.bongiorno.ws.core.client.RelativeRestOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chribong
 */
public class TwilioClient {

    @Value("${client.name:}")
    private String clientName;

    @Value("${client.version:}")
    private String clientVersion;


    private String from;

    public TwilioClient() {
    }

    public TwilioClient(String from) {
        this.from = from;
    }

    @Autowired
    private RestOperations rawConnection;

    public String getName() {
        return clientName;
    }

    public String getVersion() {
        return clientVersion;
    }

    public TwilioResponse sendMessage(String to, String msg) {
        MultiValueMap<String,String> message = new LinkedMultiValueMap<>();
        message.add("Body",msg);
        message.add("To",to);
        message.add("From",from);
        // if you send to /Message and not /Message.json it responds in XML regardless of the accept type
        return rawConnection.postForObject("Messages.json", message, TwilioResponse.class);

    }

    public String testConnection() {
        // this actually returns account information
        return rawConnection.getForObject("/",String.class);
    }
}
