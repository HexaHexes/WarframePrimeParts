package org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee.PartsSilvaAegis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsSilvaAegisRepository extends JpaRepository<PartsSilvaAegis, String> {
    List<PartsSilvaAegis> findByName(String name);

    Optional<PartsSilvaAegis> findByNameByUser(String name, String appUser);
}
