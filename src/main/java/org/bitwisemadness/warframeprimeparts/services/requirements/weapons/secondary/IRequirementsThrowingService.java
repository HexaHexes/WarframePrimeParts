package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsThrowing;

import java.util.List;

public interface IRequirementsThrowingService {
    List<RequirementsThrowing> findAll();

    RequirementsThrowing findByName(String name);

    void put (RequirementsThrowing requirements);

    void putAll (List<RequirementsThrowing> requirements);

    void delete(String name);
}
