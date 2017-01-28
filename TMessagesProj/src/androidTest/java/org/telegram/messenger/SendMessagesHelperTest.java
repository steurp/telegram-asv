package org.telegram.messenger;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Pascal on 27-1-2017.
 */
public class SendMessagesHelperTest {
    private SendMessagesHelper sendMessagesHelper;
    private ArrayList<MessageObject> messageObjects;


    @Before
    public void setUp() throws Exception {
        messageObjects = new ArrayList<>();
        sendMessagesHelper = Mockito.mock(SendMessagesHelper.class);
    }

    @Test
    public void messageSend() {
        MessageObject message = Mockito.mock(MessageObject.class);
        messageObjects.add(message);

        sendMessagesHelper.sendMessage(messageObjects, 0);
        int notificatieVerstuurd = NotificationCenter.didReceivedNewMessages;

        System.out.println("Notificatie " + notificatieVerstuurd);

        assertTrue("Geen notificatie", notificatieVerstuurd == 2);
        assertEquals(2, notificatieVerstuurd);
    }
}