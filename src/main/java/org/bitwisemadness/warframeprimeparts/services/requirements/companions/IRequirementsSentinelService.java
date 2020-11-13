package org.bitwisemadness.warframeprimeparts.services.requirements.companions;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsSentinel;

import java.util.List;

public interface IRequirementsSentinelService {
    List<RequirementsSentinel> findAll();

    RequirementsSentinel findByName(String name);

    void put (RequirementsSentinel requirements);

    void delete(String name);
}
