package org.telegram.ui;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by Pascal on 27-1-2017.
 */
public class ChatActivityTest {
    @Mock
    Context mMockContext;

    private ChatActivity chatActivity;

    @Before
    public void setUp() throws Exception {
        chatActivity = new ChatActivity();
    }

    @Test
    public void uploadFile() {
        chatActivity.processSelectedAttach(4);

        assertEquals(4, chatActivity.getItemSelected());
    }

}