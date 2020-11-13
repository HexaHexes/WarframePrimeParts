package org.bitwisemadness.warframeprimeparts.services.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee.PartsSilvaAegis;

import java.util.List;

public interface IPartsSilvaAegisService {
    List<PartsSilvaAegis> findAll();

    List<PartsSilvaAegis> findByName(String name);

    PartsSilvaAegis findByNameByUser(String name, String appUser);

    void put (PartsSilvaAegis parts);

    void delete(String name, String appUser);
}
