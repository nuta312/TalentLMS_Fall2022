package uiTests.login;

import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class NewTest {

    @Test
    public void testExample() throws IOException, MailosaurException {
        Message message = MailSaur.retrieveMessage();
        assertNotNull(message);
        assertEquals("Second Test", message.subject());
        assertEquals("Hello World!",message.text().body().trim());
    }
}
