package oop.seminars.s05.mvcstudentapp.model;

import oop.seminars.s05.mvcstudentapp.controller.Commands;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to create an instances of language items in MenuModel
 */
public class Language {
    private final String languageCode; //language identification
    private final Map<Commands, String> translations; //translated menu


    private static final Map<Integer,String> supportedLanguages;
    static {
        supportedLanguages = new HashMap<>();
        supportedLanguages.put(1,"ENG");
        supportedLanguages.put(2, "RU");
    }
    /**
     * Constructor of language type in current instance
     * @param languageCode Become a code of supported languages. Languages stored in local dictionary
     */
    public Language(String languageCode) {
        this.languageCode = languageCode;
        this.translations = new HashMap<>();
    }
    public static Map<Integer, String> getSupportedLanguages() {
        return supportedLanguages;
    }

    public void addTranslation(Commands menuOption, String translatedLabel) {
        translations.put(menuOption, translatedLabel);
    }

    public String getTranslatedLabel(Commands menuOption) {
        return translations.get(menuOption);
    }
    public Map<Commands, String> getWholeTranslatedMenu(){
        return this.translations;
    }
}