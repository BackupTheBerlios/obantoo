/*
 * $Source: /home/xubuntu/berlios_backup/github/tmp-cvs/obantoo/Repository/obantoo/src/de/jost_net/OBanToo/Dtaus/Satz.java,v $
 * $Revision: 1.1 $
 * $Date: 2006/05/24 16:24:44 $
 * $Author: jost $
 *
 * Copyright 2006 by Heiner Jostkleigrewe
 * Diese Datei steht unter LGPL - siehe beigef�gte lpgl.txt
 */
package de.jost_net.OBanToo.Dtaus;

public class Satz
{
  public Satz() throws DtausException
  {
    //
  }

  public Satz(String value) throws DtausException
  {
    validCharacters(value);
  }

  protected String umkodierung(String value)
  {
    value = value.replace('[', '�');
    return value;
  }

  protected void validCharacters(String value) throws DtausException
  {
    for (int i = 0; i < value.length(); i++)
    {
      char c = value.charAt(i);
      if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || c == ' '
          || c == '.' || c == ',' || c == '&' || c == '-' || c == '+'
          || c == '*' || c == '%' || c == '/' || c == '$' || c == 0x5b
          || c == 0x5c || c == 0x5d || c == 0x7e)
      {
        // g�ltig
      }
      else
      {
        throw new DtausException(DtausException.UNGUELTIGES_ZEICHEN, value
            .substring(i, i + 1));
      }
    }
  }
}
/*
 * $Log: Satz.java,v $
 * Revision 1.1  2006/05/24 16:24:44  jost
 * Prerelease
 *
 */
