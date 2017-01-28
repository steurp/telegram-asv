package org.telegram.ui;

import android.content.Context;

import org.telegram.messenger.R;

/**
 * Created by Pascal on 4-1-2017.
 */
public class ClassUnderTest {
    Context mContext;

    public ClassUnderTest(Context mMockContext) {
        super();
        mContext = mMockContext;
    }

    String getHelloWorldString() {
        return mContext.getString(R.string.hello_word); //<- returned FAKE_STRING
    }

    public void setContext(Context context) {
        this.mContext = context;
    }
}
