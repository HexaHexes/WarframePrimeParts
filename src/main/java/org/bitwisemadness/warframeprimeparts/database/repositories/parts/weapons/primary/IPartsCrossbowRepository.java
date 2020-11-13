package org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary.PartsCrossbow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsCrossbowRepository extends JpaRepository<PartsCrossbow, String> {
    List<PartsCrossbow> findByName(String name);

    Optional<PartsCrossbow> findByNameByUser(String name, String appUser);
}
