package com.gg.aidldemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

/**
 * Creator:  GG
 * Time   :  2017/9/21.
 * Mail   :  gg.jin.yu@gmail.com
 * Explain:
 */

public class MessageService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }




    private final UserAidl.Stub mBinder = new UserAidl.Stub() {

        @Override
        public String getName() throws RemoteException {
            return "御坂美琴";
        }

        @Override
        public String getAge() throws RemoteException {
            return "14";
        }
    };
}
