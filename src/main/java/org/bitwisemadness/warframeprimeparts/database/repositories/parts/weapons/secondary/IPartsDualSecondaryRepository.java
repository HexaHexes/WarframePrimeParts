package org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsDualSecondary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsDualSecondaryRepository extends JpaRepository<PartsDualSecondary, String> {
    List<PartsDualSecondary> findByName(String name);

    Optional<PartsDualSecondary> findByNameByUser(String name, String appUser);
}
