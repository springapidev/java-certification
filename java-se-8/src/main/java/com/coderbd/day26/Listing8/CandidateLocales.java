package com.coderbd.day26.Listing8;
import java.util.ResourceBundle;
import java.util.List;
import java.util.Locale;

// Extend ResourceBundle.Control and override getCandidateLocales method 
// to get the list of candidate locales that Java searches for 
class TalkativeResourceBundleControl extends ResourceBundle.Control {
    // override the default getCandidateLocales method to print 
    // the candidate locales first 
    public List<Locale> getCandidateLocales(String baseName, Locale locale) {
	List<Locale> candidateLocales = super.getCandidateLocales(baseName, locale);
System.out.printf("Candidate locales for base bundle name %s and locale %s %n", 
   	   	baseName, locale.getDisplayName());
	candidateLocales.forEach(System.out::println);
	return candidateLocales; 
    }
}

// Use a helper method loadResourceBundle to load a bundle given the bundle name and locale 
class CandidateLocales {
    public static void loadResourceBundle(String resourceBundleName, Locale locale) {
	// Pass an instance of TalkativeResourceBundleControl 
// to print candidate locales  
  	ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceBundleName, 
locale, new TalkativeResourceBundleControl());
	String rbLocaleName = resourceBundle.getLocale().toString();
	// if the resource bundle locale name is empty, 
// it means default property file 
	if(rbLocaleName.equals("")) {
System.out.println("Loaded the default property file with name: " 
+ resourceBundleName); 
	} else {
System.out.println("Loaded the resource bundle for the locale: " 
+ resourceBundleName + "." + rbLocaleName);
	}
   }

   public static void main(String[] args) {
// trace how ResourceBundle_it_IT_Rome.properties is resolved 
    	loadResourceBundle("ResourceBundle", new Locale("it", "IT", "Rome")); 
    }
}
