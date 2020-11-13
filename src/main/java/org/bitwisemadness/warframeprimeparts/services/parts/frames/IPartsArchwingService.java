package org.bitwisemadness.warframeprimeparts.services.parts.frames;

import org.bitwisemadness.warframeprimeparts.database.model.parts.frames.PartsArchwing;

import java.util.List;

public interface IPartsArchwingService {
    List<PartsArchwing> findAll();

    List<PartsArchwing> findByName(String name);

    PartsArchwing findByNameByUser(String name, String appUser);

    void put (PartsArchwing parts);

    void delete(String name, String appUser);
}
