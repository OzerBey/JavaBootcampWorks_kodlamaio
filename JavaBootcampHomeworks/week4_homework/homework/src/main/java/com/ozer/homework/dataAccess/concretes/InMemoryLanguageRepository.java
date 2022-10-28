package com.ozer.homework.dataAccess.concretes;

import com.ozer.homework.dataAccess.abstracts.ILanguageRepository;
import com.ozer.homework.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements ILanguageRepository {

    final List<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<>();
        languages.add(new Language(1, "Java"));
        languages.add(new Language(2, "C#"));
        languages.add(new Language(3, "Python"));
    }

    @Override
    public Language add(Language language) {
        languages.add(language);
        return language;
    }

    @Override
    public Language update(int id, Language language) {
        getAll().forEach((item) -> {
            if (item.getId() != id) {
                item.setName(language.getName());
            }
        });
        return language;
    }

    @Override
    public Language delete(int id) {
        for (Language item : languages) {
            if (item.getId() == id) {
                languages.remove(item);
                return item;
            }
        }
        return null;
    }

    @Override
    public Language getById(int id) {
        for (Language item : languages) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }
}
