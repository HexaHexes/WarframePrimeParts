package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsCrossbow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRequirementsCrossbowRepository extends JpaRepository<RequirementsCrossbow, String> {
    Optional<RequirementsCrossbow> findByName(String name);
}
