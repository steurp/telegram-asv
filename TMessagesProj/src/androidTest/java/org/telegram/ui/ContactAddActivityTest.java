package org.telegram.ui;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/**
 * Created by Pascal on 28-1-2017.
 */
@RunWith(AndroidJUnit4.class)
public class ContactAddActivityTest {

    private ContactsController contactsController;
    private TLRPC.User user;

    @Before
    public void setUp() throws Exception {
        contactsController = new ContactsController();
        user = new TLRPC.User();

        user.setFirst_name("test");
        user.setLast_name("test");
        user.setPhone("+31612345678");
    }

    /**
     * Test to show recieving a contact
     *
     * @throws Exception
     */
    @Test
    public void receivedContact() throws Exception {
        contactsController.addContact(user);

        Assert.assertTrue("contact not added", contactsController.iscontactAdded());
    }

}