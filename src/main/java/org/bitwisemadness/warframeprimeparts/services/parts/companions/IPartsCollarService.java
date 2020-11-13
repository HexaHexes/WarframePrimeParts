package org.bitwisemadness.warframeprimeparts.services.parts.companions;

import org.bitwisemadness.warframeprimeparts.database.model.parts.companions.PartsCollar;

import java.util.List;

public interface IPartsCollarService {
    List<PartsCollar> findAll();

    List<PartsCollar> findByName(String name);

    PartsCollar findByNameByUser(String name, String appUser);

    void put (PartsCollar parts);

    void delete(String name, String appUser);


}
