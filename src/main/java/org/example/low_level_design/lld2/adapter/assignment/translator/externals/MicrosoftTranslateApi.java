package org.example.low_level_design.lld2.adapter.assignment.translator.externals;

import java.util.List;

import static org.example.low_level_design.lld2.adapter.assignment.translator.externals.ApiUtils.logMicrosoftGetSupportedLanguages;
import static org.example.low_level_design.lld2.adapter.assignment.translator.externals.ApiUtils.logMicrosoftTranslate;


public class MicrosoftTranslateApi {
    public String translate(String text, String sourceLanguage, String targetLanguage) {
        // Implementation for translating text using Microsoft Translator API
        logMicrosoftTranslate();
        return "Translated text";
    }

    // Method to retrieve the list of supported languages from Microsoft Translator
    public List<String> getSupportedLanguages() {
        // Implementation for fetching supported languages from Microsoft Translator
        logMicrosoftGetSupportedLanguages();
        return List.of("hindi", "marathi", "kannada");
    }
}