package org.bitwisemadness.warframeprimeparts.services.parts.frames;

import org.bitwisemadness.warframeprimeparts.database.model.parts.frames.PartsWarframe;

import java.util.List;

public interface IPartsWarframeService {
    List<PartsWarframe> findAll();

    List<PartsWarframe> findByName(String name);

    PartsWarframe findByNameByUser(String name, String appUser);

    void put (PartsWarframe parts);

    void delete(String name, String appUser);
}
