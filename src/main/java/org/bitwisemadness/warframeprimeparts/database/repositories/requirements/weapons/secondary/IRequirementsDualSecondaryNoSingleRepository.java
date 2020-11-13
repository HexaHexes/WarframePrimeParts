package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsDualSecondaryNoSingle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRequirementsDualSecondaryNoSingleRepository extends JpaRepository<RequirementsDualSecondaryNoSingle, String> {
    Optional<RequirementsDualSecondaryNoSingle> findByName(String name);
}
