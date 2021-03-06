/*
 * $Source: /home/xubuntu/berlios_backup/github/tmp-cvs/obantoo/Repository/obantoo/src/de/jost_net/OBanToo/QIF/QIFException.java,v $
 * $Revision: 1.1 $
 * $Date: 2006/05/30 17:40:40 $
 * $Author: jost $
 *
 * Copyright 2006 by Heiner Jostkleigrewe
 * Diese Datei steht unter LGPL - siehe beigefügte lpgl.txt
 */
package de.jost_net.OBanToo.QIF;

/**
 * Exeption des QIF-Parsers
 * @author Heiner Jostkleigrewe
 *
 */
public class QIFException extends Exception
{
  public static final long serialVersionUID = -290546230105935027L;

  public final static String UNGUELGITGER_HEADER = "Ungültiger Header: ";

  public final static String UNGUELTIGES_DATUM = "Ungültiges Datum: ";

  public QIFException(String text)
  {
    super(text);
  }

  public QIFException(String text, String value)
  {
    super(text + value);
  }
}
/*
 * $Log: QIFException.java,v $
 * Revision 1.1  2006/05/30 17:40:40  jost
 * *** empty log message ***
 *
 */
