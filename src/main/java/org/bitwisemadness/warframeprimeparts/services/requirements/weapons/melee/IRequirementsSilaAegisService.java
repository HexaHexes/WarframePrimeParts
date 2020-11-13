package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee.RequirementsSilvaAegis;

import java.util.List;

public interface IRequirementsSilaAegisService {
    List<RequirementsSilvaAegis> findAll();

    RequirementsSilvaAegis findByName(String name);

    void put (RequirementsSilvaAegis requirements);

    void putAll (List<RequirementsSilvaAegis> requirements);

    void delete(String name);
}
