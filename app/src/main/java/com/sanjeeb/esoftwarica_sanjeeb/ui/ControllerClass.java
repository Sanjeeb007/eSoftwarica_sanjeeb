package com.sanjeeb.esoftwarica_sanjeeb.ui;

import com.sanjeeb.esoftwarica_sanjeeb.model.UserData;

class ControllerClass {
    public boolean CheckUser(UserData sd) {
        if ((sd.getName().equals("sanjeeb")) && (sd.getPassword().equals("070707"))) {
            return true;

        } else {
            return false;
        }
    }
}
