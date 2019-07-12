package com.dimfcompany.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage
{
    public static void s(Context c, String message)
    {
        Toast.makeText(c, message+"Tra la la edited***", Toast.LENGTH_SHORT).show();
    }
}