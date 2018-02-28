package com.coderbd.day26.Listing2;
import java.util.Locale;
import java.util.Arrays; 

class AvailableLocalesEnglish {
    public static void main(String []args) {
        Arrays.stream(Locale.getAvailableLocales()) 
		.filter(locale -> locale.getLanguage().equals("en")) 
		.forEach(locale -> 
			System.out.printf("Locale code: %s and it stands for %s %n", 
					locale, locale.getDisplayName()));
    }
}
