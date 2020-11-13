package org.bitwisemadness.warframeprimeparts.services.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsBallistica;

import java.util.List;

public interface IPartsBallisticaService {
    List<PartsBallistica> findAll();

    List<PartsBallistica> findByName(String name);

    PartsBallistica findByNameByUser(String name, String appUser);

    void put (PartsBallistica parts);

    void delete(String name, String appUser);
}
