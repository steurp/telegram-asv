package org.telegram.ui;

import android.content.Context;
import android.util.Log;
import android.view.View;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

/**
 * Created by Pascal on 4-1-2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class TestingClass{

    private static final String FAKE_STRING = "HELLO WORLD";

    @Mock
    Context mMockContext;

    @Mock
    MessagesController messagesController;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void isUserBlocked() {
        int idToBlock = 5;

        messagesController = Mockito.mock(MessagesController.class);
        messagesController.blockedUsers = new ArrayList<>();
        messagesController.blockUserTest(idToBlock);

        assertTrue("student blocked", messagesController.blockedUsers.contains(idToBlock));
    }

    @Test
    public void userSendsFiles() {
    }

    @Test
    public void isFileRecieved() {
    }

    @Test
    public void isGIFRecieved() {
    }

    @Test
    public void isContactShared() {
    }

    @Test
    public void isNotificationSpammed() {
    }

    @Test
    public void fileWasSend() {
    }

    @Test
    public void userSelectsFile() {
    }
}
