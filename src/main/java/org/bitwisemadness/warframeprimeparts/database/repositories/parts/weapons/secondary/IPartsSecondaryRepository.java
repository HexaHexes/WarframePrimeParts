package org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsSecondary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsSecondaryRepository extends JpaRepository<PartsSecondary, String> {
    List<PartsSecondary> findByName(String name);

    Optional<PartsSecondary> findByNameByUser(String name, String appUser);
}
