import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class MailSaur {
    public static void main(String[] args) throws MailosaurException, IOException {

            // Available in the API tab of a server
            String apiKey = "G19WsrZJwriogLmw";
            String serverId = "rfpblgnn";
            String serverDomain = "rfpblgnn.mailosaur.net";

            MailosaurClient mailosaur = new MailosaurClient(apiKey);

            MessageSearchParams params = new MessageSearchParams();
            params.withServer(serverId);

            SearchCriteria criteria = new SearchCriteria();
            criteria.withSentTo("even-crack@rfpblgnn.mailosaur.net");
            criteria.withSubject("fasdfsafas");
            criteria.withSentFrom("amanzadr@gmail.com");

            Message message = mailosaur.messages().get(params, criteria);

            assertNotNull(message);

            System.out.println(message.subject());

        }
    }
