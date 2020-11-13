package org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary.PartsBow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsBowRepository extends JpaRepository<PartsBow, String> {
    List<PartsBow> findByName(String name);

    Optional<PartsBow> findByNameByUser(String name, String appUser);
}
