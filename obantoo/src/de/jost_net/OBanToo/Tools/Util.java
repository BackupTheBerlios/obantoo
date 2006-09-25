/*
 * $Source: /home/xubuntu/berlios_backup/github/tmp-cvs/obantoo/Repository/obantoo/src/de/jost_net/OBanToo/Tools/Util.java,v $
 * $Revision: 1.1 $
 * $Date: 2006/09/25 18:16:21 $
 * $Author: jost $
 *
 * Copyright 2006 by Heiner Jostkleigrewe
 * Diese Datei steht unter LGPL - siehe beigefügte lpgl.txt
 */
package de.jost_net.OBanToo.Tools;

public class Util
{
  static String toHex(String val)
  {
    String ret = "0x";
    for (int i = 0; i < val.length(); i++)
    {
      ret += toHex(val.charAt(i), 2);
    }
    return ret;
  }

  static String toHex(char c, int width)
  {
    int i = (int) c;
    return toHex(i, width);
  }

  static String toHex(int val, int width)
  {
    String s = Integer.toHexString(val).toUpperCase();
    while (s.length() < width)
    {
      s = "0" + s;
    }
    return s;
  }

}
/*
 * $Log: Util.java,v $
 * Revision 1.1  2006/09/25 18:16:21  jost
 * Neu
 * Revision 1.4 2006/06/05 09:35:13 jost
 */
