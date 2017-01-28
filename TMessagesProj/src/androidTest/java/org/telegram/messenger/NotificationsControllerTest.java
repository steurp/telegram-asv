package org.telegram.messenger;

import android.support.test.runner.AndroidJUnit4;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.telegram.tgnet.TLRPC;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Pascal on 27-1-2017.
 */
@RunWith(AndroidJUnit4.class)
public class NotificationsControllerTest {

    private MessageObject messageObject;
    private TLRPC.Message message;

    @Before
    public void setUp() throws Exception {
        message = new TLRPC.Message();
        TLRPC.MessageMedia messageMedia = new TLRPC.MessageMedia();
        TLRPC.Document document = new TLRPC.Document();
        TLRPC.PhotoSize photoSize = new TLRPC.PhotoSize();
        photoSize.setHeight(250);
        photoSize.setWidth(250);
        message.media = messageMedia;
        message.media.document = document;
        message.media.document.setMimeType("image/gif");
        message.media.document.setThumb(photoSize);
        messageObject = new MessageObject(message, new AbstractMap<Integer, TLRPC.User>() {
            @Override
            public Set<Entry<Integer, TLRPC.User>> entrySet() {
                return null;
            }
        }, false);
        messageObject.setType(8);
    }

    /**
     * Test to show recieving of a GIF
     *
     * @throws Exception
     */
    @Test
    public void recieveGifFile() throws Exception {
        Assert.assertTrue("file is no gif", messageObject.isGifDocument(message.media.document));
    }
}