package org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsDualSecondaryNoSingle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsDualSecondaryNoSingleRepository extends JpaRepository<PartsDualSecondaryNoSingle, String> {
    List<PartsDualSecondaryNoSingle> findByName(String name);

    Optional<PartsDualSecondaryNoSingle> findByNameByUser(String name, String appUser);
}
