import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

import java.io.IOException;

public class mailSour {
    public static void main(String[] args) throws MailosaurException, IOException {
        // Available in the API tab of a server
        String apiKey = "mWFJajRozgU5aIfd";
        String serverId = "vzt5tmgl";
        String serverDomain = "Tests";

        MailosaurClient mailosaur = new MailosaurClient(apiKey);

        MessageSearchParams params = new MessageSearchParams();
        params.withServer(serverId);

        SearchCriteria criteria = new SearchCriteria();
        criteria.withSentTo("widely-section@vzt5tmgl.mailosaur.net");
        criteria.withSubject("Hi");

        Message message = mailosaur.messages().get(params, criteria);


        System.out.println(message.subject());
        System.out.println(message.text().body());
    }
}
