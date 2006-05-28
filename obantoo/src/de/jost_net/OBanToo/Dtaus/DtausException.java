/*
 * $Source: /home/xubuntu/berlios_backup/github/tmp-cvs/obantoo/Repository/obantoo/src/de/jost_net/OBanToo/Dtaus/DtausException.java,v $
 * $Revision: 1.2 $
 * $Date: 2006/05/28 09:06:53 $
 * $Author: jost $
 *
 * Copyright 2006 by Heiner Jostkleigrewe
 * Diese Datei steht unter LGPL - siehe beigefügte lpgl.txt
 */
package de.jost_net.OBanToo.Dtaus;

public class DtausException extends Exception
{
  private static final long serialVersionUID = 790050704552032876L;

  public final static String A_SATZLAENGENFELD_FEHLERHAFT = "Satzlängenfeld des A-Satzes fehlerhaft: ";

  public final static String A_SATZART_FEHLERHAFT = "Satzart des A-Satzes fehlerhaft: ";

  public final static String A_GUTSCHRIFT_LASTSCHRIFT_FEHLERHAFT = "Gutschrift/Lastschrift-Kennzeichen des A-Satzes fehlerhaft: ";

  public final static String A_BLZ_FEHLERHAFT = "Bankleitzahl des A-Satzes fehlerhaft: ";

  public final static String A_DATEIERSTELLUNGSDATUM_FEHLERHAFT = "Dateierstellungsdatum des A-Satzes ist fehlerhaft: ";

  public final static String A_KONTO_FEHLERHAFT = "Konto des A-Satzes fehlerhaft: ";

  public final static String A_REFERENZ_FEHLERHAFT = "Referenz des A-Satzes nicht numerisch: ";

  public final static String A_WAEHRUNGSKENNZEICHEN_FEHLERHAFT = "Währungskennzeichen des A-Satzes fehlerhaft: ";

  public final static String C_SATZLAENGE_FEHLERHAFT = "Satzlaengenfeld des C-Satzes fehlerhaft: ";

  public final static String C_SATZART_FEHLERHAFT = "Satzart des C-Satzes fehlerhaft: ";

  public final static String C_BLZERSTBETEILIGT_FEHLERHAFT = "Bankleitzahl des erstbeteiligten Institutes fehlerhaft: ";

  public final static String C_BLZENDBEGUENSTIGT_FEHLERHAFT = "Bankleitzahl des endbegünstigten Institutes fehlerhaft: ";

  public final static String C_KONTONUMMER_FEHLERHAFT = "Kontonummer fehlerhaft: ";

  public final static String C_INTERNEKUNDENNUMMER_FEHLERHAFT = "Interne Kundennummer fehlerhaft: ";

  public final static String C_TEXTSCHLUESSEL_FEHLERHAFT = "Textschluessel fehlerhaft: ";

  public final static String C_TEXTSCHLUESSELERGAENZUNG_FEHLERHAFT = "Textschluesselergänzung fehlerhaft: ";

  public final static String C_ERSTBEAUFTRAGTESINSTITUT_FEHLERHAFT = "Erstbeauftragtes Institut fehlerhaft: ";

  public final static String C_KONTOAUFTRAGGEBER_FEHLERHAFT = "Konto Auftraggeber fehlerhaft: ";

  public final static String C_BETRAG_FEHLERHAFT = "Betrag fehlerhaft: ";

  public final static String C_WAEHRUNGSKENNZEICHEN_FEHLERHAFT = "Währungskennzeichen fehlerhaft: ";

  public final static String C_ERWEITERUNGSZEICHEN_FEHLERHAFT = "Erweiterungszeichen fehlerhaft: ";

  public final static String C_ERWEITERUNG_FEHLERHAFT = "Erweiterung fehlerhaft: ";

  public final static String E_SATZLAENGENFELD_FEHLERHAFT = "Satzlängenfeld des E-Satzes fehlerhaft: ";

  public final static String E_SATZART_FEHLERHAFT = "Satzart des E-Satzes fehlerhaft: ";

  public final static String E_ANZAHL_CSAETZE_FEHLERHAFT = "Anzahl der C-Sätze im E-Satz fehlerhaft: ";

  public final static String E_SUMME_BETRAEGE_FEHLERHAFT = "Summe der Beträge im E-Satz fehlerhaft: ";

  public final static String SATZLAENGE_FEHLERHAFT = "Satzlänge fehlerhaft: ";

  public final static String UNGUELTIGES_ZEICHEN = "Ungültiges Zeichen: ";
  
  public final static String UNGUELTIGE_LOGISCHE_DATEI = "Ungültige Logische Datei: ";

  public DtausException(String text)
  {
    super(text);
  }

  public DtausException(String text, String value)
  {
    super(text + value);
  }
}
/*
 * $Log: DtausException.java,v $
 * Revision 1.2  2006/05/28 09:06:53  jost
 * Zusätzliche Konstante
 *
 * Revision 1.1  2006/05/24 16:24:44  jost
 * Prerelease
 *
 */
