package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsBallistica;

import java.util.List;

public interface IRequirementsBallisticaService {
    List<RequirementsBallistica> findAll();

    RequirementsBallistica findByName(String name);

    void put (RequirementsBallistica requirements);

    void putAll (List<RequirementsBallistica> requirements);

    void delete(String name);
}
