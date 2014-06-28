package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_nl extends com.google.gwt.i18n.client.CurrencyList_ {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("EUR", "€", 2, "€", "€");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "EUR", "€", 2, "€", "€"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // Andorrese peseta
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128, "ADP", "ADP"));
    // Verenigde Arabische Emiraten-dirham
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH", "dh"));
    // Afghani (1927-2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130, "AFA", "AFA"));
    // Afghaanse afghani
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0, "AFN", "Af."));
    // Albanese lek
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0, "ALL", "Lek"));
    // Armeense dram
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 0, "AMD", "Dram"));
    // Nederlands-Antilliaanse gulden
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2, "ANG", "ANG"));
    // Angolese kwanza
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2, "AOA", "Kz"));
    // Angolese kwanza (1977-1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130, "AOK", "AOK"));
    // Angolese nieuwe kwanza (1990-2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130, "AON", "AON"));
    // Angolese kwanza reajustado (1995-1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130, "AOR", "AOR"));
    // Argentijnse austral
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130, "ARA", "ARA"));
    // Argentijnse peso (1983-1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130, "ARP", "ARP"));
    // Argentijnse peso
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$", "$"));
    // Oostenrijkse schilling
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130, "ATS", "ATS"));
    // Australische dollar
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$", "$"));
    // Arubaanse gulden
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2, "AWG", "Afl."));
    // Azerbeidzjaanse manat (1993-2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130, "AZM", "AZM"));
    // Azerbeidzjaanse manat
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2, "AZN", "man."));
    // Bosnische dinar
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130, "BAD", "BAD"));
    // Bosnische convertibele mark
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2, "BAM", "KM"));
    // Barbadaanse dollar
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2, "BBD", "$"));
    // Bengalese taka
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk", "৳"));
    // Belgische frank (convertibel)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130, "BEC", "BEC"));
    // Belgische frank
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130, "BEF", "BEF"));
    // Belgische frank (financieel)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130, "BEL", "BEL"));
    // Bulgaarse harde lev
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130, "BGL", "BGL"));
    // Bulgaarse nieuwe lev
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2, "BGN", "lev"));
    // Bahreinse dinar
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3, "BHD", "din"));
    // Burundese franc
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0, "BIF", "FBu"));
    // Bermuda-dollar
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2, "BMD", "$"));
    // Bruneise dollar
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2, "BND", "$"));
    // Boliviano
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2, "BOB", "Bs"));
    // Boliviaanse peso
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130, "BOP", "BOP"));
    // Boliviaanse mvdol
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130, "BOV", "BOV"));
    // Braziliaanse cruzeiro novo (1967-1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130, "BRB", "BRB"));
    // Braziliaanse cruzado
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130, "BRC", "BRC"));
    // Braziliaanse cruzeiro (1990-1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130, "BRE", "BRE"));
    // Braziliaanse real
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$", "R$"));
    // Braziliaanse cruzado novo
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130, "BRN", "BRN"));
    // Braziliaanse cruzeiro
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130, "BRR", "BRR"));
    // Bahamaanse dollar
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2, "BSD", "$"));
    // Bhutaanse ngultrum
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2, "BTN", "Nu."));
    // Birmese kyat
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130, "BUK", "BUK"));
    // Botswaanse pula
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2, "BWP", "P"));
    // Wit-Russische nieuwe roebel (1994-1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // Wit-Russische roebel
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 0, "BYR", "BYR"));
    // Belizaanse dollar
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2, "BZD", "$"));
    // Canadese dollar
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$", "$"));
    // Congolese franc
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2, "CDF", "FrCD"));
    // WIR euro
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 130, "CHE", "CHE"));
    // Zwitserse franc
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF", "CHF"));
    // WIR franc
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 130, "CHW", "CHW"));
    // Chileense unidades de fomento
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 128, "CLF", "CLF"));
    // Chileense peso
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$", "$"));
    // Chinese yuan renminbi
    result.put("CNY", new CurrencyDataImpl("CNY", "CN¥", 2, "RMB¥", "¥"));
    // Colombiaanse peso
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 0, "COL$", "$"));
    // Unidad de Valor Real
    result.put("COU", new CurrencyDataImpl("COU", "COU", 130, "COU", "COU"));
    // Costaricaanse colón
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 0, "CR₡", "₡"));
    // Oude Servische dinar
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130, "CSD", "CSD"));
    // Tsjechoslowaakse harde koruna
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130, "CSK", "CSK"));
    // Cubaanse convertibele peso
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2, "CUC", "$"));
    // Cubaanse peso
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN", "$"));
    // Kaapverdische escudo
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2, "CVE", "CVE"));
    // Cyprisch pond
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130, "CYP", "CYP"));
    // Tsjechische koruna
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč", "Kč"));
    // Oost-Duitse ostmark
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130, "DDM", "DDM"));
    // Duitse mark
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130, "DEM", "DEM"));
    // Djiboutiaanse franc
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0, "Fdj", "Fdj"));
    // Deense kroon
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr", "kr"));
    // Dominicaanse peso
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$", "$"));
    // Algerijnse dinar
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2, "DZD", "din"));
    // Ecuadoraanse sucre
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130, "ECS", "ECS"));
    // Ecuadoraanse unidad de valor constante (UVC)
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 130, "ECV", "ECV"));
    // Estlandse kroon
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 130, "EEK", "EEK"));
    // Egyptisch pond
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE", "E£"));
    // Eritrese nakfa
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2, "ERN", "Nfk"));
    // Spaanse peseta (account A)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 130, "ESA", "ESA"));
    // Spaanse peseta (convertibele account)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 130, "ESB", "ESB"));
    // Spaanse peseta
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128, "ESP", "ESP"));
    // Ethiopische birr
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2, "ETB", "Birr"));
    // Euro
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
    // Finse markka
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130, "FIM", "FIM"));
    // Fiji dollar
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2, "FJD", "$"));
    // Falklandeilands pond
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2, "FKP", "£"));
    // Franse franc
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130, "FRF", "FRF"));
    // Brits pond sterling
    result.put("GBP", new CurrencyDataImpl("GBP", "UK£", 2, "GB£", "£"));
    // Georgische kupon larit
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130, "GEK", "GEK"));
    // Georgische lari
    result.put("GEL", new CurrencyDataImpl("GEL", "GEL", 2, "GEL", "GEL"));
    // Ghanese cedi (1979-2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130, "GHC", "GHC"));
    // Ghanese cedi
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2, "GHS", "GHS"));
    // Gibraltarees pond
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2, "GIP", "£"));
    // Gambiaanse dalasi
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2, "GMD", "GMD"));
    // Guinese franc
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0, "GNF", "FG"));
    // Guinese syli
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130, "GNS", "GNS"));
    // Equatoriaal-Guinese ekwele guineana
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130, "GQE", "GQE"));
    // Griekse drachme
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130, "GRD", "GRD"));
    // Guatemalteekse quetzal
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2, "GTQ", "Q"));
    // Portugees-Guinese escudo
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130, "GWE", "GWE"));
    // Guinee-Bissause peso
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 130, "GWP", "GWP"));
    // Guyaanse dollar
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 0, "GYD", "$"));
    // Hongkongse dollar
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$", "$"));
    // Hondurese lempira
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2, "L", "L"));
    // Kroatische dinar
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130, "HRD", "HRD"));
    // Kroatische kuna
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2, "HRK", "kn"));
    // Haïtiaanse gourde
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2, "HTG", "HTG"));
    // Hongaarse forint
    result.put("HUF", new CurrencyDataImpl("HUF", "HUF", 0, "HUF", "Ft"));
    // Indonesische rupiah
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 0, "IDR", "Rp"));
    // Iers pond
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130, "IEP", "IEP"));
    // Israëlisch pond
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130, "ILP", "ILP"));
    // Israëlische nieuwe shekel
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪", "₪"));
    // Indiase rupee
    result.put("INR", new CurrencyDataImpl("INR", "Rs.", 2, "Rs", "₹"));
    // Iraakse dinar
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0, "IQD", "din"));
    // Iraanse rial
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0, "IRR", "Rial"));
    // IJslandse kroon
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 0, "kr", "kr"));
    // Italiaanse lire
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128, "ITL", "ITL"));
    // Jamaicaanse dollar
    result.put("JMD", new CurrencyDataImpl("JMD", "JA$", 2, "JA$", "$"));
    // Jordaanse dinar
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3, "JOD", "din"));
    // Japanse yen
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥", "¥"));
    // Keniaanse shilling
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2, "Ksh", "Ksh"));
    // Kirgizische som
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2, "KGS", "KGS"));
    // Cambodjaanse riel
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2, "KHR", "Riel"));
    // Comorese franc
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0, "KMF", "CF"));
    // Noord-Koreaanse won
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0, "KPW", "₩"));
    // Zuid-Koreaanse won
    result.put("KRW", new CurrencyDataImpl("KRW", "₩", 0, "KR₩", "₩"));
    // Koeweitse dinar
    result.put("KWD", new CurrencyDataImpl("KWD", "KWD", 3, "KWD", "din"));
    // Caymaneilandse dollar
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2, "KYD", "$"));
    // Kazachstaanse tenge
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2, "KZT", "₸"));
    // Laotiaanse kip
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0, "LAK", "₭"));
    // Libanees pond
    result.put("LBP", new CurrencyDataImpl("LBP", "LBP", 0, "LBP", "L£"));
    // Srilankaanse rupee
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs", "Rs"));
    // Liberiaanse dollar
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2, "LRD", "$"));
    // Lesothaanse loti
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2, "LSL", "LSL"));
    // Litouwse litas
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 2, "LTL", "Lt"));
    // Litouwse talonas
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130, "LTT", "LTT"));
    // Luxemburgse convertibele franc
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130, "LUC", "LUC"));
    // Luxemburgse frank
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128, "LUF", "LUF"));
    // Luxemburgse financiële franc
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130, "LUL", "LUL"));
    // Letse lats
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 2, "LVL", "Ls"));
    // Letse roebel
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // Libische dinar
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3, "LYD", "din"));
    // Marokkaanse dirham
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2, "MAD", "MAD"));
    // Marokkaanse franc
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130, "MAF", "MAF"));
    // Moldavische leu
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2, "MDL", "MDL"));
    // Malagassische ariary
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0, "MGA", "Ar"));
    // Malagassische franc
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128, "MGF", "MGF"));
    // Macedonische denar
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2, "MKD", "din"));
    // Malinese franc
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130, "MLF", "MLF"));
    // Myanmarese kyat
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0, "MMK", "K"));
    // Mongoolse tugrik
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 0, "MN₮", "₮"));
    // Macause pataca
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2, "MOP", "MOP"));
    // Mauritaanse ouguiya
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 0, "MRO", "MRO"));
    // Maltese lire
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130, "MTL", "MTL"));
    // Maltees pond
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130, "MTP", "MTP"));
    // Mauritiaanse rupee
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 0, "MUR", "Rs"));
    // Maldivische rufiyaa
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2, "MVR", "MVR"));
    // Malawische kwacha
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2, "MWK", "MWK"));
    // Mexicaanse peso
    result.put("MXN", new CurrencyDataImpl("MXN", "MX$", 2, "Mex$", "$"));
    // Mexicaanse zilveren peso (1861-1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130, "MXP", "MXP"));
    // Mexicaanse unidad de inversion (UDI)
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 130, "MXV", "MXV"));
    // Maleisische ringgit
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM", "RM"));
    // Mozambikaanse escudo
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130, "MZE", "MZE"));
    // Oude Mozambikaanse metical
    result.put("MZM", new CurrencyDataImpl("MZM", "MZM", 130, "MZM", "MZM"));
    // Mozambikaanse metical
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2, "MZN", "MTn"));
    // Namibische dollar
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2, "NAD", "$"));
    // Nigeriaanse naira
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2, "NGN", "₦"));
    // Nicaraguaanse córdoba
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130, "NIC", "NIC"));
    // Nicaraguaanse córdoba oro
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2, "NIO", "C$"));
    // Nederlandse gulden
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130, "NLG", "NLG"));
    // Noorse kroon
    result.put("NOK", new CurrencyDataImpl("NOK", "NOkr", 2, "NOkr", "kr"));
    // Nepalese rupee
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2, "NPR", "Rs"));
    // Nieuw-Zeelandse dollar
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2, "NZ$", "$"));
    // Omaanse rial
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3, "OMR", "Rial"));
    // Panamese balboa
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/.", "B/."));
    // Peruaanse inti
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130, "PEI", "PEI"));
    // Peruaanse nieuwe sol
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/.", "S/."));
    // Peruaanse sol
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130, "PES", "PES"));
    // Papuaanse kina
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2, "PGK", "PGK"));
    // Filipijnse peso
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP", "₱"));
    // Pakistaanse rupee
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 0, "PKRs.", "Rs"));
    // Poolse zloty
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2, "PLN", "zł"));
    // Poolse zloty (1950-1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130, "PLZ", "PLZ"));
    // Portugese escudo
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130, "PTE", "PTE"));
    // Paraguayaanse guarani
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0, "PYG", "Gs"));
    // Qatarese rial
    result.put("QAR", new CurrencyDataImpl("QAR", "QAR", 2, "QAR", "Rial"));
    // Rhodesische dollar
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130, "RHD", "RHD"));
    // Oude Roemeense leu
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130, "ROL", "ROL"));
    // Roemeense leu
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2, "RON", "RON"));
    // Servische dinar
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0, "RSD", "din"));
    // Russische roebel
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // Russische roebel (1991-1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // Rwandese franc
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0, "RWF", "RF"));
    // Saoedische rial
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR", "Rial"));
    // Salomonseilandse dollar
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2, "SBD", "$"));
    // Seychelse rupee
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // Soedanese dinar
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130, "SDD", "SDD"));
    // Soedanese pond
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2, "SDG", "SDG"));
    // Soedanees pond
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130, "SDP", "SDP"));
    // Zweedse kroon
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr", "kr"));
    // Singaporese dollar
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$", "$"));
    // Sint-Heleense pond
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    // Sloveense tolar
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130, "SIT", "SIT"));
    // Slowaakse koruna
    result.put("SKK", new CurrencyDataImpl("SKK", "SKK", 130, "SKK", "SKK"));
    // Sierraleoonse leone
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0, "SLL", "SLL"));
    // Somalische shilling
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0, "SOS", "SOS"));
    // Surinaamse dollar
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2, "SRD", "$"));
    // Surinaamse gulden
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130, "SRG", "SRG"));
    // Santomese dobra
    result.put("STD", new CurrencyDataImpl("STD", "STD", 0, "STD", "Db"));
    // Sovjet-roebel
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130, "SUR", "SUR"));
    // Salvadoraanse colón
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130, "SVC", "SVC"));
    // Syrisch pond
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0, "SYP", "£"));
    // Swazische lilangeni
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2, "SZL", "SZL"));
    // Thaise baht
    result.put("THB", new CurrencyDataImpl("THB", "฿", 2, "THB", "฿"));
    // Tadzjikistaanse roebel
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // Tadzjikistaanse somoni
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2, "TJS", "Som"));
    // Turkmeense manat
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128, "TMM", "TMM"));
    // Turkmeense nieuwe manat
    result.put("TMT", new CurrencyDataImpl("TMT", "TMT", 2, "TMT", "TMT"));
    // Tunesische dinar
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3, "TND", "din"));
    // Tongaanse paʻanga
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2, "TOP", "T$"));
    // Timorese escudo
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130, "TPE", "TPE"));
    // Turkse lire
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128, "TRL", "TRL"));
    // Nieuwe Turkse lire
    result.put("TRY", new CurrencyDataImpl("TRY", "YTL", 2, "YTL", "YTL"));
    // Trinidad en Tobago-dollar
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2, "TTD", "$"));
    // Nieuwe Taiwanese dollar
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$", "NT$"));
    // Tanzaniaanse shilling
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 0, "TZS", "TSh"));
    // Oekraïense hryvnia
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2, "UAH", "₴"));
    // Oekraïense karbovanetz
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130, "UAK", "UAK"));
    // Oegandese shilling (1966-1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130, "UGS", "UGS"));
    // Oegandese shilling
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0, "UGX", "UGX"));
    // Amerikaanse dollar
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$", "$"));
    // Amerikaanse dollar (volgende dag)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 130, "USN", "USN"));
    // Amerikaanse dollar (zelfde dag)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130, "USS", "USS"));
    // Uruguayaanse peso en geïndexeerde eenheden
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 130, "UYI", "UYI"));
    // Uruguayaanse peso (1975-1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130, "UYP", "UYP"));
    // Uruguayaanse peso uruguayo
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$", "$"));
    // Oezbekistaanse sum
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 0, "UZS", "soʼm"));
    // Venezolaanse bolivar
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130, "VEB", "VEB"));
    // Venezolaanse sterke bolivar
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 2, "VEF", "Bs"));
    // Vietnamese dong
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫", "₫"));
    // Vanuatuaanse vatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0, "VUV", "VUV"));
    // West-Samoaanse tala
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2, "WST", "WST"));
    // CFA-franc BEAC
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0, "FCFA", "FCFA"));
    // Zilver
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130, "XAG", "XAG"));
    // Goud
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130, "XAU", "XAU"));
    // Europese samengestelde eenheid
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130, "XBA", "XBA"));
    // Europese monetaire eenheid
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130, "XBB", "XBB"));
    // Europese rekeneenheid (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130, "XBC", "XBC"));
    // Europese rekeneenheid (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130, "XBD", "XBD"));
    // Oost-Caribische dollar
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2, "EC$", "$"));
    // Special Drawing Rights
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130, "XDR", "XDR"));
    // European Currency Unit
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 130, "XEU", "XEU"));
    // Franse gouden franc
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130, "XFO", "XFO"));
    // Franse UIC-franc
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130, "XFU", "XFU"));
    // CFA-franc BCEAO
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0, "CFA", "CFA"));
    // Palladium
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130, "XPD", "XPD"));
    // CFP-franc
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0, "CFPF", "FCFP"));
    // Platina
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130, "XPT", "XPT"));
    // RINET-fondsen
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 130, "XRE", "XRE"));
    // Valutacode voor testdoeleinden
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 130, "XTS", "XTS"));
    // Geen valuta
    result.put("XXX", new CurrencyDataImpl("XXX", "XXX", 130, "XXX", "XXX"));
    // Jemenitische dinar
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130, "YDD", "YDD"));
    // Jemenitische rial
    result.put("YER", new CurrencyDataImpl("YER", "YER", 0, "YER", "Rial"));
    // Joegoslavische harde dinar
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130, "YUD", "YUD"));
    // Joegoslavische noviy-dinar
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130, "YUM", "YUM"));
    // Joegoslavische convertibele dinar
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130, "YUN", "YUN"));
    // Zuid-Afrikaanse rand (financieel)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130, "ZAL", "ZAL"));
    // Zuid-Afrikaanse rand
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR", "R"));
    // Zambiaanse kwacha
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 0, "ZMK", "ZWK"));
    // Zaïrese nieuwe zaïre
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130, "ZRN", "ZRN"));
    // Zaïrese zaïre
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"));
    // Zimbabwaanse dollar
    result.put("ZWD", new CurrencyDataImpl("ZWD", "ZWD", 128, "ZWD", "ZWD"));
    // Zimbabwaanse dollar (2009)
    result.put("ZWL", new CurrencyDataImpl("ZWL", "ZWL", 130, "ZWL", "ZWL"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // Andorrese peseta
      "ADP": [ "ADP", "ADP", 128, "ADP", "ADP"],
      // Verenigde Arabische Emiraten-dirham
      "AED": [ "AED", "DH", 2, "DH", "dh"],
      // Afghani (1927-2002)
      "AFA": [ "AFA", "AFA", 130, "AFA", "AFA"],
      // Afghaanse afghani
      "AFN": [ "AFN", "AFN", 0, "AFN", "Af."],
      // Albanese lek
      "ALL": [ "ALL", "ALL", 0, "ALL", "Lek"],
      // Armeense dram
      "AMD": [ "AMD", "AMD", 0, "AMD", "Dram"],
      // Nederlands-Antilliaanse gulden
      "ANG": [ "ANG", "ANG", 2, "ANG", "ANG"],
      // Angolese kwanza
      "AOA": [ "AOA", "AOA", 2, "AOA", "Kz"],
      // Angolese kwanza (1977-1990)
      "AOK": [ "AOK", "AOK", 130, "AOK", "AOK"],
      // Angolese nieuwe kwanza (1990-2000)
      "AON": [ "AON", "AON", 130, "AON", "AON"],
      // Angolese kwanza reajustado (1995-1999)
      "AOR": [ "AOR", "AOR", 130, "AOR", "AOR"],
      // Argentijnse austral
      "ARA": [ "ARA", "ARA", 130, "ARA", "ARA"],
      // Argentijnse peso (1983-1985)
      "ARP": [ "ARP", "ARP", 130, "ARP", "ARP"],
      // Argentijnse peso
      "ARS": [ "ARS", "AR$", 2, "AR$", "$"],
      // Oostenrijkse schilling
      "ATS": [ "ATS", "ATS", 130, "ATS", "ATS"],
      // Australische dollar
      "AUD": [ "AUD", "AU$", 2, "AU$", "$"],
      // Arubaanse gulden
      "AWG": [ "AWG", "AWG", 2, "AWG", "Afl."],
      // Azerbeidzjaanse manat (1993-2006)
      "AZM": [ "AZM", "AZM", 130, "AZM", "AZM"],
      // Azerbeidzjaanse manat
      "AZN": [ "AZN", "AZN", 2, "AZN", "man."],
      // Bosnische dinar
      "BAD": [ "BAD", "BAD", 130, "BAD", "BAD"],
      // Bosnische convertibele mark
      "BAM": [ "BAM", "BAM", 2, "BAM", "KM"],
      // Barbadaanse dollar
      "BBD": [ "BBD", "BBD", 2, "BBD", "$"],
      // Bengalese taka
      "BDT": [ "BDT", "Tk", 2, "Tk", "৳"],
      // Belgische frank (convertibel)
      "BEC": [ "BEC", "BEC", 130, "BEC", "BEC"],
      // Belgische frank
      "BEF": [ "BEF", "BEF", 130, "BEF", "BEF"],
      // Belgische frank (financieel)
      "BEL": [ "BEL", "BEL", 130, "BEL", "BEL"],
      // Bulgaarse harde lev
      "BGL": [ "BGL", "BGL", 130, "BGL", "BGL"],
      // Bulgaarse nieuwe lev
      "BGN": [ "BGN", "BGN", 2, "BGN", "lev"],
      // Bahreinse dinar
      "BHD": [ "BHD", "BHD", 3, "BHD", "din"],
      // Burundese franc
      "BIF": [ "BIF", "BIF", 0, "BIF", "FBu"],
      // Bermuda-dollar
      "BMD": [ "BMD", "BMD", 2, "BMD", "$"],
      // Bruneise dollar
      "BND": [ "BND", "BND", 2, "BND", "$"],
      // Boliviano
      "BOB": [ "BOB", "BOB", 2, "BOB", "Bs"],
      // Boliviaanse peso
      "BOP": [ "BOP", "BOP", 130, "BOP", "BOP"],
      // Boliviaanse mvdol
      "BOV": [ "BOV", "BOV", 130, "BOV", "BOV"],
      // Braziliaanse cruzeiro novo (1967-1986)
      "BRB": [ "BRB", "BRB", 130, "BRB", "BRB"],
      // Braziliaanse cruzado
      "BRC": [ "BRC", "BRC", 130, "BRC", "BRC"],
      // Braziliaanse cruzeiro (1990-1993)
      "BRE": [ "BRE", "BRE", 130, "BRE", "BRE"],
      // Braziliaanse real
      "BRL": [ "BRL", "R$", 2, "R$", "R$"],
      // Braziliaanse cruzado novo
      "BRN": [ "BRN", "BRN", 130, "BRN", "BRN"],
      // Braziliaanse cruzeiro
      "BRR": [ "BRR", "BRR", 130, "BRR", "BRR"],
      // Bahamaanse dollar
      "BSD": [ "BSD", "BSD", 2, "BSD", "$"],
      // Bhutaanse ngultrum
      "BTN": [ "BTN", "BTN", 2, "BTN", "Nu."],
      // Birmese kyat
      "BUK": [ "BUK", "BUK", 130, "BUK", "BUK"],
      // Botswaanse pula
      "BWP": [ "BWP", "BWP", 2, "BWP", "P"],
      // Wit-Russische nieuwe roebel (1994-1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // Wit-Russische roebel
      "BYR": [ "BYR", "BYR", 0, "BYR", "BYR"],
      // Belizaanse dollar
      "BZD": [ "BZD", "BZD", 2, "BZD", "$"],
      // Canadese dollar
      "CAD": [ "CAD", "CA$", 2, "C$", "$"],
      // Congolese franc
      "CDF": [ "CDF", "CDF", 2, "CDF", "FrCD"],
      // WIR euro
      "CHE": [ "CHE", "CHE", 130, "CHE", "CHE"],
      // Zwitserse franc
      "CHF": [ "CHF", "CHF", 2, "CHF", "CHF"],
      // WIR franc
      "CHW": [ "CHW", "CHW", 130, "CHW", "CHW"],
      // Chileense unidades de fomento
      "CLF": [ "CLF", "CLF", 128, "CLF", "CLF"],
      // Chileense peso
      "CLP": [ "CLP", "CL$", 0, "CL$", "$"],
      // Chinese yuan renminbi
      "CNY": [ "CNY", "CN¥", 2, "RMB¥", "¥"],
      // Colombiaanse peso
      "COP": [ "COP", "COL$", 0, "COL$", "$"],
      // Unidad de Valor Real
      "COU": [ "COU", "COU", 130, "COU", "COU"],
      // Costaricaanse colón
      "CRC": [ "CRC", "CR₡", 0, "CR₡", "₡"],
      // Oude Servische dinar
      "CSD": [ "CSD", "CSD", 130, "CSD", "CSD"],
      // Tsjechoslowaakse harde koruna
      "CSK": [ "CSK", "CSK", 130, "CSK", "CSK"],
      // Cubaanse convertibele peso
      "CUC": [ "CUC", "CUC", 2, "CUC", "$"],
      // Cubaanse peso
      "CUP": [ "CUP", "$MN", 2, "$MN", "$"],
      // Kaapverdische escudo
      "CVE": [ "CVE", "CVE", 2, "CVE", "CVE"],
      // Cyprisch pond
      "CYP": [ "CYP", "CYP", 130, "CYP", "CYP"],
      // Tsjechische koruna
      "CZK": [ "CZK", "Kč", 2, "Kč", "Kč"],
      // Oost-Duitse ostmark
      "DDM": [ "DDM", "DDM", 130, "DDM", "DDM"],
      // Duitse mark
      "DEM": [ "DEM", "DEM", 130, "DEM", "DEM"],
      // Djiboutiaanse franc
      "DJF": [ "DJF", "Fdj", 0, "Fdj", "Fdj"],
      // Deense kroon
      "DKK": [ "DKK", "kr", 2, "kr", "kr"],
      // Dominicaanse peso
      "DOP": [ "DOP", "RD$", 2, "RD$", "$"],
      // Algerijnse dinar
      "DZD": [ "DZD", "DZD", 2, "DZD", "din"],
      // Ecuadoraanse sucre
      "ECS": [ "ECS", "ECS", 130, "ECS", "ECS"],
      // Ecuadoraanse unidad de valor constante (UVC)
      "ECV": [ "ECV", "ECV", 130, "ECV", "ECV"],
      // Estlandse kroon
      "EEK": [ "EEK", "EEK", 130, "EEK", "EEK"],
      // Egyptisch pond
      "EGP": [ "EGP", "LE", 2, "LE", "E£"],
      // Eritrese nakfa
      "ERN": [ "ERN", "ERN", 2, "ERN", "Nfk"],
      // Spaanse peseta (account A)
      "ESA": [ "ESA", "ESA", 130, "ESA", "ESA"],
      // Spaanse peseta (convertibele account)
      "ESB": [ "ESB", "ESB", 130, "ESB", "ESB"],
      // Spaanse peseta
      "ESP": [ "ESP", "ESP", 128, "ESP", "ESP"],
      // Ethiopische birr
      "ETB": [ "ETB", "ETB", 2, "ETB", "Birr"],
      // Euro
      "EUR": [ "EUR", "€", 2, "€", "€"],
      // Finse markka
      "FIM": [ "FIM", "FIM", 130, "FIM", "FIM"],
      // Fiji dollar
      "FJD": [ "FJD", "FJD", 2, "FJD", "$"],
      // Falklandeilands pond
      "FKP": [ "FKP", "FKP", 2, "FKP", "£"],
      // Franse franc
      "FRF": [ "FRF", "FRF", 130, "FRF", "FRF"],
      // Brits pond sterling
      "GBP": [ "GBP", "UK£", 2, "GB£", "£"],
      // Georgische kupon larit
      "GEK": [ "GEK", "GEK", 130, "GEK", "GEK"],
      // Georgische lari
      "GEL": [ "GEL", "GEL", 2, "GEL", "GEL"],
      // Ghanese cedi (1979-2007)
      "GHC": [ "GHC", "GHC", 130, "GHC", "GHC"],
      // Ghanese cedi
      "GHS": [ "GHS", "GHS", 2, "GHS", "GHS"],
      // Gibraltarees pond
      "GIP": [ "GIP", "GIP", 2, "GIP", "£"],
      // Gambiaanse dalasi
      "GMD": [ "GMD", "GMD", 2, "GMD", "GMD"],
      // Guinese franc
      "GNF": [ "GNF", "GNF", 0, "GNF", "FG"],
      // Guinese syli
      "GNS": [ "GNS", "GNS", 130, "GNS", "GNS"],
      // Equatoriaal-Guinese ekwele guineana
      "GQE": [ "GQE", "GQE", 130, "GQE", "GQE"],
      // Griekse drachme
      "GRD": [ "GRD", "GRD", 130, "GRD", "GRD"],
      // Guatemalteekse quetzal
      "GTQ": [ "GTQ", "GTQ", 2, "GTQ", "Q"],
      // Portugees-Guinese escudo
      "GWE": [ "GWE", "GWE", 130, "GWE", "GWE"],
      // Guinee-Bissause peso
      "GWP": [ "GWP", "GWP", 130, "GWP", "GWP"],
      // Guyaanse dollar
      "GYD": [ "GYD", "GYD", 0, "GYD", "$"],
      // Hongkongse dollar
      "HKD": [ "HKD", "HK$", 2, "HK$", "$"],
      // Hondurese lempira
      "HNL": [ "HNL", "L", 2, "L", "L"],
      // Kroatische dinar
      "HRD": [ "HRD", "HRD", 130, "HRD", "HRD"],
      // Kroatische kuna
      "HRK": [ "HRK", "HRK", 2, "HRK", "kn"],
      // Haïtiaanse gourde
      "HTG": [ "HTG", "HTG", 2, "HTG", "HTG"],
      // Hongaarse forint
      "HUF": [ "HUF", "HUF", 0, "HUF", "Ft"],
      // Indonesische rupiah
      "IDR": [ "IDR", "IDR", 0, "IDR", "Rp"],
      // Iers pond
      "IEP": [ "IEP", "IEP", 130, "IEP", "IEP"],
      // Israëlisch pond
      "ILP": [ "ILP", "ILP", 130, "ILP", "ILP"],
      // Israëlische nieuwe shekel
      "ILS": [ "ILS", "₪", 2, "IL₪", "₪"],
      // Indiase rupee
      "INR": [ "INR", "Rs.", 2, "Rs", "₹"],
      // Iraakse dinar
      "IQD": [ "IQD", "IQD", 0, "IQD", "din"],
      // Iraanse rial
      "IRR": [ "IRR", "IRR", 0, "IRR", "Rial"],
      // IJslandse kroon
      "ISK": [ "ISK", "kr", 0, "kr", "kr"],
      // Italiaanse lire
      "ITL": [ "ITL", "ITL", 128, "ITL", "ITL"],
      // Jamaicaanse dollar
      "JMD": [ "JMD", "JA$", 2, "JA$", "$"],
      // Jordaanse dinar
      "JOD": [ "JOD", "JOD", 3, "JOD", "din"],
      // Japanse yen
      "JPY": [ "JPY", "JP¥", 0, "JP¥", "¥"],
      // Keniaanse shilling
      "KES": [ "KES", "Ksh", 2, "Ksh", "Ksh"],
      // Kirgizische som
      "KGS": [ "KGS", "KGS", 2, "KGS", "KGS"],
      // Cambodjaanse riel
      "KHR": [ "KHR", "KHR", 2, "KHR", "Riel"],
      // Comorese franc
      "KMF": [ "KMF", "KMF", 0, "KMF", "CF"],
      // Noord-Koreaanse won
      "KPW": [ "KPW", "KPW", 0, "KPW", "₩"],
      // Zuid-Koreaanse won
      "KRW": [ "KRW", "₩", 0, "KR₩", "₩"],
      // Koeweitse dinar
      "KWD": [ "KWD", "KWD", 3, "KWD", "din"],
      // Caymaneilandse dollar
      "KYD": [ "KYD", "KYD", 2, "KYD", "$"],
      // Kazachstaanse tenge
      "KZT": [ "KZT", "KZT", 2, "KZT", "₸"],
      // Laotiaanse kip
      "LAK": [ "LAK", "LAK", 0, "LAK", "₭"],
      // Libanees pond
      "LBP": [ "LBP", "LBP", 0, "LBP", "L£"],
      // Srilankaanse rupee
      "LKR": [ "LKR", "SLRs", 2, "SLRs", "Rs"],
      // Liberiaanse dollar
      "LRD": [ "LRD", "LRD", 2, "LRD", "$"],
      // Lesothaanse loti
      "LSL": [ "LSL", "LSL", 2, "LSL", "LSL"],
      // Litouwse litas
      "LTL": [ "LTL", "LTL", 2, "LTL", "Lt"],
      // Litouwse talonas
      "LTT": [ "LTT", "LTT", 130, "LTT", "LTT"],
      // Luxemburgse convertibele franc
      "LUC": [ "LUC", "LUC", 130, "LUC", "LUC"],
      // Luxemburgse frank
      "LUF": [ "LUF", "LUF", 128, "LUF", "LUF"],
      // Luxemburgse financiële franc
      "LUL": [ "LUL", "LUL", 130, "LUL", "LUL"],
      // Letse lats
      "LVL": [ "LVL", "LVL", 2, "LVL", "Ls"],
      // Letse roebel
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // Libische dinar
      "LYD": [ "LYD", "LYD", 3, "LYD", "din"],
      // Marokkaanse dirham
      "MAD": [ "MAD", "MAD", 2, "MAD", "MAD"],
      // Marokkaanse franc
      "MAF": [ "MAF", "MAF", 130, "MAF", "MAF"],
      // Moldavische leu
      "MDL": [ "MDL", "MDL", 2, "MDL", "MDL"],
      // Malagassische ariary
      "MGA": [ "MGA", "MGA", 0, "MGA", "Ar"],
      // Malagassische franc
      "MGF": [ "MGF", "MGF", 128, "MGF", "MGF"],
      // Macedonische denar
      "MKD": [ "MKD", "MKD", 2, "MKD", "din"],
      // Malinese franc
      "MLF": [ "MLF", "MLF", 130, "MLF", "MLF"],
      // Myanmarese kyat
      "MMK": [ "MMK", "MMK", 0, "MMK", "K"],
      // Mongoolse tugrik
      "MNT": [ "MNT", "MN₮", 0, "MN₮", "₮"],
      // Macause pataca
      "MOP": [ "MOP", "MOP", 2, "MOP", "MOP"],
      // Mauritaanse ouguiya
      "MRO": [ "MRO", "MRO", 0, "MRO", "MRO"],
      // Maltese lire
      "MTL": [ "MTL", "MTL", 130, "MTL", "MTL"],
      // Maltees pond
      "MTP": [ "MTP", "MTP", 130, "MTP", "MTP"],
      // Mauritiaanse rupee
      "MUR": [ "MUR", "MUR", 0, "MUR", "Rs"],
      // Maldivische rufiyaa
      "MVR": [ "MVR", "MVR", 2, "MVR", "MVR"],
      // Malawische kwacha
      "MWK": [ "MWK", "MWK", 2, "MWK", "MWK"],
      // Mexicaanse peso
      "MXN": [ "MXN", "MX$", 2, "Mex$", "$"],
      // Mexicaanse zilveren peso (1861-1992)
      "MXP": [ "MXP", "MXP", 130, "MXP", "MXP"],
      // Mexicaanse unidad de inversion (UDI)
      "MXV": [ "MXV", "MXV", 130, "MXV", "MXV"],
      // Maleisische ringgit
      "MYR": [ "MYR", "RM", 2, "RM", "RM"],
      // Mozambikaanse escudo
      "MZE": [ "MZE", "MZE", 130, "MZE", "MZE"],
      // Oude Mozambikaanse metical
      "MZM": [ "MZM", "MZM", 130, "MZM", "MZM"],
      // Mozambikaanse metical
      "MZN": [ "MZN", "MZN", 2, "MZN", "MTn"],
      // Namibische dollar
      "NAD": [ "NAD", "NAD", 2, "NAD", "$"],
      // Nigeriaanse naira
      "NGN": [ "NGN", "NGN", 2, "NGN", "₦"],
      // Nicaraguaanse córdoba
      "NIC": [ "NIC", "NIC", 130, "NIC", "NIC"],
      // Nicaraguaanse córdoba oro
      "NIO": [ "NIO", "NIO", 2, "NIO", "C$"],
      // Nederlandse gulden
      "NLG": [ "NLG", "NLG", 130, "NLG", "NLG"],
      // Noorse kroon
      "NOK": [ "NOK", "NOkr", 2, "NOkr", "kr"],
      // Nepalese rupee
      "NPR": [ "NPR", "NPR", 2, "NPR", "Rs"],
      // Nieuw-Zeelandse dollar
      "NZD": [ "NZD", "NZ$", 2, "NZ$", "$"],
      // Omaanse rial
      "OMR": [ "OMR", "OMR", 3, "OMR", "Rial"],
      // Panamese balboa
      "PAB": [ "PAB", "B/.", 2, "B/.", "B/."],
      // Peruaanse inti
      "PEI": [ "PEI", "PEI", 130, "PEI", "PEI"],
      // Peruaanse nieuwe sol
      "PEN": [ "PEN", "S/.", 2, "S/.", "S/."],
      // Peruaanse sol
      "PES": [ "PES", "PES", 130, "PES", "PES"],
      // Papuaanse kina
      "PGK": [ "PGK", "PGK", 2, "PGK", "PGK"],
      // Filipijnse peso
      "PHP": [ "PHP", "PHP", 2, "PHP", "₱"],
      // Pakistaanse rupee
      "PKR": [ "PKR", "PKRs.", 0, "PKRs.", "Rs"],
      // Poolse zloty
      "PLN": [ "PLN", "PLN", 2, "PLN", "zł"],
      // Poolse zloty (1950-1995)
      "PLZ": [ "PLZ", "PLZ", 130, "PLZ", "PLZ"],
      // Portugese escudo
      "PTE": [ "PTE", "PTE", 130, "PTE", "PTE"],
      // Paraguayaanse guarani
      "PYG": [ "PYG", "PYG", 0, "PYG", "Gs"],
      // Qatarese rial
      "QAR": [ "QAR", "QAR", 2, "QAR", "Rial"],
      // Rhodesische dollar
      "RHD": [ "RHD", "RHD", 130, "RHD", "RHD"],
      // Oude Roemeense leu
      "ROL": [ "ROL", "ROL", 130, "ROL", "ROL"],
      // Roemeense leu
      "RON": [ "RON", "RON", 2, "RON", "RON"],
      // Servische dinar
      "RSD": [ "RSD", "RSD", 0, "RSD", "din"],
      // Russische roebel
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // Russische roebel (1991-1998)
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // Rwandese franc
      "RWF": [ "RWF", "RWF", 0, "RWF", "RF"],
      // Saoedische rial
      "SAR": [ "SAR", "SR", 2, "SR", "Rial"],
      // Salomonseilandse dollar
      "SBD": [ "SBD", "SBD", 2, "SBD", "$"],
      // Seychelse rupee
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // Soedanese dinar
      "SDD": [ "SDD", "SDD", 130, "SDD", "SDD"],
      // Soedanese pond
      "SDG": [ "SDG", "SDG", 2, "SDG", "SDG"],
      // Soedanees pond
      "SDP": [ "SDP", "SDP", 130, "SDP", "SDP"],
      // Zweedse kroon
      "SEK": [ "SEK", "kr", 2, "kr", "kr"],
      // Singaporese dollar
      "SGD": [ "SGD", "S$", 2, "S$", "$"],
      // Sint-Heleense pond
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
      // Sloveense tolar
      "SIT": [ "SIT", "SIT", 130, "SIT", "SIT"],
      // Slowaakse koruna
      "SKK": [ "SKK", "SKK", 130, "SKK", "SKK"],
      // Sierraleoonse leone
      "SLL": [ "SLL", "SLL", 0, "SLL", "SLL"],
      // Somalische shilling
      "SOS": [ "SOS", "SOS", 0, "SOS", "SOS"],
      // Surinaamse dollar
      "SRD": [ "SRD", "SRD", 2, "SRD", "$"],
      // Surinaamse gulden
      "SRG": [ "SRG", "SRG", 130, "SRG", "SRG"],
      // Santomese dobra
      "STD": [ "STD", "STD", 0, "STD", "Db"],
      // Sovjet-roebel
      "SUR": [ "SUR", "SUR", 130, "SUR", "SUR"],
      // Salvadoraanse colón
      "SVC": [ "SVC", "SVC", 130, "SVC", "SVC"],
      // Syrisch pond
      "SYP": [ "SYP", "SYP", 0, "SYP", "£"],
      // Swazische lilangeni
      "SZL": [ "SZL", "SZL", 2, "SZL", "SZL"],
      // Thaise baht
      "THB": [ "THB", "฿", 2, "THB", "฿"],
      // Tadzjikistaanse roebel
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // Tadzjikistaanse somoni
      "TJS": [ "TJS", "TJS", 2, "TJS", "Som"],
      // Turkmeense manat
      "TMM": [ "TMM", "TMM", 128, "TMM", "TMM"],
      // Turkmeense nieuwe manat
      "TMT": [ "TMT", "TMT", 2, "TMT", "TMT"],
      // Tunesische dinar
      "TND": [ "TND", "TND", 3, "TND", "din"],
      // Tongaanse paʻanga
      "TOP": [ "TOP", "TOP", 2, "TOP", "T$"],
      // Timorese escudo
      "TPE": [ "TPE", "TPE", 130, "TPE", "TPE"],
      // Turkse lire
      "TRL": [ "TRL", "TRL", 128, "TRL", "TRL"],
      // Nieuwe Turkse lire
      "TRY": [ "TRY", "YTL", 2, "YTL", "YTL"],
      // Trinidad en Tobago-dollar
      "TTD": [ "TTD", "TTD", 2, "TTD", "$"],
      // Nieuwe Taiwanese dollar
      "TWD": [ "TWD", "NT$", 2, "NT$", "NT$"],
      // Tanzaniaanse shilling
      "TZS": [ "TZS", "TZS", 0, "TZS", "TSh"],
      // Oekraïense hryvnia
      "UAH": [ "UAH", "UAH", 2, "UAH", "₴"],
      // Oekraïense karbovanetz
      "UAK": [ "UAK", "UAK", 130, "UAK", "UAK"],
      // Oegandese shilling (1966-1987)
      "UGS": [ "UGS", "UGS", 130, "UGS", "UGS"],
      // Oegandese shilling
      "UGX": [ "UGX", "UGX", 0, "UGX", "UGX"],
      // Amerikaanse dollar
      "USD": [ "USD", "US$", 2, "US$", "$"],
      // Amerikaanse dollar (volgende dag)
      "USN": [ "USN", "USN", 130, "USN", "USN"],
      // Amerikaanse dollar (zelfde dag)
      "USS": [ "USS", "USS", 130, "USS", "USS"],
      // Uruguayaanse peso en geïndexeerde eenheden
      "UYI": [ "UYI", "UYI", 130, "UYI", "UYI"],
      // Uruguayaanse peso (1975-1993)
      "UYP": [ "UYP", "UYP", 130, "UYP", "UYP"],
      // Uruguayaanse peso uruguayo
      "UYU": [ "UYU", "UY$", 2, "UY$", "$"],
      // Oezbekistaanse sum
      "UZS": [ "UZS", "UZS", 0, "UZS", "soʼm"],
      // Venezolaanse bolivar
      "VEB": [ "VEB", "VEB", 130, "VEB", "VEB"],
      // Venezolaanse sterke bolivar
      "VEF": [ "VEF", "VEF", 2, "VEF", "Bs"],
      // Vietnamese dong
      "VND": [ "VND", "₫", 24, "₫", "₫"],
      // Vanuatuaanse vatu
      "VUV": [ "VUV", "VUV", 0, "VUV", "VUV"],
      // West-Samoaanse tala
      "WST": [ "WST", "WST", 2, "WST", "WST"],
      // CFA-franc BEAC
      "XAF": [ "XAF", "FCFA", 0, "FCFA", "FCFA"],
      // Zilver
      "XAG": [ "XAG", "XAG", 130, "XAG", "XAG"],
      // Goud
      "XAU": [ "XAU", "XAU", 130, "XAU", "XAU"],
      // Europese samengestelde eenheid
      "XBA": [ "XBA", "XBA", 130, "XBA", "XBA"],
      // Europese monetaire eenheid
      "XBB": [ "XBB", "XBB", 130, "XBB", "XBB"],
      // Europese rekeneenheid (XBC)
      "XBC": [ "XBC", "XBC", 130, "XBC", "XBC"],
      // Europese rekeneenheid (XBD)
      "XBD": [ "XBD", "XBD", 130, "XBD", "XBD"],
      // Oost-Caribische dollar
      "XCD": [ "XCD", "EC$", 2, "EC$", "$"],
      // Special Drawing Rights
      "XDR": [ "XDR", "XDR", 130, "XDR", "XDR"],
      // European Currency Unit
      "XEU": [ "XEU", "XEU", 130, "XEU", "XEU"],
      // Franse gouden franc
      "XFO": [ "XFO", "XFO", 130, "XFO", "XFO"],
      // Franse UIC-franc
      "XFU": [ "XFU", "XFU", 130, "XFU", "XFU"],
      // CFA-franc BCEAO
      "XOF": [ "XOF", "CFA", 0, "CFA", "CFA"],
      // Palladium
      "XPD": [ "XPD", "XPD", 130, "XPD", "XPD"],
      // CFP-franc
      "XPF": [ "XPF", "CFPF", 0, "CFPF", "FCFP"],
      // Platina
      "XPT": [ "XPT", "XPT", 130, "XPT", "XPT"],
      // RINET-fondsen
      "XRE": [ "XRE", "XRE", 130, "XRE", "XRE"],
      // Valutacode voor testdoeleinden
      "XTS": [ "XTS", "XTS", 130, "XTS", "XTS"],
      // Geen valuta
      "XXX": [ "XXX", "XXX", 130, "XXX", "XXX"],
      // Jemenitische dinar
      "YDD": [ "YDD", "YDD", 130, "YDD", "YDD"],
      // Jemenitische rial
      "YER": [ "YER", "YER", 0, "YER", "Rial"],
      // Joegoslavische harde dinar
      "YUD": [ "YUD", "YUD", 130, "YUD", "YUD"],
      // Joegoslavische noviy-dinar
      "YUM": [ "YUM", "YUM", 130, "YUM", "YUM"],
      // Joegoslavische convertibele dinar
      "YUN": [ "YUN", "YUN", 130, "YUN", "YUN"],
      // Zuid-Afrikaanse rand (financieel)
      "ZAL": [ "ZAL", "ZAL", 130, "ZAL", "ZAL"],
      // Zuid-Afrikaanse rand
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR", "R"],
      // Zambiaanse kwacha
      "ZMK": [ "ZMK", "ZMK", 0, "ZMK", "ZWK"],
      // Zaïrese nieuwe zaïre
      "ZRN": [ "ZRN", "ZRN", 130, "ZRN", "ZRN"],
      // Zaïrese zaïre
      "ZRZ": [ "ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"],
      // Zimbabwaanse dollar
      "ZWD": [ "ZWD", "ZWD", 128, "ZWD", "ZWD"],
      // Zimbabwaanse dollar (2009)
      "ZWL": [ "ZWL", "ZWL", 130, "ZWL", "ZWL"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "Andorrese peseta");
    result.put("AED", "Verenigde Arabische Emiraten-dirham");
    result.put("AFA", "Afghani (1927-2002)");
    result.put("AFN", "Afghaanse afghani");
    result.put("ALL", "Albanese lek");
    result.put("AMD", "Armeense dram");
    result.put("ANG", "Nederlands-Antilliaanse gulden");
    result.put("AOA", "Angolese kwanza");
    result.put("AOK", "Angolese kwanza (1977-1990)");
    result.put("AON", "Angolese nieuwe kwanza (1990-2000)");
    result.put("AOR", "Angolese kwanza reajustado (1995-1999)");
    result.put("ARA", "Argentijnse austral");
    result.put("ARP", "Argentijnse peso (1983-1985)");
    result.put("ARS", "Argentijnse peso");
    result.put("ATS", "Oostenrijkse schilling");
    result.put("AUD", "Australische dollar");
    result.put("AWG", "Arubaanse gulden");
    result.put("AZM", "Azerbeidzjaanse manat (1993-2006)");
    result.put("AZN", "Azerbeidzjaanse manat");
    result.put("BAD", "Bosnische dinar");
    result.put("BAM", "Bosnische convertibele mark");
    result.put("BBD", "Barbadaanse dollar");
    result.put("BDT", "Bengalese taka");
    result.put("BEC", "Belgische frank (convertibel)");
    result.put("BEF", "Belgische frank");
    result.put("BEL", "Belgische frank (financieel)");
    result.put("BGL", "Bulgaarse harde lev");
    result.put("BGN", "Bulgaarse nieuwe lev");
    result.put("BHD", "Bahreinse dinar");
    result.put("BIF", "Burundese franc");
    result.put("BMD", "Bermuda-dollar");
    result.put("BND", "Bruneise dollar");
    result.put("BOB", "Boliviano");
    result.put("BOP", "Boliviaanse peso");
    result.put("BOV", "Boliviaanse mvdol");
    result.put("BRB", "Braziliaanse cruzeiro novo (1967-1986)");
    result.put("BRC", "Braziliaanse cruzado");
    result.put("BRE", "Braziliaanse cruzeiro (1990-1993)");
    result.put("BRL", "Braziliaanse real");
    result.put("BRN", "Braziliaanse cruzado novo");
    result.put("BRR", "Braziliaanse cruzeiro");
    result.put("BSD", "Bahamaanse dollar");
    result.put("BTN", "Bhutaanse ngultrum");
    result.put("BUK", "Birmese kyat");
    result.put("BWP", "Botswaanse pula");
    result.put("BYB", "Wit-Russische nieuwe roebel (1994-1999)");
    result.put("BYR", "Wit-Russische roebel");
    result.put("BZD", "Belizaanse dollar");
    result.put("CAD", "Canadese dollar");
    result.put("CDF", "Congolese franc");
    result.put("CHE", "WIR euro");
    result.put("CHF", "Zwitserse franc");
    result.put("CHW", "WIR franc");
    result.put("CLF", "Chileense unidades de fomento");
    result.put("CLP", "Chileense peso");
    result.put("CNY", "Chinese yuan renminbi");
    result.put("COP", "Colombiaanse peso");
    result.put("COU", "Unidad de Valor Real");
    result.put("CRC", "Costaricaanse colón");
    result.put("CSD", "Oude Servische dinar");
    result.put("CSK", "Tsjechoslowaakse harde koruna");
    result.put("CUC", "Cubaanse convertibele peso");
    result.put("CUP", "Cubaanse peso");
    result.put("CVE", "Kaapverdische escudo");
    result.put("CYP", "Cyprisch pond");
    result.put("CZK", "Tsjechische koruna");
    result.put("DDM", "Oost-Duitse ostmark");
    result.put("DEM", "Duitse mark");
    result.put("DJF", "Djiboutiaanse franc");
    result.put("DKK", "Deense kroon");
    result.put("DOP", "Dominicaanse peso");
    result.put("DZD", "Algerijnse dinar");
    result.put("ECS", "Ecuadoraanse sucre");
    result.put("ECV", "Ecuadoraanse unidad de valor constante (UVC)");
    result.put("EEK", "Estlandse kroon");
    result.put("EGP", "Egyptisch pond");
    result.put("ERN", "Eritrese nakfa");
    result.put("ESA", "Spaanse peseta (account A)");
    result.put("ESB", "Spaanse peseta (convertibele account)");
    result.put("ESP", "Spaanse peseta");
    result.put("ETB", "Ethiopische birr");
    result.put("EUR", "Euro");
    result.put("FIM", "Finse markka");
    result.put("FJD", "Fiji dollar");
    result.put("FKP", "Falklandeilands pond");
    result.put("FRF", "Franse franc");
    result.put("GBP", "Brits pond sterling");
    result.put("GEK", "Georgische kupon larit");
    result.put("GEL", "Georgische lari");
    result.put("GHC", "Ghanese cedi (1979-2007)");
    result.put("GHS", "Ghanese cedi");
    result.put("GIP", "Gibraltarees pond");
    result.put("GMD", "Gambiaanse dalasi");
    result.put("GNF", "Guinese franc");
    result.put("GNS", "Guinese syli");
    result.put("GQE", "Equatoriaal-Guinese ekwele guineana");
    result.put("GRD", "Griekse drachme");
    result.put("GTQ", "Guatemalteekse quetzal");
    result.put("GWE", "Portugees-Guinese escudo");
    result.put("GWP", "Guinee-Bissause peso");
    result.put("GYD", "Guyaanse dollar");
    result.put("HKD", "Hongkongse dollar");
    result.put("HNL", "Hondurese lempira");
    result.put("HRD", "Kroatische dinar");
    result.put("HRK", "Kroatische kuna");
    result.put("HTG", "Haïtiaanse gourde");
    result.put("HUF", "Hongaarse forint");
    result.put("IDR", "Indonesische rupiah");
    result.put("IEP", "Iers pond");
    result.put("ILP", "Israëlisch pond");
    result.put("ILS", "Israëlische nieuwe shekel");
    result.put("INR", "Indiase rupee");
    result.put("IQD", "Iraakse dinar");
    result.put("IRR", "Iraanse rial");
    result.put("ISK", "IJslandse kroon");
    result.put("ITL", "Italiaanse lire");
    result.put("JMD", "Jamaicaanse dollar");
    result.put("JOD", "Jordaanse dinar");
    result.put("JPY", "Japanse yen");
    result.put("KES", "Keniaanse shilling");
    result.put("KGS", "Kirgizische som");
    result.put("KHR", "Cambodjaanse riel");
    result.put("KMF", "Comorese franc");
    result.put("KPW", "Noord-Koreaanse won");
    result.put("KRW", "Zuid-Koreaanse won");
    result.put("KWD", "Koeweitse dinar");
    result.put("KYD", "Caymaneilandse dollar");
    result.put("KZT", "Kazachstaanse tenge");
    result.put("LAK", "Laotiaanse kip");
    result.put("LBP", "Libanees pond");
    result.put("LKR", "Srilankaanse rupee");
    result.put("LRD", "Liberiaanse dollar");
    result.put("LSL", "Lesothaanse loti");
    result.put("LTL", "Litouwse litas");
    result.put("LTT", "Litouwse talonas");
    result.put("LUC", "Luxemburgse convertibele franc");
    result.put("LUF", "Luxemburgse frank");
    result.put("LUL", "Luxemburgse financiële franc");
    result.put("LVL", "Letse lats");
    result.put("LVR", "Letse roebel");
    result.put("LYD", "Libische dinar");
    result.put("MAD", "Marokkaanse dirham");
    result.put("MAF", "Marokkaanse franc");
    result.put("MDL", "Moldavische leu");
    result.put("MGA", "Malagassische ariary");
    result.put("MGF", "Malagassische franc");
    result.put("MKD", "Macedonische denar");
    result.put("MLF", "Malinese franc");
    result.put("MMK", "Myanmarese kyat");
    result.put("MNT", "Mongoolse tugrik");
    result.put("MOP", "Macause pataca");
    result.put("MRO", "Mauritaanse ouguiya");
    result.put("MTL", "Maltese lire");
    result.put("MTP", "Maltees pond");
    result.put("MUR", "Mauritiaanse rupee");
    result.put("MVR", "Maldivische rufiyaa");
    result.put("MWK", "Malawische kwacha");
    result.put("MXN", "Mexicaanse peso");
    result.put("MXP", "Mexicaanse zilveren peso (1861-1992)");
    result.put("MXV", "Mexicaanse unidad de inversion (UDI)");
    result.put("MYR", "Maleisische ringgit");
    result.put("MZE", "Mozambikaanse escudo");
    result.put("MZM", "Oude Mozambikaanse metical");
    result.put("MZN", "Mozambikaanse metical");
    result.put("NAD", "Namibische dollar");
    result.put("NGN", "Nigeriaanse naira");
    result.put("NIC", "Nicaraguaanse córdoba");
    result.put("NIO", "Nicaraguaanse córdoba oro");
    result.put("NLG", "Nederlandse gulden");
    result.put("NOK", "Noorse kroon");
    result.put("NPR", "Nepalese rupee");
    result.put("NZD", "Nieuw-Zeelandse dollar");
    result.put("OMR", "Omaanse rial");
    result.put("PAB", "Panamese balboa");
    result.put("PEI", "Peruaanse inti");
    result.put("PEN", "Peruaanse nieuwe sol");
    result.put("PES", "Peruaanse sol");
    result.put("PGK", "Papuaanse kina");
    result.put("PHP", "Filipijnse peso");
    result.put("PKR", "Pakistaanse rupee");
    result.put("PLN", "Poolse zloty");
    result.put("PLZ", "Poolse zloty (1950-1995)");
    result.put("PTE", "Portugese escudo");
    result.put("PYG", "Paraguayaanse guarani");
    result.put("QAR", "Qatarese rial");
    result.put("RHD", "Rhodesische dollar");
    result.put("ROL", "Oude Roemeense leu");
    result.put("RON", "Roemeense leu");
    result.put("RSD", "Servische dinar");
    result.put("RUB", "Russische roebel");
    result.put("RUR", "Russische roebel (1991-1998)");
    result.put("RWF", "Rwandese franc");
    result.put("SAR", "Saoedische rial");
    result.put("SBD", "Salomonseilandse dollar");
    result.put("SCR", "Seychelse rupee");
    result.put("SDD", "Soedanese dinar");
    result.put("SDG", "Soedanese pond");
    result.put("SDP", "Soedanees pond");
    result.put("SEK", "Zweedse kroon");
    result.put("SGD", "Singaporese dollar");
    result.put("SHP", "Sint-Heleense pond");
    result.put("SIT", "Sloveense tolar");
    result.put("SKK", "Slowaakse koruna");
    result.put("SLL", "Sierraleoonse leone");
    result.put("SOS", "Somalische shilling");
    result.put("SRD", "Surinaamse dollar");
    result.put("SRG", "Surinaamse gulden");
    result.put("STD", "Santomese dobra");
    result.put("SUR", "Sovjet-roebel");
    result.put("SVC", "Salvadoraanse colón");
    result.put("SYP", "Syrisch pond");
    result.put("SZL", "Swazische lilangeni");
    result.put("THB", "Thaise baht");
    result.put("TJR", "Tadzjikistaanse roebel");
    result.put("TJS", "Tadzjikistaanse somoni");
    result.put("TMM", "Turkmeense manat");
    result.put("TMT", "Turkmeense nieuwe manat");
    result.put("TND", "Tunesische dinar");
    result.put("TOP", "Tongaanse paʻanga");
    result.put("TPE", "Timorese escudo");
    result.put("TRL", "Turkse lire");
    result.put("TRY", "Nieuwe Turkse lire");
    result.put("TTD", "Trinidad en Tobago-dollar");
    result.put("TWD", "Nieuwe Taiwanese dollar");
    result.put("TZS", "Tanzaniaanse shilling");
    result.put("UAH", "Oekraïense hryvnia");
    result.put("UAK", "Oekraïense karbovanetz");
    result.put("UGS", "Oegandese shilling (1966-1987)");
    result.put("UGX", "Oegandese shilling");
    result.put("USD", "Amerikaanse dollar");
    result.put("USN", "Amerikaanse dollar (volgende dag)");
    result.put("USS", "Amerikaanse dollar (zelfde dag)");
    result.put("UYI", "Uruguayaanse peso en geïndexeerde eenheden");
    result.put("UYP", "Uruguayaanse peso (1975-1993)");
    result.put("UYU", "Uruguayaanse peso uruguayo");
    result.put("UZS", "Oezbekistaanse sum");
    result.put("VEB", "Venezolaanse bolivar");
    result.put("VEF", "Venezolaanse sterke bolivar");
    result.put("VND", "Vietnamese dong");
    result.put("VUV", "Vanuatuaanse vatu");
    result.put("WST", "West-Samoaanse tala");
    result.put("XAF", "CFA-franc BEAC");
    result.put("XAG", "Zilver");
    result.put("XAU", "Goud");
    result.put("XBA", "Europese samengestelde eenheid");
    result.put("XBB", "Europese monetaire eenheid");
    result.put("XBC", "Europese rekeneenheid (XBC)");
    result.put("XBD", "Europese rekeneenheid (XBD)");
    result.put("XCD", "Oost-Caribische dollar");
    result.put("XDR", "Special Drawing Rights");
    result.put("XEU", "European Currency Unit");
    result.put("XFO", "Franse gouden franc");
    result.put("XFU", "Franse UIC-franc");
    result.put("XOF", "CFA-franc BCEAO");
    result.put("XPD", "Palladium");
    result.put("XPF", "CFP-franc");
    result.put("XPT", "Platina");
    result.put("XRE", "RINET-fondsen");
    result.put("XTS", "Valutacode voor testdoeleinden");
    result.put("XXX", "Geen valuta");
    result.put("YDD", "Jemenitische dinar");
    result.put("YER", "Jemenitische rial");
    result.put("YUD", "Joegoslavische harde dinar");
    result.put("YUM", "Joegoslavische noviy-dinar");
    result.put("YUN", "Joegoslavische convertibele dinar");
    result.put("ZAL", "Zuid-Afrikaanse rand (financieel)");
    result.put("ZAR", "Zuid-Afrikaanse rand");
    result.put("ZMK", "Zambiaanse kwacha");
    result.put("ZRN", "Zaïrese nieuwe zaïre");
    result.put("ZRZ", "Zaïrese zaïre");
    result.put("ZWD", "Zimbabwaanse dollar");
    result.put("ZWL", "Zimbabwaanse dollar (2009)");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "Andorrese peseta",
      "AED": "Verenigde Arabische Emiraten-dirham",
      "AFA": "Afghani (1927-2002)",
      "AFN": "Afghaanse afghani",
      "ALL": "Albanese lek",
      "AMD": "Armeense dram",
      "ANG": "Nederlands-Antilliaanse gulden",
      "AOA": "Angolese kwanza",
      "AOK": "Angolese kwanza (1977-1990)",
      "AON": "Angolese nieuwe kwanza (1990-2000)",
      "AOR": "Angolese kwanza reajustado (1995-1999)",
      "ARA": "Argentijnse austral",
      "ARP": "Argentijnse peso (1983-1985)",
      "ARS": "Argentijnse peso",
      "ATS": "Oostenrijkse schilling",
      "AUD": "Australische dollar",
      "AWG": "Arubaanse gulden",
      "AZM": "Azerbeidzjaanse manat (1993-2006)",
      "AZN": "Azerbeidzjaanse manat",
      "BAD": "Bosnische dinar",
      "BAM": "Bosnische convertibele mark",
      "BBD": "Barbadaanse dollar",
      "BDT": "Bengalese taka",
      "BEC": "Belgische frank (convertibel)",
      "BEF": "Belgische frank",
      "BEL": "Belgische frank (financieel)",
      "BGL": "Bulgaarse harde lev",
      "BGN": "Bulgaarse nieuwe lev",
      "BHD": "Bahreinse dinar",
      "BIF": "Burundese franc",
      "BMD": "Bermuda-dollar",
      "BND": "Bruneise dollar",
      "BOB": "Boliviano",
      "BOP": "Boliviaanse peso",
      "BOV": "Boliviaanse mvdol",
      "BRB": "Braziliaanse cruzeiro novo (1967-1986)",
      "BRC": "Braziliaanse cruzado",
      "BRE": "Braziliaanse cruzeiro (1990-1993)",
      "BRL": "Braziliaanse real",
      "BRN": "Braziliaanse cruzado novo",
      "BRR": "Braziliaanse cruzeiro",
      "BSD": "Bahamaanse dollar",
      "BTN": "Bhutaanse ngultrum",
      "BUK": "Birmese kyat",
      "BWP": "Botswaanse pula",
      "BYB": "Wit-Russische nieuwe roebel (1994-1999)",
      "BYR": "Wit-Russische roebel",
      "BZD": "Belizaanse dollar",
      "CAD": "Canadese dollar",
      "CDF": "Congolese franc",
      "CHE": "WIR euro",
      "CHF": "Zwitserse franc",
      "CHW": "WIR franc",
      "CLF": "Chileense unidades de fomento",
      "CLP": "Chileense peso",
      "CNY": "Chinese yuan renminbi",
      "COP": "Colombiaanse peso",
      "COU": "Unidad de Valor Real",
      "CRC": "Costaricaanse colón",
      "CSD": "Oude Servische dinar",
      "CSK": "Tsjechoslowaakse harde koruna",
      "CUC": "Cubaanse convertibele peso",
      "CUP": "Cubaanse peso",
      "CVE": "Kaapverdische escudo",
      "CYP": "Cyprisch pond",
      "CZK": "Tsjechische koruna",
      "DDM": "Oost-Duitse ostmark",
      "DEM": "Duitse mark",
      "DJF": "Djiboutiaanse franc",
      "DKK": "Deense kroon",
      "DOP": "Dominicaanse peso",
      "DZD": "Algerijnse dinar",
      "ECS": "Ecuadoraanse sucre",
      "ECV": "Ecuadoraanse unidad de valor constante (UVC)",
      "EEK": "Estlandse kroon",
      "EGP": "Egyptisch pond",
      "ERN": "Eritrese nakfa",
      "ESA": "Spaanse peseta (account A)",
      "ESB": "Spaanse peseta (convertibele account)",
      "ESP": "Spaanse peseta",
      "ETB": "Ethiopische birr",
      "EUR": "Euro",
      "FIM": "Finse markka",
      "FJD": "Fiji dollar",
      "FKP": "Falklandeilands pond",
      "FRF": "Franse franc",
      "GBP": "Brits pond sterling",
      "GEK": "Georgische kupon larit",
      "GEL": "Georgische lari",
      "GHC": "Ghanese cedi (1979-2007)",
      "GHS": "Ghanese cedi",
      "GIP": "Gibraltarees pond",
      "GMD": "Gambiaanse dalasi",
      "GNF": "Guinese franc",
      "GNS": "Guinese syli",
      "GQE": "Equatoriaal-Guinese ekwele guineana",
      "GRD": "Griekse drachme",
      "GTQ": "Guatemalteekse quetzal",
      "GWE": "Portugees-Guinese escudo",
      "GWP": "Guinee-Bissause peso",
      "GYD": "Guyaanse dollar",
      "HKD": "Hongkongse dollar",
      "HNL": "Hondurese lempira",
      "HRD": "Kroatische dinar",
      "HRK": "Kroatische kuna",
      "HTG": "Haïtiaanse gourde",
      "HUF": "Hongaarse forint",
      "IDR": "Indonesische rupiah",
      "IEP": "Iers pond",
      "ILP": "Israëlisch pond",
      "ILS": "Israëlische nieuwe shekel",
      "INR": "Indiase rupee",
      "IQD": "Iraakse dinar",
      "IRR": "Iraanse rial",
      "ISK": "IJslandse kroon",
      "ITL": "Italiaanse lire",
      "JMD": "Jamaicaanse dollar",
      "JOD": "Jordaanse dinar",
      "JPY": "Japanse yen",
      "KES": "Keniaanse shilling",
      "KGS": "Kirgizische som",
      "KHR": "Cambodjaanse riel",
      "KMF": "Comorese franc",
      "KPW": "Noord-Koreaanse won",
      "KRW": "Zuid-Koreaanse won",
      "KWD": "Koeweitse dinar",
      "KYD": "Caymaneilandse dollar",
      "KZT": "Kazachstaanse tenge",
      "LAK": "Laotiaanse kip",
      "LBP": "Libanees pond",
      "LKR": "Srilankaanse rupee",
      "LRD": "Liberiaanse dollar",
      "LSL": "Lesothaanse loti",
      "LTL": "Litouwse litas",
      "LTT": "Litouwse talonas",
      "LUC": "Luxemburgse convertibele franc",
      "LUF": "Luxemburgse frank",
      "LUL": "Luxemburgse financiële franc",
      "LVL": "Letse lats",
      "LVR": "Letse roebel",
      "LYD": "Libische dinar",
      "MAD": "Marokkaanse dirham",
      "MAF": "Marokkaanse franc",
      "MDL": "Moldavische leu",
      "MGA": "Malagassische ariary",
      "MGF": "Malagassische franc",
      "MKD": "Macedonische denar",
      "MLF": "Malinese franc",
      "MMK": "Myanmarese kyat",
      "MNT": "Mongoolse tugrik",
      "MOP": "Macause pataca",
      "MRO": "Mauritaanse ouguiya",
      "MTL": "Maltese lire",
      "MTP": "Maltees pond",
      "MUR": "Mauritiaanse rupee",
      "MVR": "Maldivische rufiyaa",
      "MWK": "Malawische kwacha",
      "MXN": "Mexicaanse peso",
      "MXP": "Mexicaanse zilveren peso (1861-1992)",
      "MXV": "Mexicaanse unidad de inversion (UDI)",
      "MYR": "Maleisische ringgit",
      "MZE": "Mozambikaanse escudo",
      "MZM": "Oude Mozambikaanse metical",
      "MZN": "Mozambikaanse metical",
      "NAD": "Namibische dollar",
      "NGN": "Nigeriaanse naira",
      "NIC": "Nicaraguaanse córdoba",
      "NIO": "Nicaraguaanse córdoba oro",
      "NLG": "Nederlandse gulden",
      "NOK": "Noorse kroon",
      "NPR": "Nepalese rupee",
      "NZD": "Nieuw-Zeelandse dollar",
      "OMR": "Omaanse rial",
      "PAB": "Panamese balboa",
      "PEI": "Peruaanse inti",
      "PEN": "Peruaanse nieuwe sol",
      "PES": "Peruaanse sol",
      "PGK": "Papuaanse kina",
      "PHP": "Filipijnse peso",
      "PKR": "Pakistaanse rupee",
      "PLN": "Poolse zloty",
      "PLZ": "Poolse zloty (1950-1995)",
      "PTE": "Portugese escudo",
      "PYG": "Paraguayaanse guarani",
      "QAR": "Qatarese rial",
      "RHD": "Rhodesische dollar",
      "ROL": "Oude Roemeense leu",
      "RON": "Roemeense leu",
      "RSD": "Servische dinar",
      "RUB": "Russische roebel",
      "RUR": "Russische roebel (1991-1998)",
      "RWF": "Rwandese franc",
      "SAR": "Saoedische rial",
      "SBD": "Salomonseilandse dollar",
      "SCR": "Seychelse rupee",
      "SDD": "Soedanese dinar",
      "SDG": "Soedanese pond",
      "SDP": "Soedanees pond",
      "SEK": "Zweedse kroon",
      "SGD": "Singaporese dollar",
      "SHP": "Sint-Heleense pond",
      "SIT": "Sloveense tolar",
      "SKK": "Slowaakse koruna",
      "SLL": "Sierraleoonse leone",
      "SOS": "Somalische shilling",
      "SRD": "Surinaamse dollar",
      "SRG": "Surinaamse gulden",
      "STD": "Santomese dobra",
      "SUR": "Sovjet-roebel",
      "SVC": "Salvadoraanse colón",
      "SYP": "Syrisch pond",
      "SZL": "Swazische lilangeni",
      "THB": "Thaise baht",
      "TJR": "Tadzjikistaanse roebel",
      "TJS": "Tadzjikistaanse somoni",
      "TMM": "Turkmeense manat",
      "TMT": "Turkmeense nieuwe manat",
      "TND": "Tunesische dinar",
      "TOP": "Tongaanse paʻanga",
      "TPE": "Timorese escudo",
      "TRL": "Turkse lire",
      "TRY": "Nieuwe Turkse lire",
      "TTD": "Trinidad en Tobago-dollar",
      "TWD": "Nieuwe Taiwanese dollar",
      "TZS": "Tanzaniaanse shilling",
      "UAH": "Oekraïense hryvnia",
      "UAK": "Oekraïense karbovanetz",
      "UGS": "Oegandese shilling (1966-1987)",
      "UGX": "Oegandese shilling",
      "USD": "Amerikaanse dollar",
      "USN": "Amerikaanse dollar (volgende dag)",
      "USS": "Amerikaanse dollar (zelfde dag)",
      "UYI": "Uruguayaanse peso en geïndexeerde eenheden",
      "UYP": "Uruguayaanse peso (1975-1993)",
      "UYU": "Uruguayaanse peso uruguayo",
      "UZS": "Oezbekistaanse sum",
      "VEB": "Venezolaanse bolivar",
      "VEF": "Venezolaanse sterke bolivar",
      "VND": "Vietnamese dong",
      "VUV": "Vanuatuaanse vatu",
      "WST": "West-Samoaanse tala",
      "XAF": "CFA-franc BEAC",
      "XAG": "Zilver",
      "XAU": "Goud",
      "XBA": "Europese samengestelde eenheid",
      "XBB": "Europese monetaire eenheid",
      "XBC": "Europese rekeneenheid (XBC)",
      "XBD": "Europese rekeneenheid (XBD)",
      "XCD": "Oost-Caribische dollar",
      "XDR": "Special Drawing Rights",
      "XEU": "European Currency Unit",
      "XFO": "Franse gouden franc",
      "XFU": "Franse UIC-franc",
      "XOF": "CFA-franc BCEAO",
      "XPD": "Palladium",
      "XPF": "CFP-franc",
      "XPT": "Platina",
      "XRE": "RINET-fondsen",
      "XTS": "Valutacode voor testdoeleinden",
      "XXX": "Geen valuta",
      "YDD": "Jemenitische dinar",
      "YER": "Jemenitische rial",
      "YUD": "Joegoslavische harde dinar",
      "YUM": "Joegoslavische noviy-dinar",
      "YUN": "Joegoslavische convertibele dinar",
      "ZAL": "Zuid-Afrikaanse rand (financieel)",
      "ZAR": "Zuid-Afrikaanse rand",
      "ZMK": "Zambiaanse kwacha",
      "ZRN": "Zaïrese nieuwe zaïre",
      "ZRZ": "Zaïrese zaïre",
      "ZWD": "Zimbabwaanse dollar",
      "ZWL": "Zimbabwaanse dollar (2009)",
    };
  }-*/;
}