package org.bongiorno.ws.client;

import org.bongiorno.ws.core.client.RelativeRestOperations;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author chribong
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-twilio-client-context.xml")
public class TwilioClientTest {

    @Autowired
    private TwilioClient webServiceClient;


    @Value("${twilio.client.account.sid}")
    private String userName;

    @Value("${twilio.client.account.token}")
    private String password;

    @Test
    public void testSendMessage() throws Exception {
        TwilioResponse response = webServiceClient.sendMessage("+16073231264", "hey dad!!!!");
    }

    @Test
    public void testConnection() throws Exception {
        webServiceClient.testConnection();

    }

}
