/*
 * $Source: /home/xubuntu/berlios_backup/github/tmp-cvs/obantoo/Repository/obantoo/src/de/jost_net/OBanToo/Dtaus/Satz.java,v $
 * $Revision: 1.4 $
 * $Date: 2006/09/25 18:28:57 $
 * $Author: jost $
 *
 * Copyright 2006 by Heiner Jostkleigrewe
 * Diese Datei steht unter LGPL - siehe beigef�gte lpgl.txt
 */
package de.jost_net.OBanToo.Dtaus;

import de.jost_net.OBanToo.Tools.Util;

public class Satz
{

  public Satz() throws DtausException
  {
    //
  }

  public Satz(String value) throws DtausException
  {
  }

  protected String makeValid(String value)
  {
    value = value.replaceAll("a", "A");
    value = value.replaceAll("b", "B");
    value = value.replaceAll("c", "C");
    value = value.replaceAll("d", "D");
    value = value.replaceAll("e", "E");
    value = value.replaceAll("f", "F");
    value = value.replaceAll("g", "G");
    value = value.replaceAll("h", "H");
    value = value.replaceAll("i", "I");
    value = value.replaceAll("j", "J");
    value = value.replaceAll("k", "K");
    value = value.replaceAll("l", "L");
    value = value.replaceAll("m", "M");
    value = value.replaceAll("n", "N");
    value = value.replaceAll("o", "O");
    value = value.replaceAll("p", "P");
    value = value.replaceAll("q", "Q");
    value = value.replaceAll("r", "R");
    value = value.replaceAll("s", "S");
    value = value.replaceAll("t", "T");
    value = value.replaceAll("u", "U");
    value = value.replaceAll("v", "V");
    value = value.replaceAll("w", "W");
    value = value.replaceAll("x", "X");
    value = value.replaceAll("y", "Y");
    value = value.replaceAll("z", "Z");
    value = value.replaceAll("�", "�");
    value = value.replaceAll("�", "�");
    value = value.replaceAll("�", "�");
    value = value.replaceAll("�", "E");
    value = value.replaceAll("�", "E");
    return value;
  }

  protected void validCharacters(String value) throws DtausException
  {
    for (int i = 0; i < value.length(); i++)
    {
      char c = value.charAt(i);
      if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || c == ' '
          || c == '.' || c == ',' || c == '&' || c == '-' || c == '+'
          || c == '*' || c == '%' || c == '/' || c == '$' || c == '�'
          || c == '�' || c == '�' || c == '�')
      {
        // g�ltig
      }
      else
      {
        throw new DtausException(DtausException.UNGUELTIGES_ZEICHEN, value
            .substring(i, i + 1)
            + "("
            + Util.toHex(value.substring(i, i + 1))
            + ")"
            + " an Position " + i + ": " + value);
      }
    }
  }

  private String codingToDtaus(String value)
  {
    String ret = value;
    ret = ret.replace('�', (char) 0x5b);
    ret = ret.replace('�', (char) 0x5b);
    ret = ret.replace('�', (char) 0x5c);
    ret = ret.replace('�', (char) 0x5c);
    ret = ret.replace('�', (char) 0x5d);
    ret = ret.replace('�', (char) 0x5d);
    ret = ret.replace('�', (char) 0x7e);
    return ret;
  }

  protected String codingFromDtaus(String value)
  {
    String ret = value;
    ret = ret.replace((char) 0x5b, '�');
    ret = ret.replace('\\', '�');
    ret = ret.replace((char) 0x5d, '�');
    ret = ret.replace((char) 0x7e, '�');
    return ret;
  }

  /**
   * Datenfelder auf die L�nge 27 bringen
   */
  public String make27(String in)
  {
    String out = "";
    if (in.length() > 27)
    {
      out = in.substring(0, 27);
    }
    if (in.length() < 27)
    {
      out = in + Tool.space(27 - in.length());
    }
    out = codingToDtaus(out);
    return out;
  }

}
/*
 * $Log: Satz.java,v $
 * Revision 1.4  2006/09/25 18:28:57  jost
 * Fehlerhaftes Zeichen wird auch als Hex-Wert ausgegeben.
 * Revision 1.3 2006/08/28 19:04:43 jost Korrekte Behandlung
 * von Gro�-Kleinschreibung und ���� Revision 1.2 2006/06/05 09:35:59 jost
 * Erweiterungen f. d. DtausDateiWriter Revision 1.1 2006/05/24 16:24:44 jost
 * Prerelease
 * 
 */
