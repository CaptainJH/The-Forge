
package com.forge.unittest.UserInterface;

import android.app.NativeActivity;

public class NativeDebug extends NativeActivity 
 {
  static { System.loadLibrary("UserInterface"); }
}