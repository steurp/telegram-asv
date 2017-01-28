package org.telegram.messenger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Pascal on 26-1-2017.
 */
@RunWith(AndroidJUnit4.class)
public class MessagesControllerTest {

    Context mMockContext;

    private MessagesController messagesController;


    @Before
    public void setUp() throws Exception {
        messagesController = new MessagesController();
        messagesController.blockedUsers = new ArrayList<>();
    }

    /**
     * Test to block a user and check if he is blocked
     *
     * @throws Exception
     */
    @Test
    public void blockUser() throws Exception {
        int idToBlock = 5;
        messagesController.blockUserTest(idToBlock);

        assertTrue("student blocked", messagesController.blockedUsers.contains(idToBlock));
    }

    /**
     * Test that must fail if you want to block a user that is already blocked
     *
     * @throws Exception
     */
    @Test
    public void blockUserThatIsBlocked() throws Exception {
        int idToBlock = 5;
        messagesController.blockUserTest(idToBlock);

        int sameUser = 5;
        messagesController.blockUserTest(sameUser);

        assertFalse("student is blocked", messagesController.blockUserTest(sameUser));
    }
}