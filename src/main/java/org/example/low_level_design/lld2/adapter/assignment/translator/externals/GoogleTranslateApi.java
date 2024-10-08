package org.example.low_level_design.lld2.adapter.assignment.translator.externals;

import java.util.List;

import static org.example.low_level_design.lld2.adapter.assignment.translator.externals.ApiUtils.logGoogleGetSupportedLanguages;
import static org.example.low_level_design.lld2.adapter.assignment.translator.externals.ApiUtils.logGoogleTranslate;


public class GoogleTranslateApi {

    public String convert(GoogleTranslationRequest request) {
        // Implementation for translating text using Google Translate API
        logGoogleTranslate();
        return "Translated text";
    }

    public List<String> getLanguages() {
        // Implementation for fetching supported languages from Google Translate
        logGoogleGetSupportedLanguages();
        return List.of("hindi", "marathi", "kannada");
    }
}