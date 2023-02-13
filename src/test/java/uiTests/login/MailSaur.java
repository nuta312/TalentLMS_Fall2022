package uiTests.login;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

import java.io.IOException;

public class MailSaur {
    private static final String API_KEY = "epsdGLTAsTV39zDv";
    private static final String SERVER_ID = "adrgxiyx";
    private static final String SERVER_DOMAIN = "@adrgxiyx.mailosaur.net";
    private static final String EMAIL_ADDRESS = "while-pay" + SERVER_DOMAIN;



    public static Message retrieveMessage() throws IOException, MailosaurException {

        MailosaurClient mailosaur = new MailosaurClient(API_KEY);
        MessageSearchParams params = new MessageSearchParams();
        SearchCriteria criteria = new SearchCriteria();
        params.withServer(SERVER_ID);
        criteria.withSentTo(EMAIL_ADDRESS);

        return mailosaur.messages().get(params, criteria);
    }
}
