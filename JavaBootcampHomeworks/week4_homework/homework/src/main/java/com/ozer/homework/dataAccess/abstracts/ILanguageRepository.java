package com.ozer.homework.dataAccess.abstracts;

import com.ozer.homework.entities.concretes.Language;

import java.util.List;

public interface ILanguageRepository {

    Language add(Language language);

    Language update(int id, Language language);

    Language delete(int id);

    Language getById(int id);

    List<Language> getAll();
}
